package it_epicode.week1.day4;

public class ContrattoTelefonico {
    private int numeroTel;
    private String utente;
    private double costoTelefonate;

    private int numeroTelefonate;

    private final double COSTO_AL_SECONDO;

    public ContrattoTelefonico(int numeroTel, String utente, double COSTO_AL_SECONDO) {
        this.numeroTel = numeroTel;
        this.utente = utente;
        this.COSTO_AL_SECONDO = COSTO_AL_SECONDO;
    }

    public int getNumeroTel() {
        return numeroTel;
    }

    public String getUtente() {
        return utente;
    }

    public double getCostoTelefonate() {
        return costoTelefonate;
    }

    public int getNumeroTelefonate() {
        return numeroTelefonate;
    }

    public double getCOSTO_AL_SECONDO() {
        return COSTO_AL_SECONDO;
    }

    public void aggiornaBoletta(int secondi){
        numeroTelefonate ++;

        costoTelefonate += secondi * COSTO_AL_SECONDO;
    }

    public void aggiungiCosti(double costo){
        costoTelefonate += costo;
    }

    @Override
    public String toString() {
        return "ContrattoTelefonico{" +
                "numeroTel=" + numeroTel +
                ", utente='" + utente + '\'' +
                ", costoTelefonate=" + costoTelefonate +
                ", numeroTelefonate=" + numeroTelefonate +
                ", COSTO_AL_SECONDO=" + COSTO_AL_SECONDO +
                '}';
    }
}
