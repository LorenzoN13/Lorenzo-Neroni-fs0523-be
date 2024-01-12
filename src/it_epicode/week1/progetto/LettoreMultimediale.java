package it_epicode.week1.progetto;

import java.util.Scanner;

public class LettoreMultimediale {
    Scanner scanner = new Scanner(System.in);
    private Multimediale[] listaMultimediale = new Multimediale[5];

    public void inserisciMedia(Multimediale media, int i){
        listaMultimediale[i] = media;
    }
    public void avvia() {
        while (true) {
            System.out.println("\nMenu:");
            for (int i = 0; i < listaMultimediale.length; i++) {
                if (listaMultimediale[i] != null) {
                    System.out.println((i + 1) + ". " + listaMultimediale[i].getClass().getSimpleName() + ": " + listaMultimediale[i].toString());
                }
            }

            System.out.println("0. Uscita");
            System.out.print("Seleziona un media da eseguire (1-5 o 0 per uscire): ");

            int opzione;
            try {
                opzione = Integer.parseInt(scanner.nextLine());
                if (opzione == 0) {
                    break;
                } else if (opzione >= 1 && opzione <= 5 && listaMultimediale[opzione - 1] != null) {
                    listaMultimediale[opzione - 1].esegui();
                } else {
                    System.out.println("Scelta non valida. Inserisci un numero tra 1 e 5.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Input non valido. Inserisci un numero.");
            }
        }
    }
}
