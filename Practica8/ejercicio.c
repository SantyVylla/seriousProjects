#include <stdio.h>
#include <stdlib.h>

int main() {
    int numLetras;
    char *palabra;

    printf("Ingrese el número de letras de la palabra: ");
    scanf("%d", &numLetras);

    palabra = (char*) malloc((numLetras + 1) * sizeof(char));  // Reserva de memoria para la palabra

    if (palabra == NULL) {
        printf("No se pudo asignar memoria\n");
        return EXIT_FAILURE;
    }

    printf("Ingrese la palabra: ");
    scanf("%s", palabra);

    printf("La palabra ingresada es: %s\n", palabra);

    free(palabra);  // Liberar la memoria asignada

    return 0;
}
