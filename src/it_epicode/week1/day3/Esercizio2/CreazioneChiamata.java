package it_epicode.week1.day3.Esercizio2;

import java.util.Scanner;

public class CreazioneChiamata {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Aggiungi un numero di telefono");
        long numeroTelefono = scanner.nextLong();

        System.out.println("Aggiungi un numero per ricaricare il credito");
        double ric = scanner.nextDouble();

        Sim sim = new Sim(numeroTelefono, ric);
        sim.effettuaChiamata(30, 0.05);

        sim.stampaDatiSIM();
    }
}
