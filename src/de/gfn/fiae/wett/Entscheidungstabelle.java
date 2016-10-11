package de.gfn.fiae.wett;

public class Entscheidungstabelle {
    private String ausgabe_und;
    private String ausgabe_oder;
    
    public String undWert (String eingabe_a, String eingabe_b) {
        String eingabe = eingabe_a + "" + eingabe_b;
        switch(eingabe) {
            case "10":
                ausgabe_und = "Falsch";
                break;
            case "11":
                ausgabe_und = "Wahr";
                break;
            case "01":
                ausgabe_und = "Falsch";
                break;
            case "00":
                ausgabe_und = "Falsch";
                break;
        }
        return ausgabe_und;
    }
    
    public String oderWert (String eingabe_a, String eingabe_b) {
        String eingabe = eingabe_a + "" + eingabe_b;
        switch(eingabe) {
            case "10":
                ausgabe_oder = "Wahr";
                break;
            case "11":
                ausgabe_oder = "Wahr";
                break;
            case "01":
                ausgabe_oder = "Wahr";
                break;
            case "00":
                ausgabe_oder = "Falsch";
                break;
        }
        return ausgabe_oder;
    }
}