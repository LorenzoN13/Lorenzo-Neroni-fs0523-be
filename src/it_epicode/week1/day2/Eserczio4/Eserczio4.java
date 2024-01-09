package it_epicode.week1.day2.Eserczio4;

import java.util.Scanner;

public class Eserczio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un numero: ");
        int n = scanner.nextInt();

        contoAllaRovescia(n);
    }
    public static void contoAllaRovescia(int n){
        if (n < 0){
            System.out.println("Il numero deve essere maggiore o uguale a zero.");
        } else {
            System.out.println("Conto alla rovescia a partire da " + n + ":");
           for (int i = n; i >=0; i--) {
               System.out.println(i);
           }
        }
    }
}
