package it_epicode.week2.day1;

import java.sql.SQLException;

public class UsaAAritmetica {

    public static void main(String[] args) {
        Aritmetica aritmetica = new Aritmetica(); //creao l'oggeto Aritmetica.

        try {
            System.out.println(aritmetica.divisione(5, 0));
        }
        catch (ArithmeticException e){
            System.out.println("Divisione per 0 non ammessa");
        }catch (Exception e){

        }
        finally {

        }

        System.out.println("Programma finito");
    }
}
