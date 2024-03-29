package it_epicode.week2.day3;

import java.util.TreeSet;

public class UsaTreeSet {

    public static void main(String[] args) {
        //Ordinatore ordinatore = new Ordinatore();

        TreeSet<String> parole = new TreeSet<>((o1, o2) -> o2.compareTo(o1));
        parole.add("Java");
        parole.add("C++");
        parole.add("Python");
        parole.add("JavaScript");

        System.out.println(parole);
    }
}
