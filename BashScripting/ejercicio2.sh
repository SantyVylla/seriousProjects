#!/bin/bash
calcular(){
	case $3 in
		sumar)
			SUMA=$(("$1" + "$2"))
			echo $SUMA
			;;
		restar)
			RESTA=$(("$1" - "$2"))
			echo $RESTA
			;;
		multiplicar)
	       	MULTIPLICACION=$(("$1" * "$2"))
			echo $MULTIPLICACION
			;;
		dividir)
			DIVISION=$(echo "scale=2; $1 / $2" | bc)
			echo $DIVISION
			;;
		*)
			echo "No encontré la operación"
			;;
	esac
}
esDenominadorVálido(){
	if [ "$1" -eq 0 ]; then
		return 1
	else
		return 0
	fi
}
iniciarCalculadora(){
	read -p "Escriba un número: " PRIMERNUMERO
	read -p "Escriba otro: " SEGUNDONUMERO
	read -p "Ahora la operación (sumar/restar/multiplicar/dividir): " OPERACION
	if esDenominadorVálido "$SEGUNDONUMERO" ; then
		RESULTADO=$(calcular "$PRIMERNUMERO" "$SEGUNDONUMERO" "$OPERACION")
		sleep 30
		echo "El resultado es $RESULTADO"
		read -p "Escriba otro número para trabajar: " OTRONUMERO
		read -p "Y una nueva operación: " SIGUIENTEOPERACION
		if esDenominadorVálido "$OTRONUMERO"; then
			NUEVORESULTADO=$(calcular "$RESULTADO" "$OTRONUMERO" "$SIGUIENTEOPERACION")
			echo "El resultado es $NUEVORESULTADO"
		else
			echo "Denominador inválido"
		fi
	else 
		echo "Denominador Inválido"
	fi
}

iniciarCalculadora
