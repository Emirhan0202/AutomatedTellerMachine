/**
 * Author: Emirhan Bekmez
 * Date: 28.04.2022
 * Version: 0.1
 **/

public class Bankomatkarte {
    String inhaber;
    double kontostand;
    double limit;


    public Bankomatkarte(String ih, double k, double l) {
        this.inhaber = ih;
        this.kontostand = k;
        this.limit = l;
    }


    public void abheben(double betrag) {
        if (betrag <= kontostand && betrag <= limit) {
            kontostand = kontostand - betrag;
            System.out.println("Sie haben noch: " + kontostand);
        }
        else
            System.out.println("Bitte beachten Sie Ihr Limit!");
    }


    public void einzahlen(double betrag) {
        if (betrag > 0) {
            kontostand = kontostand + betrag;
            System.out.println("Sie haben : " + kontostand);
        }
        else
            System.out.println("Netter Versuch...");
    }


    public void kontostand() {
        System.out.println("Sie haben gerade " + kontostand  + "€ am Konto.");
    }


    public void abbruch() {
        System.out.println("Auf Wiedersehen " + inhaber + ".\nWir freuen uns auf Ihren nächsten Besuch!");
    }
}
