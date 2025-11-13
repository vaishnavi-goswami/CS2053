import java.util.*;

public class Lab11 {
    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Laptop", 55000));
        productList.add(new Product("Mouse", 500));
        productList.add(new Product("Keyboard", 1200));
        productList.add(new Product("Monitor", 8500));

        System.out.println("Original List:");
        productList.forEach(System.out::println);

        productList.sort((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()));
        System.out.println("\nSorted by Price (Low to High):");
        productList.forEach(System.out::println);

        productList.sort((p1, p2) -> p1.getName().compareTo(p2.getName()));
        System.out.println("\nSorted by Name (A-Z):");
        productList.forEach(System.out::println);
    }
}

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " - ₹" + price;
    }
}
