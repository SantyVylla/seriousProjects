#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/wait.h>
#include <sys/time.h>


int literal1(){
// Estructura de datos para representar un resultado de búsqueda de vuelos
typedef struct {
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
void buscarVuelo(char* tipoVuelo, ResultadoVuelo* resultado) {
    int disponibilidad = rand() % 2;  // Simulación de disponibilidad aleatoria (0 o 1)

    resultado->disponibilidad = disponibilidad;

    // Obtener el tiempo de ejecución del proceso
    resultado->tiempoEjecucion = obtenerTiempoActual();
}

    pid_t procesos[3];
    char tiposVuelo[3][20] = {"turista", "ejecutivo", "premium"};

    ResultadoVuelo* resultados[3];
    double tiempoTotal = 0.0;

    // Ejecutar el proceso de búsqueda 50 veces
    for (int iteracion = 1; iteracion <= 50; iteracion++) {
        printf("Iteración %d:\n", iteracion);

        // Crear procesos para realizar la búsqueda de vuelos
        for (int i = 0; i < 3; i++) {
            resultados[i] = (ResultadoVuelo*)malloc(sizeof(ResultadoVuelo));
            procesos[i] = fork();

            if (procesos[i] == 0) {
                // Proceso hijo
                buscarVuelo(tiposVuelo[i], resultados[i]);
                exit(0);
            } else if (procesos[i] < 0) {
                // Error al crear el proceso hijo
                fprintf(stderr, "Error al crear el proceso hijo.\n");
                exit(1);
            }
        }

        // Esperar a que los procesos hijos terminen y obtener los resultados
        for (int i = 0; i < 3; i++) {
            int status;
            waitpid(procesos[i], &status, 0);

            if (WIFEXITED(status) && WEXITSTATUS(status) == 0) {
                double tiempoEjecucion = obtenerTiempoActual() - resultados[i]->tiempoEjecucion;
                resultados[i]->tiempoEjecucion = tiempoEjecucion;
                tiempoTotal += tiempoEjecucion;
            } else {
                fprintf(stderr, "Error en el proceso hijo.\n");
            }
        }

        // Imprimir los resultados de la búsqueda de vuelos
        for (int i = 0; i < 3; i++) {
            printf("Tipo de vuelo: %s, Disponibilidad: %d, Tiempo de ejecución: %.2f ms\n", tiposVuelo[i], ((resultados[i]->disponibilidad)%2)+1 , resultados[i]->tiempoEjecucion);
            free(resultados[i]);
        }

        printf("\n");
    }

    printf("Tiempo total de ejecución de las 50 iteraciones: %.2f ms\n", tiempoTotal);

    return 0;
}
