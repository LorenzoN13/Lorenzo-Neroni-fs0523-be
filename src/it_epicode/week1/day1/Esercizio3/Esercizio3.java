package it_epicode.week1.day1.Esercizio3;

public class Esercizio3 {
    public static void main(String[] args){
        double somma = calcolaIlPerimetro(3.45 , 5.7);
        System.out.println("Il perimetro del rettangolo è di: " + somma);

        int p = 12;
        System.out.println("Il numero se è pari allora è 0 altrimenti se è dispari allora è 1.");
        System.out.println("Il numero " + p + " è pari? " + pariDispari(p));


        double somma1 = areaTriangolo( 4, 5, 7);
        System.out.println("L'area del triangolo è di: " + somma1);
    }
    public static double calcolaIlPerimetro(double b, double h){
        double somma = (b + h)*2;
        return somma;
    }
    public static int pariDispari(int p){
        if ((p % 2) ==0){
            return 0;
        }else{
            return 1;
        }
    }
    public static double areaTriangolo(double a , double b, double c){
        double area = Math.sqrt((a+b+c)*(-a+b+c)*(a-b+c)*(a+b+c)/4);
        return area;

    }
}
