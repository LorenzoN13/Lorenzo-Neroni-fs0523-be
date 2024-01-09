package it_epicode.week1.day1;

import java.util.Scanner;

public class PrimaClasse {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Dammi un numero");

        int j = scanner.nextInt();

        System.out.println(j);

        scanner.nextLine();

        System.out.println("Dammi una parola");

        String parola = scanner.nextLine();

        System.out.println(parola.length());


        int x;

        x = 8;

        int y = 0;

        y = 7;

        final int r = 6; //Final ci permette di avere la variabile fissa e non più modificabile.

        boolean b = true;

        char c = 'e';// si deve mettere solo un carattere.
        byte s = 3; //puo contenere numeri che vanno da -128 a 127.
        short l = 30000;
        long f = 300000000;
        float p = 3.5f; //quella f sta a significare java guarda che quel tipo è un float non un double.
        double n = 4.5;

        String frase = "corso java";//in java non la stringa deve avere per forza i doppi apici.
        String frase2 = "Epicode";
        String fraseConcatenata = frase + frase2;

        System.out.println(fraseConcatenata);
        System.out.println("Ciao");

        int z = l;

        float f2= z;


        System.out.println(z);
        System.out.println(f2);

        z = z/6;

        System.out.println(z);

        z = z%6;

        System.out.println(z);

        double somma = somma( 4, 5);
        System.out.println(somma);

        benvenuto("Lorenzo");
    }

    public static double somma(double x, double y){
        double somma = x + y;
        return somma;
    }

    public static void benvenuto(String nome){
        System.out.println("Benvenuto " + nome);
    }
}
