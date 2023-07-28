#!/bin/bash
while true
do
    echo "Hoy es $(date)"
    echo "Existen `ps aux|wc -l` procesos"
    sleep 60
done 