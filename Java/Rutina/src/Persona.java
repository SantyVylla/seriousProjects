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
            // Lógica para verificar los avances y mostrarlos por pantalla
        }
    }

    public void establecerObjetivo(Persona objetivo) {
        this.objetivo = objetivo;
    }

    // Getters y setters
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Dieta getDieta() {
        return dieta;
    }

    public void setDieta(Dieta dieta) {
        this.dieta = dieta;
    }

    public PlanDeEjercicios getPlanDeEjercicios() {
        return planDeEjercicios;
    }

    public void setPlanDeEjercicios(PlanDeEjercicios planDeEjercicios) {
        this.planDeEjercicios = planDeEjercicios;
    }

    public Persona getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(Persona objetivo) {
        this.objetivo = objetivo;
    }
}
