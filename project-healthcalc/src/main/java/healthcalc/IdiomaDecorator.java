package healthcalc;

public abstract class IdiomaDecorator implements  HealthHospital {

    protected HealthHospital wrappee;

    public IdiomaDecorator(HealthHospital wrappe) {
        this.wrappee = wrappe;
    }

    
}
