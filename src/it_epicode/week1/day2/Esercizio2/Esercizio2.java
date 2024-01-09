package it_epicode.week1.day2.Esercizio2;

import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un numero compreso tra 0 e 3: ");
        int numeroInserito = scanner.nextInt();

        stampaNumeroInLettere(numeroInserito);
    }

    public static void stampaNumeroInLettere(int g) {
        switch (g) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("uno");
                break;
            case 2:
                System.out.println("due");
                break;
            case 3:
                System.out.println("tre");
                break;
            default:
                System.out.println("Il numero non è compreso tra 0 e 3");
                break;
        }
    }
}
