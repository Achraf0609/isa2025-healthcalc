package healthcalc;

public class Espanol extends IdiomaDecorator {
    public Espanol(HealthHospital wrappe) {
        super(wrappe);
    }

    public double bmr(char genero, int edad, float altura, int peso) throws Exception {
        double resultado = wrappee.bmr(genero, edad, altura, peso);
        System.out.println("La persona con altura " + altura + " metros y peso " + peso/1000 + " Kg tiene un BMR de " + resultado);
        return resultado;}

    public int pesoIdeal(char genero, float altura) throws Exception {
        return wrappee.pesoIdeal(genero, altura);
    }
    
}
