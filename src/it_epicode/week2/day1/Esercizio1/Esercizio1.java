package it_epicode.week2.day1.Esercizio1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


public class Esercizio1 {
    private static final Logger logger = LoggerFactory.getLogger("Eserczio1");
    private static int[] ArrayCasuale(int a, int b, int c) {
        int[] array = new int[a];
        Random random = new Random();

        for (int i = 0; i < a; i++) {
            array[i] = random.nextInt(c - b + 1) + b;
        }

        return array;
    }

    private static void stampaArray(int[] array){
        System.out.println("L'array attuale: " + Arrays.toString(array));
    }

    private static void verificaPosizione(int pos, int lungArray) {
        if (pos < 0 || pos >= lungArray) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static void main(String[] args) {
        int[] array = ArrayCasuale(5, 1, 10);
        stampaArray(array);

        Scanner scanner = new Scanner(System.in);
        int numeroInserito = 0;
        do {
            try {
                System.out.print("Inserisci un numero (0 per terminare): ");
                numeroInserito = scanner.nextInt();

                if (numeroInserito != 0) {
                    System.out.print("Inserisci la posizione (0-4): ");
                    int posizione = scanner.nextInt();

                    verificaPosizione(posizione, array.length);

                    array[posizione] = numeroInserito;
                    stampaArray(array);
                }
            } catch (java.util.InputMismatchException e) {
                logger.error("Inserire un numero valido.");
                scanner.nextLine();
            } catch (ArrayIndexOutOfBoundsException e) {
                logger.error("Posizione non valida. Inserire un numero tra 0 e " + (array.length - 1));
            }

        } while (numeroInserito != 0);

        System.out.println("Programma terminato con successo.");
    }
}
