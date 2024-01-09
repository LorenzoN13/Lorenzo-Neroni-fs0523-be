package it_epicode.week1.day2;

import java.util.Scanner;

public class Sconto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci il prezzo");
        double prezzo = scanner.nextDouble();

        double prezzoScontato;

        if (prezzo < 30){
            prezzoScontato = prezzo - (prezzo * 12)/100;
        } else {
            prezzoScontato = prezzo - (prezzo *25)/100;
        }

        System.out.println(prezzoScontato);
    }
}
