package it_epicode.week2.day3.Esercizio4;
import it_epicode.week2.day3.Esercizio1.Order;
import it_epicode.week2.day3.Esercizio1.Product;
import it_epicode.week2.day3.Esercizio1.Customer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProdottoOrdinato {

    public static void main(String[] args) {

        List<Product> prodotti = new ArrayList<>();
        prodotti.add(new Product(1L, "Alla ricerca di Nemo", "Books", 120.0));
        prodotti.add(new Product(2L, "Toy Story2", "Toys", 25.0));
        prodotti.add(new Product(3L, "Dracula", "Books", 90.0));

        List<Customer> clienti = new ArrayList<>();
        clienti.add(new Customer(1L, "Cliente1", 1));
        clienti.add(new Customer(2L, "Cliente2", 2));
        clienti.add(new Customer(3L, "Cliente3", 3));

        List<Order> ordini = new ArrayList<>();
        ordini.add(new Order(1L, "Shipped", LocalDate.parse("2021-02-05"), LocalDate.parse("2021-02-10"), prodotti.subList(0, 1), clienti.get(0)));
        ordini.add(new Order(2L, "Pending", LocalDate.parse("2021-03-15"), LocalDate.parse("2021-03-20"), prodotti.subList(1, 2), clienti.get(1)));
        ordini.add(new Order(3L, "Delivered", LocalDate.parse("2021-04-01"), LocalDate.parse("2021-04-05"), prodotti.subList(2, 3), clienti.get(2)));


        List<Product> orderedProducts = ordini.stream()
                .filter(order -> order.getCustomer().getTier() == 2 && order.getOrderDate().isAfter(LocalDate.parse("2021-02-01")) && order.getOrderDate().isBefore(LocalDate
                        .parse("2021-04-01"))).flatMap(order -> order.getProducts().stream()).collect(Collectors.toList());

        orderedProducts.sort((p1, p2) -> p1.getName().compareTo(p2.getName()));

        System.out.println("Prodotti ordinati da clienti di livello 2 tra il 01-Feb-2021 e il 01-Apr-2021:");
        orderedProducts.forEach(product -> System.out.println("Name: " + product.getName() + ", Category: " + product.getCategory() + ", Price: " + product.getPrice()));
    }
}
