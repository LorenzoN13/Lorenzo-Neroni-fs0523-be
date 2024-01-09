package it_epicode.week1.day1.Esercizio2;

import java.util.Scanner;

public class Esercizio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] parole = new String[3];

        for (int i = 0; i < parole.length; i++) {
            System.out.println("Dammi la stringa");
            parole[i] = scanner.next();
        }

        for (int i = 0; i < parole.length; i++) {
            System.out.print(parole[i]);
        }

        System.out.println();

        for (int i = parole.length - 1; i >= 0; i--) {
            System.out.print(parole[i]);
        }

    }

}
