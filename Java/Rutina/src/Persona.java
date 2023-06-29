public class Persona {
    private double nuevoPeso;
    private Dieta nuevaDieta;
    private int edad;
    private double peso;
    private double altura;
    private Dieta dieta;
    private PlanDeEjercicios planDeEjercicios;
    private Persona objetivo;

    public Persona(int edad, double peso, double altura, Dieta dieta) {
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.dieta = dieta;
    }

    public Persona(double nuevoPeso, Dieta nuevaDieta) {
        this.nuevoPeso = nuevoPeso;
        this.nuevaDieta = nuevaDieta;
    }

    public void asignarPlanDeEjercicios(PlanDeEjercicios planDeEjercicios) {
        this.planDeEjercicios = planDeEjercicios;
    }

    public void realizarPlan(Día día) {
        if (existeUnPlan(día)) {
            System.out.println("Realizando plan de ejercicios para el día: " + día);
            Rutina rutina = planDeEjercicios.getRutina();
            System.out.println("Rutina de ejercicios:");
            System.out.println("Series: " + rutina.getSeries());
            System.out.println("Repeticiones: " + rutina.getRepeticiones());
            System.out.println("Descanso: " + rutina.getDescanso());
            System.out.println("Intensidad: " + rutina.getIntensidad());
            System.out.println("Ejercicios:");
            for (Ejercicio ejercicio : rutina.getEjercicios()) {
                System.out.println("- " + ejercicio.getNombre());
            }
            // Lógica para realizar la rutina de ejercicios específica
        } else {
            System.out.println("No hay plan de ejercicios para el día: " + día);
        }
    }


    private boolean existeUnPlan(Día día) {
        return planDeEjercicios != null && planDeEjercicios.getHorario().getDía() == día;
    }

    public void verificarAvances() {
        if (objetivo == null) {
            System.out.println("No se han establecido objetivos.");
        } else {
            System.out.println("Verificando avances...");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (peso <= objetivo.getPeso()) {
                System.out.println("¡Felicidades! Has logrado tu objetivo.");
            } else {
                System.out.println("¡Sigue así! Estás cerca de lograr tu objetivo.");
            }
        }
    }

    public void establecerObjetivo(Persona objetivo) {
        this.objetivo = objetivo;
    }

    public double getPeso() {
        return peso;
    }


}
