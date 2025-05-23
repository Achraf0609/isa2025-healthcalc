package healthcalc;

public class CardiovascularMetrics  {

   
    public double getIdealBodyWeight(Persona persona) throws Exception{
        Gender gender=persona.gender();
        float height=persona.height();

        float resultado=0;
        if(height<0 || height==0){
            throw new Exception("Altura invalida");
        }if(gender!=Gender.MALE&& gender!=Gender.FEMALE){
            throw new Exception("Genero debe ser 'MALE' o 'FEMALE' ");
        }
        
        else{
            if(gender==Gender.MALE){
                resultado=height-100-((height-150)/4f);
            }else{
                resultado=height-100-((height-150)/2.5f);
            }

        }
        return resultado;
        
    }
    
}
