package it_epicode.week2.day2;

public class UsaCarello {
    public static void main(String[] args) {
        Carello carello = new Carello();

        Aritcolo a1 = new Aritcolo("quaderno", "Consumabili", 12);
        Aritcolo a2 = new Aritcolo("penna", "Consumabili", 1.3);
        Aritcolo a3 = new Aritcolo("quadro", "Non Consumabile", 13);

        carello.aggiungiArticolo(a1);
        carello.aggiungiArticolo(a2);
        carello.aggiungiArticolo(a3);
        carello.aggiungiArticolo(a2);

        carello.stampaArticoli();


        System.out.println("IL totale del carello è di: " + carello.totale());
    }
}
