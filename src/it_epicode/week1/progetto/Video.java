package it_epicode.week1.progetto;

public class Video implements Avvia{
        private String titolo;
        private int durata;
        private int volume;
        private  int luminosita;

    public Video(String titolo, int durata, int volume, int luminosita) {
        this.titolo = titolo;
        this.durata = durata;
        this.volume = volume;
        this.luminosita = luminosita;
    }
    @Override
    public void esegui() {
        play();
    }
    @Override
    public void play() {
        int i = 0;
        while (i < durata){
            System.out.println(titolo + ": " + "!".repeat(volume) + "*".repeat(luminosita));
            i++;
        }
    }
    @Override
    public void aumentaLuminosita() {
        luminosita ++;
    }
    @Override
    public void diminuisciLuminosita() {
        luminosita--;
    }
}
