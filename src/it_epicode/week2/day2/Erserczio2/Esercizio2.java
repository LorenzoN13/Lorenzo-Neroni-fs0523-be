package it_epicode.week2.day2.Erserczio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Esercizio2 {
    public static List<Integer> generaListaRandom(int N) {
        List<Integer> ListaRandom = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            ListaRandom.add((int) (Math.random() * 101));
        }
        Collections.sort(ListaRandom);
        return ListaRandom;
    }
    public static List<Integer> concatenaRibata(List<Integer> entrataDelValore) {
        List<Integer> risultato = new ArrayList<>(entrataDelValore);
        Collections.reverse(risultato);
        entrataDelValore.addAll(risultato);
        return entrataDelValore;
    }

    public static void stampaIlValore(List<Integer> inputList, boolean evento) {
        for (int i = evento ? 0 : 1; i < inputList.size(); i += 2) {
            System.out.println(inputList.get(i));
        }
    }

    public static void main(String[] args) {

        int N = 5;
        List<Integer> randomList = generaListaRandom(N);
        System.out.println("Lista casuale ordinata: " + randomList);

        List<Integer> concatenaRibata = concatenaRibata(randomList);
        System.out.println("Lista concatenata e invertita: " + concatenaRibata);

        System.out.println("Stampa valori in posizioni pari:");
        stampaIlValore(concatenaRibata, true);

        System.out.println("Stampa valori in posizioni dispari:");
        stampaIlValore(concatenaRibata, false);
    }
}
