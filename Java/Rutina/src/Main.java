public class Main {
    public static void main(String[] args) {
        Ejercicio[] ejercicios = {
                new Ejercicio("Burpees", "Piernas"),
                new Ejercicio("Flexiones de pecho", "Pecho y brazos"),
                new Ejercicio("Mountain climbers", "Abdomen"),
                new Ejercicio("Sentadillas", "Gluteos y piernas")
        };

        Persona pepe = new Persona(14, 65.0, 1.75, new Dieta("Comida chatarra"));
        pepe.asignarPlanDeEjercicios(new PlanDeEjercicios(
                new Rutina(4, 12, 15, Intensidad.BAJA, ejercicios[0], ejercicios[1]),
                new Horario(Día.LUNES, "8:00", "10:00")
        ));

        pepe.realizarPlan(Día.LUNES); //que ejercicios está haciendo
        pepe.realizarPlan(Día.MARTES); //no hay plan en ese día

        pepe.verificarAvances(); //No ha puesto objetivos

        pepe.establecerObjetivo(new Persona(
                60.0, new Dieta("Comida vegetariana")
        ));

        pepe.verificarAvances();//imprimir que pasó
    }
}