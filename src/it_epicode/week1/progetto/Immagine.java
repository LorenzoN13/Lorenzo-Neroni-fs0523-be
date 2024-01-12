package it_epicode.week1.progetto;

public class Immagine implements Multimediale {
    private String titolo;
    private int luminosita;

    public Immagine(String titolo, int luminosita) {
        this.titolo = titolo;
        this.luminosita = luminosita;
    }
    @Override
    public void esegui() {
        mostra();
    }
    public void mostra(){
        System.out.println(titolo + ": " + "*".repeat(luminosita));
    }
}
