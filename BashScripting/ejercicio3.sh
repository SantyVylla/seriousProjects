#!/bin/bash
mostrarMenu(){
	cat << EOF
---------------------
1. Crear un directorio.
2. Crear un archivo.
3. Borrar un archivo.
4. Listar un directorio.
5. Buscar un archivo.
6. Limpiar pantalla
7. Salir
---------------------
EOF
	read -p "Elija una opción: " OPCION
	realizarOperacion "$OPCION"
}
realizarOperacion(){
	case $1 in
		1)
			read -p "Escriba la ruta: " RUTA
			read -p "Ahora el nombre del directorio: " NOMBRE
			mkdir $RUTA/$NOMBRE
			;;
		2)
			read -p "Escriba la ruta: " RUTA
			read -p "Ahora el nombre del archivo: " NOMBRE
			touch $RUTA/$NOMBRE
			;;
		3)
			read -p "Escriba el lugar del archivo: " RUTA
			read -p "Y su nombre: " NOMBRE
			rm $RUTA/$NOMBRE
			;;
		4)
			read -p "Lugar: " RUTA
			read -p "Directorio: " NOMBRE
			ls -l $RUTA/$NOMBRE
			;;
		5)
			read -p "En donde busco: " RUTA
			read -p "Qué busco? " ARCHIVO
			find $RUTA -name $ARCHIVO
			;;
		6)
			echo "Limpiando la pantalla..."
			sleep 2
			clear
			;;
		7)
			echo "Saliendo..."
			;;
	esac
}

mostrarMenu 


