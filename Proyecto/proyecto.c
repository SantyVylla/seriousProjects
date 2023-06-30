#include <stdio.h>
#include "literal1.c"
#include "literal2.c"
#include "literal3.c"

int main()
{
	int opcion;

	printf("Bienvenido al menu de la Aerolinea, disponemos de las siguientes opciones:\n");
	
	printf("1. Buscar vuelos\n");
	printf("2. Comprar boletos\n");
	printf("3. Reservar hoteles\n");
	printf("4. Salir\n");

	printf("Ingrese la opcion que desee: ");

	scanf("%i", &opcion);

	if( opcion == 1)
	{
		literal1();
	}
	if( opcion == 2)
        {
                literal2();
        }
	if( opcion == 3)
        {
                literal3();
        }
	if( opcion == 4)
        {
                exit(0);
        }
	return 0;
}
