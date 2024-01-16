package it_epicode.week2.day2;

public class Aritcolo {
    private String titolo;
    private String categoria;
    private double prezzo;

    public Aritcolo(String titolo, String categoria, double prezzo) {
        this.titolo = titolo;
        this.categoria = categoria;
        this.prezzo = prezzo;
    }
    public String getTitolo() {
        return titolo;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return " Aritcolo {" + " titolo='" + titolo + '\'' + ", categoria='" + categoria + '\'' + ", prezzo=" + prezzo + '}';
    }
}
