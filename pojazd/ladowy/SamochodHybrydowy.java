package pojazd.ladowy;

import pojazd.Elektryczny;
import pojazd.Spalinowy;

public class SamochodHybrydowy extends Samochod implements Elektryczny, Spalinowy {

    private double poziomNaladowania;
    
    private int pojemnoscBaku;
    
    private double poziomSpalania;
    
    @Override
    public void rozpocznijJazde() {
        System.out.println("Samochód hybrydowy wyjeżdża w trasę.");
    }

    @Override
    public double getPoziomNaladowania() {
        return this.poziomNaladowania;
    }

    @Override
    public double getPoziomSpalania() {
        return this.poziomSpalania;
    }

    @Override
    public int getPojemnoscBaku() {
        return this.pojemnoscBaku;
    }

    public void setPoziomNaladowania(double poziomNaladowania) {
        this.poziomNaladowania = poziomNaladowania;
    }

    public void setPojemnoscBaku(int pojemnoscBaku) {
        this.pojemnoscBaku = pojemnoscBaku;
    }

    public void setPoziomSpalania(double poziomSpalania) {
        this.poziomSpalania = poziomSpalania;
    }
}
