#!/bin/bash

function realizar_operacion() {
    local num1=$1
    local num2=$2
    local operacion=$3
    local resultado=0

    case $operacion in
        suma)
            resultado=$((num1 + num2))
            ;;
        resta)
            resultado=$((num1 - num2))
            ;;
        multiplicacion)
            resultado=$((num1 * num2))
            ;;
        division)
            if [ $num2 -eq 0 ]; then
                echo "Error: No se puede dividir por cero."
                exit 1
            fi
            resultado=$(bc <<< "scale=2; $num1 / $num2")
            ;;
        *)
            echo "Operación inválida. Las operaciones válidas son: suma, resta, multiplicacion y division."
            exit 1
            ;;
    esac

    echo "Resultado: $resultado"
    echo "Puede usar este resultado en la siguiente operación."
}

# Función para pedir al usuario los números y la operación
function obtener_datos() {
    read -p "Ingrese el primer número: " num1
    read -p "Ingrese el segundo número: " num2
    read -p "Ingrese la operación (suma, resta, multiplicacion, division): " operacion

    realizar_operacion $num1 $num2 $operacion
}

# Bucle principal que se ejecuta cada 0.5 minutos
while true; do
    obtener_datos
    sleep 30
done
