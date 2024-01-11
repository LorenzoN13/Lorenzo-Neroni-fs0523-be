package it_epicode.week1.day4;

public class ContrattoMobile extends ContrattoTelefonico {

    private final double COSTO_ALLA_RISPOSTA;


    public ContrattoMobile(int numeroTel, String utente, double COSTO_AL_SECONDO, double COSTO_ALLA_RISPOSTA){
        super(numeroTel, utente,COSTO_AL_SECONDO);
        this.COSTO_ALLA_RISPOSTA = COSTO_ALLA_RISPOSTA;
    }

    @Override
    public void aggiornaBoletta(int secondi) {
        numeroTelefonate ++;
        costoTelefonate += secondi * COSTO_AL_SECONDO;
    }
}
