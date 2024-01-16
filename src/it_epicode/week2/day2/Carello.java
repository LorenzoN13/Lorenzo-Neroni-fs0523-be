package it_epicode.week2.day2;

import java.util.ArrayList;

public class Carello {

    private ArrayList<Aritcolo> carello;

    public Carello(){
        carello = new ArrayList<>();
    }

    public void aggiungiArticolo(Aritcolo articolo) {
        this.carello.add(articolo);
    }

    public void stampaArticoli(){
        System.out.println(carello);
    }

    public double totale(){
        double costoCarello = 0;

        for (Aritcolo aritcolo:carello){
            costoCarello += aritcolo.getPrezzo();
        }

        return costoCarello;
    }
}
