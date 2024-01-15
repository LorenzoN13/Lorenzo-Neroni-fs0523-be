package it_epicode.week2.day1.Esercizio3;

public class ContoOnline extends ContoCorrente{
    double maxPrelievo;

    ContoOnline(String titolare, double saldo, double maXP){
        super(titolare, saldo);
        this.maxPrelievo = maXP;
    }

    void preleva(double x) throws BancaException {
        if (x > maxPrelievo) {
            throw new BancaException("Il prelievo non è disponibile a causa dell'immite imposto cioè di: " + maxPrelievo);
        }

        super.preleva(x);
    }

    void stampaSaldo(){
        System.out.println("Titolare: " + titolare + " -Saldo: " + saldo + " -Num movimenti: " + nMovimenti + " -Massimo movimenti: " + maxMovimenti + " -Massimo prelievo possoibile: "
        + maxPrelievo);
    }
}
