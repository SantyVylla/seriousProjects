#include <stdio.h>
#include <stdlib.h>

int main() {
    while (1)
    {
        int *ptr=malloc(1024);
        if (ptr == NULL)
        {
            printf("No se puede asignar memoria\n");
            return EXIT_FAILURE;
        }
        *ptr = 5;
        printf("El valor es %d\n", *ptr);
        free(ptr);
    }
}