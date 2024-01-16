package it_epicode.week2.day2.Esercizio3;

import java.util.Scanner;

public class UsaRubricaTelefonica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci il tuo nome: ");
        String p1 = scanner.nextLine();
        System.out.println("Inserisci il tuo numero "+ p1 + ":");
        int n1 = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Inserisci il tuo nome: ");
        String p2 = scanner.nextLine();
        System.out.println("Inserisci il tuo numero "+ p2 + ":");
        int n2 = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Inserisci il tuo nome ");
        String p3 = scanner.nextLine();
        System.out.println("Inserisci il tuo numero "+ p3 + ":");
        int n3 = scanner.nextInt();

        RubricaTelefonica rubricaTelefonica = new RubricaTelefonica();

        rubricaTelefonica.inserisciContatto(p1, n1);
        rubricaTelefonica.inserisciContatto(p2, n2);
        rubricaTelefonica.inserisciContatto(p3, n3);

        rubricaTelefonica.stampaRubrica();

        System.out.println("Numero di telefono di: "+ p1 + rubricaTelefonica.cercaNumeroPerNome(p1));
        System.out.println("Nome della persona con numero " +p3 +" :"+ rubricaTelefonica.cercaPersonaPerNumero(p3));

        rubricaTelefonica.cancellaContatto(p2);

        rubricaTelefonica.stampaRubrica();
    }
}
