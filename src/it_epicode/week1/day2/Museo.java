package it_epicode.week1.day2;

import java.util.Scanner;

public class Museo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Scegli un opzione tra 1 e 4");

        int scelta = scanner.nextInt();
        /*
        if (scelta == 1){
            System.out.println("Biglietto gratuito");
        } else if (scelta == 2) {
            System.out.println("Biglietto costa 8 Euro");
        } else if (scelta ==3) {
            System.out.println("Biglietto costa 10 Euro");
        } else if (scelta ==4) {
            System.out.println("Biglietto costa 15 Euro");
        } else {
            System.out.println("Scelta errata");
        }*/

        switch (scelta){
            case 1:
                System.out.println("Biglietto gratuito");
                break;
            case 2:
                System.out.println("Biglietto costa 8 Euro");
                break;
            case 3:
                System.out.println("Biglietto costa 10 Euro");
                break;
            case 4:
                System.out.println("Biglietto costa 15 Euro");
                break;
            default:
                System.out.println("Scelata errata");
        }
    }
}
