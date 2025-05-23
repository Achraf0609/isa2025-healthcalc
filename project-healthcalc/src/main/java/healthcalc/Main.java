package healthcalc;

public class Main {
    public static void main(String[] args) {
        try {
            // Crear una persona de prueba
            Persona persona = new Persona(70.0f, 180.0f, 20, Gender.MALE);

            // Crear instancias de las clases que calculan métricas
            CardiovascularMetrics cardio = new CardiovascularMetrics();
            MetabolicMetrics metabolic = new MetabolicMetrics();

            // Calcular peso ideal
            double pesoIdeal = cardio.getIdealBodyWeight(persona);
            System.out.println("Peso ideal: " + pesoIdeal + " kg");

            // Calcular tasa metabólica basal
            double bmr = metabolic.basalMetabolicRate(persona);
            System.out.println("Tasa Metabólica Basal (BMR): " + bmr + " kcal/día");

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    
    }
}


