#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>
#include <unistd.h>
#include <time.h>
#include <sys/types.h>
#include <sys/wait.h>

int literal3(){

void *reservaHotel(void *arg) {
    char *mensaje = (char *)arg;
    time_t inicio = time(NULL); // Obtener el tiempo de inicio

    printf("[Proceso %d] %s\n", getpid(), mensaje);

    // Simular una demora aleatoria de 1 a 5 segundos
    srand(time(NULL));
    int demora = rand() % 5 + 1;
    sleep(demora);

    time_t fin = time(NULL); // Obtener el tiempo de finalización
    double tiempoEjecucion = difftime(fin, inicio); // Calcular el tiempo de ejecución
    printf("[Proceso %d] Tiempo de ejecución: %.2f segundos\n", getpid(), tiempoEjecucion);

    pthread_exit(NULL);
}

    pid_t pid1, pid2, pid3;
    char *mensaje1 = "Reservando hotel 1 'Quito-Hotel Quito'";
    char *mensaje2 = "Reservando hotel 2 'Quito-Hotel Swissotel'";
    char *mensaje3 = "Reservando hotel 3 'Quito-Hotel Hilton Colon'";

    pid1 = fork();
    if (pid1 == 0) {
        // Proceso hijo 1
        reservaHotel((void *)mensaje1);
        exit(0);
    }

    pid2 = fork();
    if (pid2 == 0) {
        // Proceso hijo 2
        reservaHotel((void *)mensaje2);
        exit(0);
    }

    pid3 = fork();
    if (pid3 == 0) {
        // Proceso hijo 3
        reservaHotel((void *)mensaje3);
        exit(0);
    }

    // Proceso padre espera la finalización de los hijos
    waitpid(pid1, NULL, 0);
    waitpid(pid2, NULL, 0);
    waitpid(pid3, NULL, 0);

    return 0;
}
