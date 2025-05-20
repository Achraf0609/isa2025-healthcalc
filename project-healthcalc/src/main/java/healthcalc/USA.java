package healthcalc;

public class USA extends RegionDecorator {
    public USA(HealthHospital wrappee) {
        super(wrappee);
    }

    @Override
    public double bmr(char genero, int edad, float altura, int peso) throws Exception {
        float alturaMetros= altura*0.3048f;
        int pesoKg= (int) (peso*453.592f);
        double resultado= wrappee.bmr(genero, edad, alturaMetros, pesoKg);
        return resultado;
    }

    @Override
    public int pesoIdeal(char genero, float altura) throws Exception {
        float alturaMetros= altura*0.3048f;
        int resultado= wrappee.pesoIdeal(genero, alturaMetros);
        return resultado;

    }
    
}
