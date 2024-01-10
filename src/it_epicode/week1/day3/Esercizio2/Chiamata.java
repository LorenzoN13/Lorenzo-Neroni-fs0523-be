package it_epicode.week1.day3.Esercizio2;

public class Chiamata {
    private int durataMinuti;
    private long numeroChiamato;

    public Chiamata(int durataMinuti, long numeroChiamato ) {
        this.durataMinuti = durataMinuti;
        this.numeroChiamato = numeroChiamato;
    }

    public int getDurataMinuti() {
        return durataMinuti;
    }

    public long getNumeroChiamato() {
        return numeroChiamato;
    }

}
