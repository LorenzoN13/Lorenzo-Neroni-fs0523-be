package it_epicode.week2.day3.Esercizio1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Prodottofiltrato {
    public static void main(String[] args) {
        List<Product> prodotti = new ArrayList<>();
        prodotti.add(new Product(1L, "Viaggio al centro della Terra", "Libri", 20.0));
        prodotti.add(new Product(2L, "Viaggio nell'isola misteriosa", "Libri", 150.0));
        prodotti.add(new Product(3L, "Viaggio al centro dell' univeso", "Libri", 17.0));

        List<Product> filtraProdotti = prodotti.stream().filter(product -> "Libri".equals(product.getCategory()) && product.getPrice() > 100.0).collect(Collectors.toList());

        System.out.println("Prodotti che appartengono alla categoria 'Libri' e hanno un prezzo superiore 100:");
        filtraProdotti.forEach(product -> System.out.println(product.getName() + "\nCosto: " +product.getPrice()));
    }
}
