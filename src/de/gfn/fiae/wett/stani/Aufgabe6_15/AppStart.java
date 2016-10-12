package de.gfn.fiae.wett.stani.Aufgabe6_15;

import java.util.Scanner;

public class AppStart {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Berechnung berechnung = new Berechnung();
        
        System.out.println("Willkommen zu Aladins Schatzsuche");
        
        // Spielfigurname Eingabe
        System.out.print("Geben Sie den Namen der Spielfigur ein: ");
        String name = scanner.nextLine();
        berechnung.checkName(name);
        
        // Staerke Eingabe
        System.out.print("Staerke eingeben (1-10): ");
        int staerke = scanner.nextInt();
        //berechnung.checkInt(staerke);
        
        // Gesungheit Eingabe
        System.out.print("Gesundheit eingeben (1-10): ");
        int gesundheit = scanner.nextInt();
        //berechnung.checkInt(gesundheit);
        
        // Glueck Eingabe
        System.out.print("Glueck eingeben (1-10): ");
        int glueck = scanner.nextInt();
        // berechnung.checkInt(glueck);
        
        
        berechnung.checkEingaben(name, staerke, gesundheit, glueck);
    }
}
