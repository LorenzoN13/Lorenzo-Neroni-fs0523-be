package it_epicode.week1.day4.Esercizio1;

public class Dipendente {
    private static final double stipendioBase = 1000;

    private String matricola;
    private double stipendio;
    private double importoOrarioStraordinario;
    private String livello;
    private String dipartimento;

    public Dipendente(String matricola, double stipendio, double importoOrarioStraordinario, String livello, String dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.importoOrarioStraordinario = importoOrarioStraordinario;
        this.livello = livello;
        this.dipartimento = dipartimento;
    }

    public Dipendente(String matricola, String dipartimento) {
        this.matricola = matricola;
        this.dipartimento = dipartimento;
        this.stipendio = stipendioBase;
        this.importoOrarioStraordinario = 30;
        this.livello = "OPERAIO";
    }

    public void stampaDatiDipendente(){
        System.out.println("Matrcola: " + matricola);
        System.out.println("Dipartimento: " + dipartimento);
        System.out.println("Livello: " + livello);
        System.out.println("Stipendio: " + stipendio);
        System.out.println("Importo dell'orario dello straordinario: " + importoOrarioStraordinario);
    }

    public String promuovi(){
        if("OPERAIO".equals(livello)){
            livello = "IMPIEGATO";
        } else if ("IMPIEGATO".equals(livello)) {
            livello = "QUADRO";
        } else if ("QUADRO".equals(livello)) {
            livello = "DIRIGENTE";
        } else System.out.println("Errore il dipendente è già di livello DIRIGENTE.");



        if ("IMPIEGATO".equals(livello)){
            stipendio *= 1.2;
        } else if ("QUADRO".equals(livello)) {
            stipendio *= 1.5;
        } else if ("DIRIGENTE".equals(livello)) stipendio *= 2;

        return livello;
    }

    public String getMatricola() {
        return matricola;
    }
    public double getStipendio() {
        return stipendio;
    }
    public String getLivello() {
        return livello;
    }
    public void setImportoOrarioStraordinario(double nuovoImporto) {
        this.importoOrarioStraordinario = nuovoImporto;
    }
    public void setDipartimento(String nuovoDipartimento) {
            this.dipartimento = nuovoDipartimento;
    }
    public static double calcolaPaga(Dipendente dipendente){
        return dipendente.stipendio;
    }

    public static double calcolaPagaConStraordinario(Dipendente dipendente, int oreStraordinario){
        return dipendente.stipendio + (oreStraordinario * dipendente.importoOrarioStraordinario);
    }
}
