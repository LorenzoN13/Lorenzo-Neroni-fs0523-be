package it_epicode.week1.progetto;

import java.util.Scanner;

public class AvviaLettoreMultimediale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LettoreMultimediale lettore = new LettoreMultimediale();

        int i = 0;

        while (i < 5){
            System.out.println("Inserisci il tipo di media tra: IMMAGINE O VIDEO: ");
            String tipoMedia = scanner.nextLine().toLowerCase();

            System.out.print("Inserisci il titolo: ");
            String titolo = scanner.nextLine();

            if (tipoMedia.equals("immagine")){
                System.out.println("Inserisci luminosità: ");
                int luminosita = Integer.parseInt(scanner.nextLine());
                lettore.inserisciMedia((Avvia) new Immagine(titolo,luminosita), i);
            } else if (tipoMedia.equals("video")) {
                System.out.print("Inserisci durata: ");
                int durata = Integer.parseInt(scanner.nextLine());

                System.out.print("Inserisci volume: ");
                int volume = Integer.parseInt(scanner.nextLine());

                System.out.print("Inserisci luminosità: ");
                int luminosita = Integer.parseInt(scanner.nextLine());

                lettore.inserisciMedia(new Video(titolo, durata, volume, luminosita), i);
            } else {
                System.out.println("Tipo di media non valido. I tipi supportati sono immagine e video.");
                i--;
            }
            i++;
        }
        lettore.avvia();
    }
}
