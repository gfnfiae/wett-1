package de.gfn.fiae.wett;

import java.util.Scanner;

public class AppRun {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bitte 1 oder 0 eingeben: ");
        String eingabe_a = scan.nextLine();
        System.out.print("Bitte 1 oder 0 eingeben: ");
        String eingabe_b = scan.nextLine();
        
        Entscheidungstabelle tab = new Entscheidungstabelle();
        
        System.out.println("Ergebnis bei UND: " + tab.undWert(eingabe_a, eingabe_b));
        System.out.println("Ergebnis bei ODER: " + tab.oderWert(eingabe_a, eingabe_b));

    }
    
}
