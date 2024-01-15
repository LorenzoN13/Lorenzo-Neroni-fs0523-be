package it_epicode.week2.day1.Esercizio2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Esercizio2 {

    private static final Logger logger = LoggerFactory.getLogger("Esercizio2");

    private static double calcolaKmPerLitro(double Km, double litri){
        if (litri == 0){
            throw new ArithmeticException("Divisione per 0.");
        }
        return Km / litri;
    }

    private static void verificaLitriConsumati(double litri){
        if (litri == 0){
            throw new ArithmeticException("Divisione per 0.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Inserisci i km percorsi: ");
            double kmPercorsi = scanner.nextDouble();

            System.out.print("Inserisci i litri di carburante consumati: ");
            double litriConsumati = scanner.nextDouble();

            verificaLitriConsumati(litriConsumati);

            double kmPerLitro = calcolaKmPerLitro(kmPercorsi, litriConsumati);

            System.out.println("Il numero di km/litro percorsi è: " + kmPerLitro);

        } catch (InputMismatchException e) {
            logger.error("Inserire un numero valido.");
        } catch (ArithmeticException e) {
            logger.error("Errore di divisione per zero. Inserire un valore diverso da 0 per i litri consumati.");
        }
    }
}
