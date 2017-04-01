package pojazd.ladowy;

import pojazd.Pojazd;

public abstract class PojazdLadowy extends Pojazd {
    
    private int liczbaKol;
    
    public abstract void rozpocznijJazde();

    public int getLiczbaKol() {
        return liczbaKol;
    }

    public void setLiczbaKol(int liczbaKol) {
        this.liczbaKol = liczbaKol;
    }
}
