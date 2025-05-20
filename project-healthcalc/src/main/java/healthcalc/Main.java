package healthcalc;

public class Main {
    public static void main(String[] args) throws Exception {
        HealthCalc c = HealthCalcImpl.getInstancia();
        HealthHospital ac= new CalcAdapter(c);
        HealthProxy p= new HealthProxy(ac);

        // Probar el adapter

        try {
            double bmr = ac.bmr('m', 20, 1.8f, 70000);
            int pesoIdeal = ac.pesoIdeal('m', 1.8f);
            System.out.println("BMR: " + bmr);
            System.out.println("Peso ideal: " + pesoIdeal+"kg");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Probar el proxy
        try {
            double bmr = p.bmr('m', 20, 1.8f, 70000);
            int pesoIdeal = p.pesoIdeal('m', 1.8f);
            double bmr2 = p.bmr('w', 20, 1.6f, 50000);
            int pesoIdeal2 = p.pesoIdeal('w', 1.6f);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Altura media: " + p.alturaMedia()+" m");
        System.err.println("Peso medio: " + p.pesoMedio()+" kg");


        // Probar el decorador 

        HealthHospital calculadoraUsa_EN= new Ingles(new USA(ac));
        HealthHospital calculadoraEU_ES= new Espanol(new EU(ac));
        calculadoraUsa_EN.bmr('m', 20, 1.8f, 70000);
        calculadoraEU_ES.bmr('m', 20, 1.8f, 70000);



    }
    
}

