#!/bin/bash
echo "Escriba s o S para Sí, n o N para no, o cualquier letra"
read opcion
case $opcion in
    s|S)
        echo "pulso la opcion SI"
    ;;
    n|N)
        echo "pulso la opcion NO"
    ;;
    *)
        echo "Usted está indeciso"
    ;;
esac 