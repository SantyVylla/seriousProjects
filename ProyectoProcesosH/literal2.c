#include <stdio.h>
#include <stdlib.h>
#include <sys/time.h>
#include <unistd.h>
#include <sys/wait.h>

int literal2(){

typedef struct {
    char* nombre;
    char* hora;
    float precio;
    char* horaCompra;
} Vuelo;

void comprarBoleto(Vuelo* vuelo) {
    printf("Comprando boleto para el vuelo: %s\n", vuelo->nombre);
    printf("Hora de vuelo: %s\n", vuelo->hora);
    printf("Precio del boleto: %.2f\n", vuelo->precio);
    printf("Hora de compra: %s\n", vuelo->horaCompra);
    printf("\n");

    // Obtener el tiempo actual antes de realizar la compra
    struct timeval inicio, fin;
    gettimeofday(&inicio, NULL);

    // Simular la compra del boleto
    // En este caso, simplemente esperamos 2 segundos
    sleep(2);

    // Obtener el tiempo actual después de realizar la compra
    gettimeofday(&fin, NULL);

    // Calcular el tiempo de ejecución en milisegundos
    double tiempoEjecucion = (fin.tv_sec - inicio.tv_sec) * 1000.0;  // segundos a milisegundos
    tiempoEjecucion += (fin.tv_usec - inicio.tv_usec) / 1000.0;     // microsegundos a milisegundos

    printf("Boleto comprado exitosamente.");
    printf("Tiempo de ejecución del proceso: %.2f ms\n", tiempoEjecucion);
}

    pid_t pids[3];
    Vuelo vuelos[3];

    // Definir los datos de cada vuelo
    vuelos[0].nombre = "Vuelo 1";
    vuelos[0].hora = "10:00";
    vuelos[0].precio = 150.0;
    vuelos[0].horaCompra = "09:30";

    vuelos[1].nombre = "Vuelo 2";
    vuelos[1].hora = "12:30";
    vuelos[1].precio = 200.0;
    vuelos[1].horaCompra = "12:00";

    vuelos[2].nombre = "Vuelo 3";
    vuelos[2].hora = "15:45";
    vuelos[2].precio = 180.0;
    vuelos[2].horaCompra = "15:15";

    // Crear los procesos para la compra de boletos
    for (int i = 0; i < 3; i++) {
        pids[i] = fork();
        if (pids[i] < 0) {
            fprintf(stderr, "Error al crear el proceso %d\n", i);
            exit(1);
        } else if (pids[i] == 0) {
            // Proceso hijo
            comprarBoleto(&vuelos[i]);
            exit(0);
        }
    }

    // Esperar a que todos los procesos hijos terminen
    for (int i = 0; i < 3; i++) {
        int status;
        if (waitpid(pids[i], &status, 0) == -1) {
            fprintf(stderr, "Error al esperar por el proceso %d\n", i);
            exit(1);
        }
        if (WIFEXITED(status)) {
            printf("Proceso hijo %d terminado con estado: %d\n", i, WEXITSTATUS(status));
        }
    }

    return 0;
}
