/**
 * Author: Emirhan Bekmez
 * Date: 02.03.2022
 * Version: 0.1
 **/


import java.util.Scanner;

public class Geldautomat {     

    static Scanner sc1 = new Scanner(System.in);                                        //da wird ein Objekt "sc1" geschaffen
    static Bankomatkarte mastercard = new Bankomatkarte("Max", 2000.0, 200.0);        //hier wird auf die Methode Bankomatkarte zugegriffen und Werte festgelegt
    static Bankomatkarte visa = new Bankomatkarte("Emir", 3000.0, 100.0);


    public static void main(String[] args) {        //das ist öffentlich, statisch und ohne Rückgabewerten
        double betrag;                              //hier bekommt die Variable betrag den Datentyp double zugewiesen
        String inhaber;                             //die Variable inhaber ist hiermit eine String - Variable

        while(true) {                                                                                        //eine while Schleife die sich so lange wiederholt bis sie nicht mehr true ist
            System.out.println("Geben Sie Ihren Namen an: \n 1 -> Lukas \n 2 -> Emir\n 3 -> Beenden");       //der erste Text der beim ausführen angezeigt wird, \n sorgt für einen Zeillenumbruch
            int state = sc1.nextInt();                                                                       //die state Variable wird zum Typen Integer und die Variable sc1 wird als Integer ausgegeben
            boolean run = true;                                                                              //die Variable run wird hier zu einem Boolean und wird hier so lange ausgeführt wie sie true bleibt

            switch (state) {                                    //hier wird die state Variable für die switch Methode verwendet
                case 1 -> {                                     //der erste Fall bzw die erste Mögllichkeit
                    inhaber = "Lukas";                          //die Variable inhaber bekommt hier den Wert Lukas
                    System.out.println("Hallo " + inhaber);     //hier wird der Text zwischen den "" ausgegeben + der Wert von der Variable inhaber
                    while (run) {                               //die while Schleife wird solange ausgeführt bis der boolean Wert false wird
                        System.out.println("Hallo, was möchten Sie machen?");
                        System.out.println("1 -> Abheben\n2 -> Einzahlen\n3 -> Kontostand anzeigen\n4 -> Karte auswerfen");

                        state = sc1.nextInt();                  //hier bekommt state einen Typen zugewiesen
                        switch (state) {                        //mit der switch Methode werden die Möglichkeiten am Geldautomaten gemacht
                            case 1 -> {
                                System.out.println("Bitte geben Sie einen Betrag an: ");
                                betrag = sc1.nextDouble();          //die Variable bekommt hier den Typen double, damit man auch die Komazahlen anzeigen/eingeben kann
                                mastercard.abheben(betrag);         //hier wird code von der Bankomatkarten - Methode angewandt
                            }
                            case 2 -> {
                                System.out.println("Bitte geben Sie einen Betrag an: ");
                                betrag = sc1.nextDouble();
                                mastercard.einzahlen(betrag);
                            }
                            case 3 -> mastercard.kontostand();
                            case 4 -> {
                                mastercard.abbruch();
                                run = false;                        //wenn das ausgelöst wird endet die Schleife
                            }
                            default -> System.out.println("Kein state gefunden!");          //Fehlermeldung bei Falscheingabe
                        }
                    }
                }
                case 2 -> {
                    inhaber = "Emir";
                    System.out.println("Hallo " + inhaber);

                    while (run) {
                        System.out.println("Hallo, was möchten Sie machen?");
                        System.out.println("1 -> Abheben\n2 -> Einzahlen\n3 -> Kontostand anzeigen\n4 -> Karte auswerfen");

                        state = sc1.nextInt();
                        switch (state) {
                            case 1 -> {
                                System.out.println("Bitte geben Sie einen Betrag an: ");
                                betrag = sc1.nextDouble();
                                visa.abheben(betrag);
                            }
                            case 2 -> {
                                System.out.println("Bitte geben Sie einen Betrag an: ");
                                betrag = sc1.nextDouble();
                                visa.einzahlen(betrag);
                            }
                            case 3 -> visa.kontostand();
                            case 4 -> {
                                visa.abbruch();
                                run = false;
                            }
                            default -> System.out.println("Kein state gefunden!");
                        }
                    }
                }
                case 3 -> System.exit(0);
                default -> System.out.println("Falsche Eingabe...");
            }
        }

    }
}
