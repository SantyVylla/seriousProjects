#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>
#include <unistd.h>
#include <time.h>

int literal2()
{
void *reservaHotel(void *arg) {
    char *mensaje = (char *)arg;
    time_t inicio = time(NULL); // Obtener el tiempo de inicio

    printf("%s\n", mensaje);

    // Simular una demora aleatoria de 1 a 5 segundos
    srand(time(NULL));
    int demora = rand() % 5 + 1;
    sleep(demora);

    time_t fin = time(NULL); // Obtener el tiempo de finalización
    double tiempoEjecucion = difftime(fin, inicio); // Calcular el tiempo de ejecución
    printf("Tiempo de ejecución: %.2f segundos\n", tiempoEjecucion);

    pthread_exit(NULL);
}

    pthread_t hilo1, hilo2, hilo3;
    char *mensaje1 = "Reservando hotel 1 'Quito-Hotel Quito'";
    char *mensaje2 = "Reservando hotel 2 'Quito-Hotel Swissotel'";
    char *mensaje3 = "Reservando hotel 3 'Quito-Hotel Hilton Colon'";

    pthread_create(&hilo1, NULL, reservaHotel, (void *)mensaje1);
    pthread_create(&hilo2, NULL, reservaHotel, (void *)mensaje2);
    pthread_create(&hilo3, NULL, reservaHotel, (void *)mensaje3);

    pthread_join(hilo1, NULL);
    pthread_join(hilo2, NULL);
    pthread_join(hilo3, NULL);
    	return 0;
    }
