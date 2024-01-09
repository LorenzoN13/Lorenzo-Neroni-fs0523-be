package it_epicode.week1.day2;

import java.util.Scanner;

public class Bolletta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci il consumo di acqua");
        int consumo = scanner.nextInt();

        double bolletta = 20;

        if (consumo <= 100){
            bolletta = bolletta + consumo * 2.5;
        } else {
            bolletta = bolletta + 250 + (consumo - 100) * 4;
        }

        System.out.println(bolletta);
    }
}
