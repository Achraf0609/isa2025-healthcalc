package healthcalc;

import java.util.ArrayList;

public class HealthProxy implements HealthHospital,HealthStats {


    private HealthHospital calculadora;
    private ArrayList<Float> alturas= new ArrayList<>();
    private ArrayList<Float> pesos= new ArrayList<>();
    private ArrayList<Integer> edades= new ArrayList<>();
    private ArrayList<Double> bmrs= new ArrayList<>();
    private int numSexoH=0;
    private int numSexoM=0;
    private int numTotalPacientes=0;
    
    public HealthProxy(HealthHospital calculadora) {
        this.calculadora = calculadora;
    }

    public double bmr(char genero, int edad, float altura, int peso) throws Exception{

        double resultado= calculadora.bmr(genero, edad, altura, peso);
        alturas.add(altura);
        pesos.add((float) peso);
        edades.add(edad);
        bmrs.add(resultado);
        numTotalPacientes+=1;
        if (genero == 'm'){
            numSexoH+=1;
        } 
        if (genero == 'w'){
            numSexoM+=1;
        }
        return resultado;
    }
    public int pesoIdeal(char genero, float altura) throws Exception {
        alturas.add(altura);
        numTotalPacientes+=1;
        if (genero == 'm'){
            numSexoH+=1;
        }
        if (genero == 'w'){
            numSexoM+=1;
        }
        return calculadora.pesoIdeal(genero, altura);

    }

    @Override
    public float alturaMedia() throws Exception {
        float suma=0;
        for (int i=0;i<alturas.size();i++){
            suma+=alturas.get(i);
        }
        return suma/alturas.size();


    }

    @Override
    public float pesoMedio() throws Exception {
        float suma=0;
        for (int i=0;i<pesos.size();i++){
            suma+=pesos.get(i);
        }
        return suma/pesos.size();
    }

    @Override
    public float edadMedia() throws Exception {
        float suma=0;
        for (int i=0;i<edades.size();i++){
            suma+=edades.get(i);
        }
        return suma/edades.size();
    }

    @Override
    public float bmrMedio() throws Exception {
        float suma=0;
        for (int i=0;i<bmrs.size();i++){
            suma+=bmrs.get(i);
        }
        return suma/bmrs.size();
    }

    @Override
    public int numSexoH() throws Exception {
        return numSexoH;
    }

    @Override
    public int numSexoM() throws Exception {
        return numSexoM;
    }

    @Override
    public int numTotalPacientes() throws Exception {
        return numTotalPacientes;
    }
    
}
