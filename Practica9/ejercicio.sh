#!/bin/bash

function eleccionAlea()
{
    opciones=("piedra" "papel" "tijera")
    jugador2=${opciones[$((RANDOM % 3))]}
    echo "La compu eligió" $jugador2
}

function ganador()
{
    if [ "$jugador1" = "$jugador2" ]; then
        echo "Empate"
    elif [ "$jugador1" = "piedra" ] && [ "$jugador2" = "tijera" ]; then
        echo "Ganaste!!"
    elif [ "$jugador1" = "papel" ] && [ "$jugador2" = "piedra" ]; then
        echo "Ganaste!!"
    elif [ "$jugador1" = "tijera" ] && [ "$jugador2" = "papel" ]; then
        echo "Ganaste!!"
    else
        echo "Perdiste"
    fi
}

while true; do
    echo $(date) 
    echo "-----------------------------"
    echo "Elige piedra, papel o tijera"
    read jugador1
    eleccionAlea
    ganador "$jugador1" "$jugador2"
    echo "Siguiente partida en 5 minutos..."
    sleep 300
done
