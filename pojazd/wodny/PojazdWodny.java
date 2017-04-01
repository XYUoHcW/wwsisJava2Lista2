package pojazd.wodny;

import pojazd.Pojazd;

public abstract class PojazdWodny extends Pojazd {
    
    private double wypornosc;
    
    public abstract void wyplyn();

    public double getWypornosc() {
        return wypornosc;
    }

    public void setWypornosc(double wypornosc) {
        this.wypornosc = wypornosc;
    }
}
