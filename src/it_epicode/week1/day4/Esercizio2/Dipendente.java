package it_epicode.week1.day4.Esercizio2;

public class Dipendente {
    private String nome;
    private String congnome;
    private String mansione;
    private double stipendio;

    public Dipendente(String nome, String congnome, String mansione, double stipendio) {
        this.nome = nome;
        this.congnome = congnome;
        this.mansione = mansione;
        this.stipendio = stipendio;
    }
    public String getNome() {
        return nome;
    }
    public String getCongnome() {
        return congnome;
    }
    public String getMansione() {
        return mansione;
    }
    public double getStipendio() {
        return stipendio;
    }
    public void aumentaStipendio(double percentualeAumento){
        this.stipendio += this.stipendio * percentualeAumento / 100;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Cognome: " + congnome + ", Mansione: " + mansione + ", Stipendio: " + stipendio;
    }
}
