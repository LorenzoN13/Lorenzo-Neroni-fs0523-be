package it_epicode.week1.progetto;

import java.util.Scanner;

public class LettoreMultimediale {
    Scanner scanner = new Scanner(System.in);
    private Avvia[] listaMultimediale = new Avvia[5];

    public void inserisciMedia(Avvia media, int i){
        listaMultimediale[i] = media;
    }

    public void avvia(){
        while(true){
            System.out.println("\nMenù:");
            int i = 0;
            while (i < listaMultimediale.length){
                if (listaMultimediale[i] != null) {
                    System.out.println((i + 1) + ". " + listaMultimediale[i].getClass().getSimpleName() + ": " + listaMultimediale[i].toString());
                }
                i++;
            }

            System.out.println("0. Uscita");
            System.out.print("Seleziona un media da eseguire (1-5 o 0 per uscire): ");

            try{
                int opzione = Integer.parseInt(scanner.nextLine());

                if (opzione == 0){
                    break;
                } else if (opzione >= 1 && opzione <= 5 && listaMultimediale[opzione - 1] !=null) {
                    listaMultimediale[opzione].esegui();
                } else System.out.println("Scelta sbaglita. Inserisci un numero tra 1 e 5.");
            } catch (NumberFormatException e){ System.out.println("Input errato. Inserire un numero.");}

        }
    }
}
