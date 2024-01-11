package it_epicode.week1.day4.Esercizio2;

public class GestioneDipendenti {
    public static void main(String[] args) {
        Dipendente operaio1 = new Dipendente("Luigi", "Macchiarulo","Operaio",1500);
        Dipendente operaio2 = new Dipendente("Francesco", "Rovereto","Operaio",1600);
        Dipendente impiegato = new Dipendente("Ernesto", "Colpito","Impiegato",2400);
        Dipendente dirigente = new Dipendente("Martina", "Quizzi","Dirigente",3500);

        operaio1.aumentaStipendio(10);
        operaio1 = new Dipendente(operaio1.getNome(), operaio1.getCongnome(),"Impiegato", operaio1.getStipendio());

        impiegato.aumentaStipendio(15);
        impiegato = new Dipendente(impiegato.getNome(), impiegato.getCongnome(),"Quadro", impiegato.getStipendio());

        System.out.println("Stato dei dipendenti dopo la promozione:");

        System.out.println(operaio1);
        System.out.println(operaio2);
        System.out.println(impiegato);
        System.out.println(dirigente);

        double totStipendi = operaio1.getStipendio() + operaio2.getStipendio() + impiegato.getStipendio() + dirigente.getStipendio();
        totStipendi += (5 * 4 * 4);

        System.out.println("\n Ecco il totale degli stipendi con 5 ore di straordinario: " + totStipendi);

    }
}
