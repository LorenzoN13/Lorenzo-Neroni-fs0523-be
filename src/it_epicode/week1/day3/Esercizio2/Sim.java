package it_epicode.week1.day3.Esercizio2;
public class Sim {

    private long numeroTelefono;
    private double credito;
    private Chiamata[] ultimeChiamate;
    private int numeroChiamate;


    public Sim(long numeroTelefono, double credito) {
        this.numeroTelefono = numeroTelefono;
        this.credito = credito;
        this.ultimeChiamate = new Chiamata[5];
        this.numeroChiamate = 0;
    }
    public long getNumeroTelefono() {
        return numeroTelefono;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double nuovoCredito) {
        this.credito = nuovoCredito;
    }

    public void stampaDatiSIM() {
        System.out.println("Numero di telefono: " + numeroTelefono);
        System.out.println("Credito disponibile: " + credito + " euro");

        System.out.println("Ultime chiamate effettuate:");
        for (int i = 0; i < numeroChiamate; i++) {
            System.out.println("Numero chiamato: " + ultimeChiamate[i].getNumeroChiamato() + ", Durata: " + ultimeChiamate[i].getDurataMinuti() + " minuti");
        }
    }
    public void ricaricaCredito(double importo) {
        this.credito += importo;
    }
    public void effettuaChiamata(int durataSecondi, double costoAlMinuto) {
        double costoTot = durataSecondi * costoAlMinuto;

        if (costoTot<= credito) {
            Chiamata nuovaChiamata = new Chiamata(durataSecondi, numeroTelefono);
            this.credito -= costoTot;
            System.out.println("Chiamata effettuata di " + durataSecondi + " secondi. Costo della chiamata: " + costoTot + " euro");
        } else {
            System.out.println("Credito insufficiente per effettuare la chiamata.");
        }
    }

    public void aggiungiChiamata(Chiamata chiamata) {
        if (numeroChiamate < 5) {
            ultimeChiamate[numeroChiamate] = chiamata;
            numeroChiamate++;
        } else {
            for (int i = 0; i < 4; i++) {
                ultimeChiamate[i] = ultimeChiamate[i + 1];
            }
            ultimeChiamate[4] = chiamata;
        }
    }

}


