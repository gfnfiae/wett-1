package de.gfn.fiae.wett.stani.Aufgabe6_15;

public class Berechnung {

    private String name;
    private int staerke;
    private int gesundheit;
    private int glueck;

    public void checkName(String name) {
        if ("".equals(name)) {
            System.out.println("Eingabe darf nicht leer sein!");
            System.exit(0);
        }
    }
//    public void checkInt(int eingabe) {
//        if() {
//            System.out.println("Eingabe darf nicht leer sein!");
//            System.exit(0);
//        }
//    }

    public void checkEingaben(String name, int staerke, int gesundheit, int glueck) {
        int summe = staerke + gesundheit + glueck;
        if (summe > 15) {
            this.name = name;
            this.staerke = 5;
            this.gesundheit = 5;
            this.glueck = 5;
            System.out.println("Sie haben Ihrer Spielfigur zu viele Punkte gegeben!\n"
                    + "Es wurden die Standartwerte zugewiessen:\n"
                    + "" + this.name + ", Staerke: " + this.staerke + ", Gesundheit: "
                    + this.gesundheit + ", Glueck: " + this.glueck);
        } else {
            this.name = name;
            this.staerke = staerke;
            this.gesundheit = gesundheit;
            this.glueck = glueck;

            System.out.println("" + this.name + ", Staerke: " + this.staerke + ", Gesundheit: "
                    + this.gesundheit + ", Glueck: " + this.glueck);
        }
    }

}
