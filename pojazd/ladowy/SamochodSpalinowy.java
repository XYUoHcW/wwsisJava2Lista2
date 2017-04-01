package pojazd.ladowy;

import pojazd.Spalinowy;

public class SamochodSpalinowy extends Samochod implements Spalinowy {

    private double poziomSpalania;
    
    private int pojemnoscBaku;
    
    @Override
    public void rozpocznijJazde() {
        System.out.println("Samochod spalinowy wyjeżdża w trasę.");
    }

    @Override
    public double getPoziomSpalania() {
        return this.poziomSpalania;
    }

    @Override
    public int getPojemnoscBaku() {
        return this.pojemnoscBaku;
    }

    public void setPoziomSpalania(double poziomSpalania) {
        this.poziomSpalania = poziomSpalania;
    }

    public void setPojemnoscBaku(int pojemnoscBaku) {
        this.pojemnoscBaku = pojemnoscBaku;
    }
}
