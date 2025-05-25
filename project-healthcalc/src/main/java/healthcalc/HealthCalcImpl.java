package healthcalc;

public class HealthCalcImpl implements HealthCalc {

    private static HealthCalcImpl instancia;

    private HealthCalcImpl() {
    }

    public static HealthCalcImpl getInstancia() {
        if (instancia == null) {
            instancia = new HealthCalcImpl();
        }
        return instancia;
    }

    @Override
    public float idealWeight(CardiovascularMetrics cardio, Persona persona) throws Exception {

        return (float) cardio.getIdealBodyWeight(persona);
       
        }
        


    @Override
    public float basalMetabolicRate(MetabolicMetrics metabolic, Persona persona) throws Exception {

        return (float) metabolic.basalMetabolicRate(persona);

    }



}

