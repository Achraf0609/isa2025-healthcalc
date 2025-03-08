package healthcalc;

public class HealthCalcImpl implements HealthCalc {

    @Override
    public float idealWeight(int height, char gender) throws Exception {
        float resultado=0;
        if(height<0 || height==0){
            throw new Exception("Altura invalida");
        }if(gender!='m' && gender!='w'){
            throw new Exception("Genero debe ser 'm' o 'w' ");
        }
        
        else{
            if(gender=='m'){
                resultado=height-100-((height-150)/4f);
            }else{
                resultado=height-100-((height-150)/2.5f);
            }

        }
        return resultado;
    }

    @Override
    public float basalMetabolicRate(float weight, int height, int age, char gender) throws Exception {

        throw new UnsupportedOperationException("Not supported yet.");
    }



}
