#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>
#include <sys/time.h>
#include <string.h>

// Estructura de datos para representar un resultado de búsqueda de vuelos
typedef struct {
    char tipoVuelo[20];
    int disponibilidad;
    double tiempoEjecucion;
} ResultadoVuelo;

// Función para obtener el tiempo actual en milisegundos
double obtenerTiempoActual() {
    struct timeval tv;
    gettimeofday(&tv, NULL);
    return tv.tv_sec * 1000 + tv.tv_usec / 1000.0;
}

// Función para simular la búsqueda de disponibilidad de vuelos de un tipo
void* buscarVuelo(void* arg) {
    char* tipoVuelo = (char*) arg;
    int disponibilidad = rand() % 2;  // Simulación de disponibilidad aleatoria

    // Crear un resultado de búsqueda de vuelos
    ResultadoVuelo* resultado = (ResultadoVuelo*) malloc(sizeof(ResultadoVuelo));
    strcpy(resultado->tipoVuelo, tipoVuelo);
    resultado->disponibilidad = disponibilidad;

    // Obtener el tiempo de ejecución del hilo
    resultado->tiempoEjecucion = obtenerTiempoActual();

    // Devolver el resultado
    pthread_exit(resultado);
}

int literal1(){

    pthread_t hilos[3];
    char tiposVuelo[3][20] = {"turista", "ejecutivo", "premium"};

    // Crear hilos para realizar la búsqueda de vuelos
    for (int i = 0; i < 3; i++) {
        pthread_create(&hilos[i], NULL, buscarVuelo, (void*) tiposVuelo[i]);
    }

    ResultadoVuelo* resultados[3];

    // Esperar a que los hilos terminen y obtener los resultados
    for (int i = 0; i < 3; i++) {
        pthread_join(hilos[i], (void**) &resultados[i]);
        double tiempoEjecucion = obtenerTiempoActual() - resultados[i]->tiempoEjecucion;
        resultados[i]->tiempoEjecucion = tiempoEjecucion;
    }

    // Imprimir los resultados de la búsqueda de vuelos
    for (int i = 0; i < 3; i++) {
        printf("Tipo de vuelo: %s, Disponibilidad: %d, Tiempo de ejecución: %.2f ms\n", resultados[i]->tipoVuelo, resultados[i]->disponibilidad, resultados[i]->tiempoEjecucion);
        free(resultados[i]);
    }
    return 0;
}
