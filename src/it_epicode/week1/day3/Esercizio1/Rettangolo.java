package it_epicode.week1.day3.Esercizio1;

import java.util.Scanner;

public class Rettangolo {
    private double altezza;
    private double larghezza;


    public Rettangolo(double altezza, double larghezza){
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    public double getAltezza() {
        return altezza;
    }

    public double getLarghezza() {
        return larghezza;
    }

    public void setAltezza(double nuovaAltezza) {
        this.altezza = nuovaAltezza;
    }

    public void setLarghezza(double nuovaLarghezza) {
        this.larghezza = nuovaLarghezza;
    }

    public double calcolaArea(){
        return altezza * larghezza;
    }

    public double calcolaPerimetro(){
        return (altezza + larghezza) * 2;
    }


}
