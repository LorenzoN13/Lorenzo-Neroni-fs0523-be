package it_epicode.week2.day2.Esercizio3;

import java.util.HashMap;
import java.util.Map;

public class RubricaTelefonica {
    private Map<String, Integer> rubrica;

    public RubricaTelefonica() {
        rubrica = new HashMap<>();
    }

    public void inserisciContatto(String nome, int numeroTelefono) {
        rubrica.put(nome, numeroTelefono);
    }

    public void cancellaContatto(String nome) {
        rubrica.remove(nome);
    }

    public String cercaPersonaPerNumero(String numeroTelefono) {
        for (Map.Entry<String, Integer> entry : rubrica.entrySet()) {
            if (entry.getValue().equals(numeroTelefono)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public Integer cercaNumeroPerNome(String nome) {
        return rubrica.get(nome);
    }

    public void stampaRubrica() {
        System.out.println("Rubrica Telefonica:");
        for (Map.Entry<String, Integer> entry : rubrica.entrySet()) {
            System.out.println("Nome: " + entry.getKey() + ", Numero: " + entry.getValue());
        }
    }

}
