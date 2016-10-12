package de.gfn.fiae.wett;

public class Entscheidungstabelle {
    private String ausgabe_und;
    private String ausgabe_oder;
    
    public String undWert (String eingabe_a, String eingabe_b) {
        String eingabe = eingabe_a + "" + eingabe_b;
        if(eingabe == "11") {
            ausgabe_und = "Wahr";
        }
        else {
            ausgabe_und = "Falsch";
        }
        return ausgabe_und;
    }
    
    public String oderWert (String eingabe_a, String eingabe_b) {
        String eingabe = eingabe_a + "" + eingabe_b;
        if(eingabe == "00") {
            ausgabe_oder = "Falsch";
        }
        else {
            ausgabe_oder = "Wahr";
        }
        return ausgabe_oder;
    }
}