package it_epicode.week1.day2.Eserczio1;

import java.util.Scanner;

public class Eserczio1 {
    public static void main(String[] args) {
        //Primo Esercizio
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci la parola");

        String p = scanner.nextLine();

        Boolean stringaPariDispari = stringaPariDispari(p);
        System.out.println(stringaPariDispari);

        //secondo Eserczio
        System.out.println("Inserisci un anno");
        int n = scanner.nextInt();

        Boolean anno = annoBisestile(n);
        System.out.println(anno);
    }
    public static boolean stringaPariDispari(String p){

        if ((p.length() % 2) == 0){
            return true;
        }else{
            return false;
        }
    }
    public static boolean annoBisestile(int n){
        if ((n % 4 == 0 && n % 100 == 0 && n % 400 == 0) || (n % 4 == 0 && n % 100 != 0)){
            return true;
        }else{
            return false;
        }
    }
}
