package it_epicode.week2.day2.Esercizio1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Esercizio1 {
    private Set<String> paroleSet;

    public Esercizio1() {
        this.paroleSet = new HashSet<>();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci il numero di eleminti: ");
        int N = scanner.nextInt();

        Set<String> parole = new HashSet<>();

        System.out.println("Inserisci le parole: ");

        for (int i = 0; i < N; i++){
            String p = scanner.next();
            parole.add(p);
        }

        System.out.println("Numero palore distinte: " + parole.size());

        System.out.println("Lista delle parole distinte: ");
        for (String parolaDsitinta:parole){
            System.out.println(parolaDsitinta);
        }

        System.out.println("Parole duplicate:");
        Set<String> paroleDuplicate = trovaParola(parole);
        for (String parola : paroleDuplicate) {
            System.out.println(parola);
        }

    }
    private static Set<String> trovaParola(Set<String> parole){
        Set<String> paroleDuplicate = new HashSet<>();
        Set<String> paroleUniche= new HashSet<>();

        for (String parola:parole){
            if (!paroleUniche.add(parola)){
                paroleDuplicate.add(parola);
            }
        }
        return paroleDuplicate;
    }


}
