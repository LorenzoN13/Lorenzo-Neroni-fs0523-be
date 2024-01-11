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

        sim.aggiungiChiamata(new Chiamata(23, 65325674));
        sim.aggiungiChiamata(new Chiamata(12, 32461261));
        sim.aggiungiChiamata(new Chiamata(2, 24352462));
        sim.aggiungiChiamata(new Chiamata(5, 34535355));
        sim.aggiungiChiamata(new Chiamata(56, 54352345));

        sim.stampaDatiSIM();
    }
}
