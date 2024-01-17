package it_epicode.week2.day3.Esercizio2;
import it_epicode.week2.day3.Esercizio1.Order;
import it_epicode.week2.day3.Esercizio1.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OrdineFiltrato {
    public static void main(String[] args) {
        List<Product> produtti = new ArrayList<>();
        produtti.add(new Product(1L, "ToyStory", "Baby", 15.0));
        produtti.add(new Product(2L, "Atlante", "Books", 120.0));
        produtti.add(new Product(3L, "Unicorni", "Baby", 25.0));

        List<Order> orders = new ArrayList<>();
        orders.add(new Order(1L, "Shipped", LocalDate.now(), LocalDate.now().plusDays(3), produtti.subList(0, 1), null));
        orders.add(new Order(2L, "Pending", LocalDate.now(), LocalDate.now().plusDays(5), produtti.subList(1, 2), null));

        List<Order> FiltraOrdini = orders.stream().filter(order -> order.getProducts().stream().anyMatch(product -> "Baby".equals(product.getCategory()))).collect(Collectors.toList());

        System.out.println("Ordini con prodotti che appartengono alla categoria 'Baby':");
        FiltraOrdini.forEach(order -> System.out.println("Ordine ID: " + order.getId() + ", Stato: " + order.getStatus() + ", Prodotto: " + order.getProducts().stream().map(Product::getName).collect(Collectors.joining(", "))));
    }
}
