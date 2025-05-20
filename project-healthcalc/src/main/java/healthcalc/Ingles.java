package healthcalc;

public class Ingles extends IdiomaDecorator {
    public Ingles(HealthHospital wrappe) {
        super(wrappe);
    }

    public double bmr(char genero, int edad, float altura, int peso) throws Exception {
        double resultado= wrappee.bmr(genero, edad, altura, peso);
        System.out.println("The person with height "+ altura*3.28084+ " feet and weight "+ (peso/1000)*2.20462+ " pounds has a BMR of"+ resultado);
        return resultado;
    }

    public int pesoIdeal(char genero, float altura) throws Exception {
        int resultado= wrappee.pesoIdeal(genero, altura);
        return resultado;

    }

    
}
