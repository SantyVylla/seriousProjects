#!/bin/bash
echo "Escriba un número del 1 al 10"
read x
    case $x in 
    1)
        echo "Escribió uno"
    ;;
    2)
        echo "Escribió dos"
    ;;
    *)
        echo "Me rindo"
    ;;
esac  