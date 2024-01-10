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

        String[] informazioniChiamate = {
                "123456789,5",
                "555444333,8",
                "777888999,10"
        };

        // Aggiungere le chiamate all'array di Chiamata
        for (String infoChiamata : informazioniChiamate) {
            String[] info = infoChiamata.split(",");
            String numero = info[0];
            int durata = Integer.parseInt(info[1]);

        }


        sim.stampaDatiSIM();
    }
}
