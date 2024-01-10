package it_epicode.week1.day3.Esercizio2;
import java.util.ArrayList;
public class Sim {

    private long numeroTelefono;
    private double credito;
    private ArrayList<Chiamata> ultimeChiamate;

    public Sim(long numeroTelefono, double credito) {
        this.numeroTelefono = numeroTelefono;
        this.credito = credito;
        this.ultimeChiamate = new ArrayList<>();
    }
    public long getNumeroTelefono() {
        return numeroTelefono;
    }

    public double getCredito() {
        return credito;
    }

    public ArrayList<Chiamata> getUltimeChiamate() {
        return ultimeChiamate;
    }

    public void aggiungiChiamata(Chiamata chiamata) {
        ultimeChiamate.add(chiamata);
    }

    public void setCredito(double nuovoCredito) {
        this.credito = nuovoCredito;
    }

    public void stampaDatiSIM() {
        System.out.println("Numero di telefono: " + numeroTelefono);
        System.out.println("Credito disponibile: " + credito + " euro");

        System.out.println("Ultime chiamate effettuate:");
        for (Chiamata chiamata : ultimeChiamate) {
            System.out.println("Numero chiamato: " + chiamata.getNumeroChiamato() + ", Durata: " + chiamata.getDurataMinuti() + " minuti");
        }
    }
    public void ricaricaCredito(double importo) {
        this.credito += importo;
    }
    public void effettuaChiamata(int durataSecondi, double costoAlMinuto) {
        double costoTot = durataSecondi * costoAlMinuto;

        if (costoTot<= credito) {
            Chiamata nuovaChiamata = new Chiamata(durataSecondi, numeroTelefono);
            ultimeChiamate.add(nuovaChiamata);
            this.credito -= costoTot;
            System.out.println("Chiamata effettuata di " + durataSecondi + " secondi. Costo della chiamata: " + costoTot + " euro");
        } else {
            System.out.println("Credito insufficiente per effettuare la chiamata.");
        }
    }

}


