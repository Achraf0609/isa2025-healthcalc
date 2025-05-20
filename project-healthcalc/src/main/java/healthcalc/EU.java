package healthcalc;

public class EU extends RegionDecorator {
    public EU(HealthHospital wrappe) {
        super(wrappe);
    }

    @Override
    public double bmr(char genero, int edad, float altura, int peso) throws Exception {
        return wrappee.bmr(genero, edad, altura, peso);
    }

    @Override
    public int pesoIdeal(char genero, float altura) throws Exception {
        return wrappee.pesoIdeal(genero, altura);
    }
    
}
