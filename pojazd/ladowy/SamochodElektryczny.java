package pojazd.ladowy;

import pojazd.Elektryczny;

public class SamochodElektryczny extends  Samochod implements Elektryczny {

    private double poziomNaladowania;
    
    @Override
    public void rozpocznijJazde() {
        System.out.println("Samochód elektryczny wyjeżdża w trasę.");
    }

    @Override
    public double getPoziomNaladowania() {
        return this.poziomNaladowania;
    }

    public void setPoziomNaladowania(double poziomNaladowania) {
        this.poziomNaladowania = poziomNaladowania;
    }
}
