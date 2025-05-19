package healthcalc;

public class CalcAdapter implements HealthHospital {

    private HealthCalc calculadora;

    public CalcAdapter(HealthCalc calculadora) {
        this.calculadora = calculadora;
    }


    @Override
    public double bmr(char genero, int edad, float altura, int peso) throws Exception {
        int alturaint= (int) (altura*100);
        float pesoFloat= (float) (peso/1000f);
        float resultado=calculadora.basalMetabolicRate(pesoFloat, alturaint, edad, genero);
        return resultado;
 
    }
    @Override
    public int pesoIdeal(char genero, float altura) throws Exception {
        int alturaint= (int) altura;
        float resultado=calculadora.idealWeight(alturaint, genero);
        return (int) resultado;
    }

    
}
