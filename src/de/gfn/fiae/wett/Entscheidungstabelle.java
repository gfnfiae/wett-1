package de.gfn.fiae.wett;

public class Entscheidungstabelle {

    private String ausgabe_und;
    private String ausgabe_oder;

    public String undWert(String eingabe_a, String eingabe_b) {
        String eingabe = eingabe_a + "" + eingabe_b;
        if ("11".equals(eingabe)) {
            ausgabe_und = "Wahr";
        } else {
            ausgabe_und = "Falsch";
        }
        return ausgabe_und;
    }

    public String oderWert(String eingabe_a, String eingabe_b) {
        String eingabe = eingabe_a + "" + eingabe_b;
        if ("00".equals(eingabe)) {
            ausgabe_oder = "Falsch";
        } else {
            ausgabe_oder = "Wahr";
        }
        return ausgabe_oder;
    }
}
