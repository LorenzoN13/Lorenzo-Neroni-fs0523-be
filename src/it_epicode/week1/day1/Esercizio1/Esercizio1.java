package it_epicode.week1.day1.Esercizio1;

import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Primo Metodo
        System.out.println("Dammi il primo numero");
        int a = scanner.nextInt();

        System.out.println("Dammi il secondo numero");
        int b = scanner.nextInt();

        int prodotto = moltiplica(a, b);

        System.out.println(prodotto);


        //Secondo Metodo
        System.out.println("Dammi una stringa");
        String parola = scanner.next();

        System.out.println("Dammi il numero");
        int numero = scanner.nextInt();

        String parolaConcatenata = concatena(parola, numero);

        System.out.println(parolaConcatenata);


        //Terzo Metodo
        String[] parole = {"Margherita", "Diavola", "Boscaiola", "4 Formaggi", "Patate"};

        String parolaDaAInserire = "Marinara";

        String[] paroleInserite = inserisciInArray(parole, parolaDaAInserire);

        for (int i = 0; i <paroleInserite.length; i++) {
            System.out.println(paroleInserite[i]);
        }

    }

    public static int moltiplica(int a, int b){
        return a * b;
    }

    public static String concatena(String s, int a){
        return s + a;
    }
    public static String[] inserisciInArray(String[] parole, String parolaDaInserire){
        String[] paroleInserite = {parole[0], parole[1], parolaDaInserire, parole[2], parole[3], parole[4]};
        return paroleInserite;
    }
}
