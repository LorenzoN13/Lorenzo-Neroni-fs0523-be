package it_epicode.week1.day2.Esercizio3;

import java.util.Scanner;

public class Esercizio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String p;

        do{
            System.out.println("inserisci una parola");
            p = scanner.nextLine();

            if (!p.equals(":q")){
                for (int i = 0; i < p.length(); i++){
                    System.out.print(p.charAt(i));

                    if (i != p.length() -1)
                        System.out.print(",");
                }
                System.out.println();
            }
        } while(!p.equals(":q"));
    }
}
