package pojazd.wielozadaniowy;

import pojazd.Pojazd;
import pojazd.Spalinowy;
import pojazd.ladowy.PojazdLadowy;
import pojazd.wodny.PojazdWodny;

public class Poduszkowiec extends Pojazd implements Spalinowy {
    
    private int pojemnoscBaku;
    
    private double PoziomSpalania;
    
    class ModulLadowy extends PojazdLadowy {
        
        @Override
        public void rozpocznijJazde() {
            System.out.println("Poduszkowiec wyjeżdża w trasę.");
        }
        
    }
    
    class ModulWodny extends PojazdWodny {
        
        @Override
        public void wyplyn() {
            System.out.println("Posuzkowiec wypływa w rejs.");
        }
        
    }
    
    public void wyplyn() {
        new Poduszkowiec.ModulWodny().wyplyn();
    }
    
    public void rozpocznijJazde() {
        new Poduszkowiec.ModulLadowy().rozpocznijJazde();
    }

    @Override
    public double getPoziomSpalania() {
        return this.PoziomSpalania;
    }

    @Override
    public int getPojemnoscBaku() {
        return this.pojemnoscBaku;
    }
    
    public void setPojemnoscBaku(int pojemnoscBaku) {
        this.pojemnoscBaku = pojemnoscBaku;
    }

    public void setPoziomSpalania(double PoziomSpalania) {
        this.PoziomSpalania = PoziomSpalania;
    }

}
