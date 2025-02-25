package healthcalc;

public class HealthCalcImpl implements HealthCalc {

    int height;
    char gender;
    float weight;
    int age;



    @Override
    public float idealWeight(int height, char gender) throws Exception;
    @Override
    public float basalMetabolicRate(float weight, int height, int age, char gender) throws Exception;


}
