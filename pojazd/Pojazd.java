package pojazd;

import java.util.Objects;

public abstract class Pojazd {
    
    private String nazwa;
    
    private int liczbaPasazerow;
    
    private int maksymalnaPredkosc;
    
    public Pojazd() {
        if (this.nazwa == null) {
            this.nazwa = "";
        }
    }
    public int getLiczbaPasazerow() {
        return liczbaPasazerow;
    }

    public void setLiczbaPasazerow(int liczbaPasazerow) {
        this.liczbaPasazerow = liczbaPasazerow;
    }

    public int getMaksymalnaPredkosc() {
        return maksymalnaPredkosc;
    }

    public void setMaksymalnaPredkosc(int maksymalnaPredkosc) {
        this.maksymalnaPredkosc = maksymalnaPredkosc;
    }

    public String getNazwa() {
        return this.nazwa;
    }

    @Override
    public String toString() {
        return "Pojazd o nazwie " + this.nazwa;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pojazd other = (Pojazd) obj;
        if (!Objects.equals(this.nazwa, other.nazwa)) {
            return false;
        }
        return true;
    }
}
