package healthcalc;

public class Persona implements Person {

    private float weight;
    private float height;
    private int age;
    private Gender gender;


    public Persona(float weight, float height, int age,Gender gender)  {

        this.weight = weight;
        this.height = height;
        this.age = age;
        this.gender=gender;
    }
        

    @Override
    public float weight() throws Exception {

        return weight;
        
    }
    @Override
    public float height() throws Exception {
        return height;
    }
    @Override
    public int age() throws Exception {
        return age;
    }
    @Override
    public Gender gender() throws Exception {
        return gender;
    }

    
}
