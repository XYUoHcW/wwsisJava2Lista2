package java2lista2;

import pojazd.ladowy.SamochodElektryczny;
import pojazd.ladowy.SamochodHybrydowy;
import pojazd.ladowy.SamochodSpalinowy;
import pojazd.wielozadaniowy.Poduszkowiec;
import pojazd.wodny.Statek;

public class Java2Lista2 {

    public static void testPojazdow() {
        Statek statek = new Statek();
        SamochodElektryczny samochodElektryczny = new SamochodElektryczny();
        SamochodHybrydowy samochodHybrydowy = new SamochodHybrydowy();
        SamochodSpalinowy samochodSpalinowy = new SamochodSpalinowy();
        Poduszkowiec poduszkowiec = new Poduszkowiec();
        
        statek.wyplyn();
        samochodElektryczny.rozpocznijJazde();
        samochodHybrydowy.rozpocznijJazde();
        samochodSpalinowy.rozpocznijJazde();
        poduszkowiec.rozpocznijJazde();
        poduszkowiec.wyplyn();
    }
    
    public static void testCzyNazwaPojazduPoInicjalizacjiJestNullem() {
        SamochodHybrydowy samochodHybrydowy = new SamochodHybrydowy();
        if (samochodHybrydowy.getNazwa() == null) {
            System.out.println("Nazwa jest nullem! BŁĄD");
        } else {
            System.out.println("Nazwa nowo utworzonego pojazdu nie jest nullem.");
        }
    }
    
    public static void main(String[] args) {
        Java2Lista2.testPojazdow();
        Java2Lista2.testCzyNazwaPojazduPoInicjalizacjiJestNullem();
    }
    
}
