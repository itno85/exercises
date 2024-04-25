package de.exercise;

import java.util.ArrayList;

public class Main {

    static ArrayList<Object> list = new ArrayList();

    public static void main(String[] args) {



        Kreis kreis1 = new Kreis(3);
        Rechteck rechteck1 = new Rechteck(3,3);
        list.add(kreis1);
        list.add(rechteck1);


        for (int i = 0; i < list.size(); i++) {
            Object objekt = list.get(i);
            if (objekt.getClass().getName() == "de.exercise.Kreis") {
                Kreis k = (Kreis) objekt;
                k.berechneFlaeche();
                System.out.println("Fäche ist: " + k.berechneFlaeche());

            }
            if (objekt.getClass().getName() == "de.exercise.Rechteck") {
                Rechteck r = (Rechteck) objekt;
                System.out.println("Fäche ist: " + r.berechneFlaeche());
            }
        }
    }
}


class Kreis {
    private double radius;

    public Kreis(double radius) {
        this.radius = radius;
    }

    public double berechneFlaeche() {
        return Math.PI * radius * radius;
    }

    public double berechneUmfang() {
        return 2 * Math.PI * radius;
    }
}

class Rechteck {
    private double laenge;
    private double breite;

    public Rechteck(double laenge, double breite) {
        this.laenge = laenge;
        this.breite = breite;
    }

    public double berechneFlaeche() {
        return laenge * breite;
    }

    public double berechneUmfang() {
        return 2 * (laenge + breite);
    }

    public int ecken(){
        return 4;
    }
}
