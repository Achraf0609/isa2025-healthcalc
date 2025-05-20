package healthcalc;

public abstract class RegionDecorator implements HealthHospital{

    protected  HealthHospital wrappee;

    public RegionDecorator(HealthHospital wrappe) {
        this.wrappee = wrappe;
    }


    
}
