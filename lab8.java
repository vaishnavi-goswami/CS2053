import java.util.*;

class Box<T> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public void displayItems() {
        System.out.println("Box contains:");
        for (T item : items) {
            System.out.println(" - " + item);
        }
    }
}

public class Lab8 {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.addItem(10);   
        intBox.addItem(20);
        intBox.addItem(30);
        intBox.displayItems();

        System.out.println();

        Box<String> strBox = new Box<>();
        strBox.addItem("Apples");
        strBox.addItem("Oranges");
        strBox.addItem("Bananas");
        strBox.displayItems();

        System.out.println();

        Box<Double> dblBox = new Box<>();
        dblBox.addItem(12.5);
        dblBox.addItem(8.9);
        dblBox.displayItems();

        System.out.println();

        ArrayList<Integer> quantities = new ArrayList<>();
        quantities.add(5);  
        quantities.add(10);
        quantities.add(15);

        System.out.println("Quantities list (autoboxed Integers): " + quantities);
    }
}
