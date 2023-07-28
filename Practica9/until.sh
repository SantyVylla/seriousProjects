#!/bin/bash
cont=5
until [ $cont -lt 1 ];
do
    echo Vuelta numero: $cont
    let cont=cont-1
done