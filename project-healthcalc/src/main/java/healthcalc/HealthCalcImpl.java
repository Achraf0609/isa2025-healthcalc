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

        float resultado=0;
        if(height<0 || height==0){
            throw new Exception("Altura invalida");
        }if(gender!='m' && gender!='w'){
            throw new Exception("Genero debe ser 'm' o 'w' ");
        }if(weight<0 || weight==0){
            throw new Exception("Peso invalido");
        }if(age<0 || age==0){
            throw new Exception("Edad invalida");
        }else{
            if(gender=='m'){
                //* For men: BMR = 88.362 + 13.397 * weight + 4.799 * height - 5.677 * age
	            //* For women: BMR = 447.593 + 9.247 * weight + 3.098 * height - 4.330 * age
                resultado=88.362f+(13.397f*weight)+(4.799f*height)-(5.677f*age);
            }else{
                resultado=447.593f+(9.247f*weight)+(3.098f*height)-(4.330f*age); // 50 165 20
            }
        }
        return resultado;
    }



}
