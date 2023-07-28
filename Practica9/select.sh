#!/bin/bash
select elecccion in op1 op2 op3
do
    if [ $elecccion ];
    then
        echo "Opcion elegida $elecccion"
        break
    else
        echo "Elección incorrecta"
    fi
done
