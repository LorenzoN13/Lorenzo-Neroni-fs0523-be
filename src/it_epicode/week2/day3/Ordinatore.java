package it_epicode.week2.day3;

import java.util.Comparator;

public class Ordinatore  implements Comparator<String> {
    public int compare(String o1, String o2){
        return o2.compareTo(o1);
    }

}
