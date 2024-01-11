package it_epicode.week1.day4.Esercizio1;

import java.util.Scanner;

public class BustaPagaDipendente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci il numero matricola:");
        String matri = scanner.nextLine();

        System.out.println("Inserisci il tuo dipartimentro tra: PRODUZIONE, AMMINISTRAZIONE ,VENDITE");
        String dip = scanner.nextLine();

        //Creo il primo dipendente
        Dipendente dipendente1 = new Dipendente(matri, dip);

        System.out.println("Dati dipendente 1:");
        dipendente1.stampaDatiDipendente();




        System.out.println("Inserisci il numero matricola:");
        String matrico = scanner.nextLine();

        System.out.println("Inserisci il stipendio:");
        double sti = scanner.nextDouble();

        System.out.println("Inserisci il l'importo dell'orario dello straordinario:");
        double stra = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Inserire il tuo livello tra: OPERAIO, IMPIEGATO, QUADRO, DIRIGENTE");
        String liv = scanner.nextLine();

        System.out.println("Inserisci il tuo dipartimentro tra: PRODUZIONE, AMMINISTRAZIONE ,VENDITE");
        String dipa = scanner.nextLine();


        //Creo il secondoo dipendente
        Dipendente dipendente2 = new Dipendente(matrico, sti, stra, liv, dipa);

        System.out.println("\nDati dipendente 2:");
        dipendente2.stampaDatiDipendente();

        //Modifico il dipartimento e l'importo dell'orario dello straordinario
        dipendente1.setDipartimento("VENDITE");
        dipendente2.setImportoOrarioStraordinario(50);

        System.out.println("\nDati dipendente 1 dopo la modifica:");
        dipendente1.stampaDatiDipendente();

        System.out.println("\nDati dipendente 2 dopo la modifica:");
        dipendente2.stampaDatiDipendente();

        // Promozione del dipendente 1
        System.out.println("\nPromozione del dipendente 1:");
        String nuovoLivello = dipendente1.promuovi();
        System.out.println("Nuovo livello: " + nuovoLivello);

        // Calcolo della paga mensile
        System.out.println("\nCalcolo paga mensile per dipendente 2: " + Dipendente.calcolaPaga(dipendente2));

        // Calcolo della paga mensile con straordinario
        int oreStraordinario = 10;
        System.out.println("Calcolo paga mensile con " + oreStraordinario + " ore di straordinario per dipendente 2: " +
                Dipendente.calcolaPagaConStraordinario(dipendente2, oreStraordinario));
    }
}
