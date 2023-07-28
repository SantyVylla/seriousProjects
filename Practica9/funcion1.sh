#!/bin/bash

function suma()
{
    local a=$1
    local b=$2
    echo $(($a+$b))
}
suma 2 3