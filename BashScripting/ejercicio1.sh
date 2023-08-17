#!/bin/bash

crearOpcionAleatoria(){
    LIST=("piedra" "papel" "tijera")
    ELECCION=$((RANDOM % 3))
    echo "${LIST[$ELECCION]}"
}

elegirGanador(){
    if [ "$1" = "$2" ]; then
		echo "Es un empate"
    elif [ "$1" = "papel" ] && [ "$2" = "piedra" ]; then
        echo "Ganaste!!!"
    elif [ "$1" = "piedra" ] && [ "$2" = "tijera" ]; then
        echo "Ganaste!!!"
    elif [ "$1" = "tijera" ] && [ "$2" = "papel" ]; then
        echo "Ganaste!!!"
    else
        echo "Perdiste :("
    fi
}

esperar(){
	cat << EOF
------Siguiente partida en 5 minutos--------
EOF
	sleep 300
	jugar
}

jugar(){
    read -p "Piedra, Papel o Tijera!! " ELECCIONPERSONA
    ELECCIONCOMPUTADORA=$(crearOpcionAleatoria)
    echo "La compu eligió $ELECCIONCOMPUTADORA"
    elegirGanador "$ELECCIONPERSONA" "$ELECCIONCOMPUTADORA"
    esperar
}

jugar

