#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>
#include <sys/time.h>
#include <unistd.h>

int literal3()
{

typedef struct {
    char* nombre;
    char* hora;
    float precio;
    char* horaCompra;
} Vuelo;

void* comprarBoleto(void* arg) {
    Vuelo* vuelo = (Vuelo*)arg;
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

    printf("Boleto comprado exitosamente.\n");
    printf("Tiempo de ejecución del hilo: %.2f ms\n", tiempoEjecucion);
    pthread_exit(NULL);
}

    pthread_t hilos[3];
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

    // Crear los hilos para la compra de boletos
    for (int i = 0; i < 3; i++) {
        if (pthread_create(&hilos[i], NULL, comprarBoleto, (void*)&vuelos[i]) != 0) {
            fprintf(stderr, "Error al crear el hilo %d\n", i);
            exit(1);
        }
    }

    // Esperar a que todos los hilos terminen
    for (int i = 0; i < 3; i++) {
        if (pthread_join(hilos[i], NULL) != 0) {
            fprintf(stderr, "Error al esperar por el hilo %d\n", i);
            exit(1);
        }
    }
	return 0;
}
