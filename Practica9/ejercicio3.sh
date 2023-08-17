#!/bin/bash

# Función para crear un directorio
crear_directorio() {
    read -p "Ingrese la ruta del directorio a crear: " ruta
    mkdir -p "$ruta"
    echo "Directorio creado en $ruta"
}

# Función para crear un archivo
crear_archivo() {
    read -p "Ingrese la ruta del directorio donde crear el archivo: " ruta
    read -p "Ingrese el nombre del archivo a crear: " nombre
    touch "$ruta/$nombre"
    echo "Archivo creado en $ruta/$nombre"
}

# Función para borrar un archivo
borrar_archivo() {
    read -p "Ingrese la ruta del archivo a borrar: " ruta
    rm -i "$ruta"
    echo "Archivo borrado en $ruta"
}

# Función para listar un directorio
listar_directorio() {
    read -p "Ingrese la ruta del directorio a listar: " ruta
    ls "$ruta"
}

# Función para buscar un archivo
buscar_archivo() {
    read -p "Ingrese el nombre del archivo a buscar: " nombre
    find / -name "$nombre" 2>/dev/null
}

# Limpiar la pantalla
limpiar_pantalla() {
    clear
}

# Loop principal
while true; do
    clear
    echo "Menú:"
    echo "1. Crear un directorio"
    echo "2. Crear un archivo"
    echo "3. Borrar un archivo"
    echo "4. Listar un directorio"
    echo "5. Buscar un archivo"
    echo "6. Limpiar pantalla"
    echo "7. Salir"
    
    read -p "Seleccione una opción: " opcion
    
    case $opcion in
        1) crear_directorio ;;
        2) crear_archivo ;;
        3) borrar_archivo ;;
        4) listar_directorio ;;
        5) buscar_archivo ;;
        6) limpiar_pantalla ;;
        7) exit ;;
        *) echo "Opción inválida, por favor seleccione una opción válida." ;;
    esac
    
    sleep 600  # Esperar 10 minutos
done
