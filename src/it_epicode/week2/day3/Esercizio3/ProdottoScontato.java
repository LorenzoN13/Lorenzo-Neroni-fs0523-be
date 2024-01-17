package it_epicode.week2.day3.Esercizio3;
import it_epicode.week2.day3.Esercizio1.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProdottoScontato {
    public static void main(String[] args) {
        List<Product> produtti = new ArrayList<>();
        produtti.add(new Product(1L, "Piccoli Brividi", "Boys", 27.0));
        produtti.add(new Product(2L, "Barbi", "Girls", 24.0));
        produtti.add(new Product(3L, "Tartarughe Ninja", "Boys", 30.0));

        List<Product> discountedProducts = produtti.stream().filter(product -> "Boys".equals(product.getCategory())).map(Product::applicaSconto).collect(Collectors.toList());

        System.out.println("Prodotti che appartengono alla categoria 'Boys' con sconto del 10%:");
        discountedProducts.forEach(product -> System.out.println("Nome: " + product.getName() + ", Categoria: " + product.getCategory() + ", Prezzo Scontato: " + product.getPrice()));
    }
}
