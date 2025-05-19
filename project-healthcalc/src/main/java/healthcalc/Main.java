package healthcalc;


    // TODO code application logic here

public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        HealthCalc c1 = HealthCalcImpl.getInstancia();
        HealthHospital c= new CalcAdapter(c1);

        try {
            double bmr = c.bmr('m', 25, 180f, 75);
            int pesoIdeal = c.pesoIdeal('m', 180f);
            System.out.println("BMR: " + bmr);
            System.out.println("Peso ideal: " + pesoIdeal);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }


    }
    
}

