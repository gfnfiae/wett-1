package de.gfn.fiae.wett.stani.aufgabe7_7_9;

import java.text.DecimalFormat;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeMath.round;



public class AppStart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Berechnung berechnung = new Berechnung();
        DecimalFormat rand = new DecimalFormat("0.0");
        
        //int eingabe = scanner.nextInt();
        
        System.out.println(berechnung.zufallsZahl());
        
//        int a = 7;
//        
//        double zahl = Math.random();
//        
//        String testy = rand.format(zahl);
//        
//        String test = "0."+a;
//        
//        double pp = Double.parseDouble(test);
//        
//        System.out.println(testy);
//
//        double wurst = Math.round(8.34567);
//        System.out.println(Math.round(zahl*10));
        
    }
    
    
}
