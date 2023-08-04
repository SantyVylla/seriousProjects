public class Rutina {
    private Ejercicio[] ejercicios;
    private int series;
    private int repeticiones;
    private int descanso;
    private Intensidad intensidad;

    public Rutina(int series, int repeticiones, int descanso, Intensidad intensidad, Ejercicio... ejercicios) {
        this.ejercicios = ejercicios;
        this.series = series;
        this.repeticiones = repeticiones;
        this.descanso = descanso;
        this.intensidad = intensidad;
    }

    // Getters y setters
    public Ejercicio[] getEjercicios() {
        return ejercicios;
    }

    public void setEjercicios(Ejercicio[] ejercicios) {
        this.ejercicios = ejercicios;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getRepeticiones() {
        return repeticiones;
    }

    public void setRepeticiones(int repeticiones) {
        this.repeticiones = repeticiones;
    }

    public int getDescanso() {
        return descanso;
    }

    public void setDescanso(int descanso) {
        this.descanso = descanso;
    }

    public Intensidad getIntensidad() {
        return intensidad;
    }

    public void setIntensidad(Intensidad intensidad) {
        this.intensidad = intensidad;
    }
}

