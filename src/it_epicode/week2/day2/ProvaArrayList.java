package it_epicode.week2.day2;

import java.util.ArrayList;
import java.util.LinkedList;


public class ProvaArrayList {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList();//In questo oggetto abbiamo utilizzato le parentesi angolari <> contenente
        // il tipo String in cui gli diciamo guarda sono ammesse solo i dati di tipo STRING.

        //int[] numeri = new int[3];

        /* Si possono utilizzare anche questi Tipi per creare un Arrey per l'input di entrata dei dati.
        Intger
        Byte
        Short
        Long
        Double
        Float
        Boolean
        Character
         */

        lista.add("Cagliari");
        lista.add("Empoli");
        lista.add("Sassuolo");
        lista.add("Udinese");

        String s = lista.get(1); //il metodo .get() ci permette di vedere la il valore richisto cioe in questo caso il valore che
        // sta alla posizione 1.
        System.out.println(s);

        System.out.println(lista.size()); //il metodo .size() ci permette di vedere la lunghezza dell'Arrey.

        System.out.println(lista.indexOf("Udinese")); //Il metodo .indexOf() ci permette di vedere a che posizione si trova
        // il valore richiesto cioe il valore "Udinese che si trova in 3 posizione".

        System.out.println(lista.remove("Udinese"));// Il metodo .remove() ci permette di rimuovere il valore richiesto.

        System.out.println(lista.set(0, "Roma"));// Il metodo .set() ci permette di sostituire la posizione richiesta con un altro valore.

        System.out.println(lista);

        Object[] parole = lista.toArray();

        String[] squadre = new String[5];

        lista.toArray(squadre);

        for (int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }

        for (String c:lista){//il For avanzato ci prmette di leggere soltanto i dati.
            System.out.println(c);
        }

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.pollFirst();
    }
}
