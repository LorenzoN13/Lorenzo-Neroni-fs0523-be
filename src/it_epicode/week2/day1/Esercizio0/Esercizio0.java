package it_epicode.week2.day1.Esercizio0;

import it_epicode.week1.day3.Esercizio1.Rettangolo;

import java.util.Scanner;

public class Esercizio0 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a;
        double l;
        double na;
        double nl;

        System.out.println("Inserisci un numero per l'altezza");
        a = scanner.nextDouble();

        System.out.println("Inserisci un numero per l'altezza");
        l =  scanner.nextDouble();


        Rettangolo rettangolo = new Rettangolo(a, l);


        double area = rettangolo.calcolaArea();
        double perimetro = rettangolo.calcolaPerimetro();


        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);

        System.out.println("Inserisci un nuovo numero per l'altezza");
        na = scanner.nextDouble();

        System.out.println("Inserisci un nuovo numero per l'altezza");
        nl =  scanner.nextDouble();

        rettangolo.setAltezza(nl);
        rettangolo.setLarghezza(na);

        double nuovaArea = rettangolo.calcolaArea();
        double nuovoPerimetro = rettangolo.calcolaPerimetro();

        System.out.println("Nuova area: " + nuovaArea);
        System.out.println("Nuovo perimetro: " + nuovoPerimetro);
    }
}
