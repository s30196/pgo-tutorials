import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Task 1
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", 2010));
        cars.add(new Car("Honda ", 2015));
        cars.add(new Car("Ford", 2012));
        cars.add(new Car("Chevrolet ", 2018));
        cars.add(new Car("Nissan ", 2013));
        cars.add(new Car("BMW ", 2019));
        cars.add(new Car("Audi ", 2016));
        cars.add(new Car("Mercedes", 2017));
        cars.add(new Car("Lexus", 2011));
        cars.add(new Car("Mazda", 2014));

        Collections.sort(cars);

        System.out.println("Sorted Cars:");
        for (Car car : cars) {
            System.out.println(car);
        }
        System.out.println();

        // Task 2
        ArrayList<Item> itemList = new ArrayList<>();
        itemList.add(new Item(1, "Item1"));
        itemList.add(new Item(2, "Item2"));
        itemList.add(new Item(3, "Item3"));
        itemList.add(new Item(4, "Item4"));
        itemList.add(new Item(5, "Item5"));

        System.out.println("Items List:");
        for (Item item : itemList) {
            item.show();
        }
        System.out.println();

        HashMap<Integer, String> itemMap = new HashMap<>();
        for (Item item : itemList) {
            itemMap.put(item.getId(), item.getName());
        }

        System.out.println("Items in HashMap:");
        for (Map.Entry<Integer, String> entry : itemMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
        System.out.println();

        // Task 3
        ArrayList<Item> additionalItems = new ArrayList<>();
        additionalItems.add(new Item(6, "Item6"));
        additionalItems.add(new Item(7, "Item7"));
        additionalItems.add(new Item(8, "Item8"));
        additionalItems.add(new Item(9, "Item9"));
        additionalItems.add(new Item(10, "Item10"));
        additionalItems.add(new Item(11, "Item11"));
        additionalItems.add(new Item(12, "Item12"));
        additionalItems.add(new Item(13, "Item13"));
        additionalItems.add(new Item(14, "Item14"));
        additionalItems.add(new Item(15, "Item15"));

        List<Item> subList = additionalItems.subList(0, 5);
        HashSet<Item> itemHashSet = new HashSet<>(subList);

        System.out.println("Items in HashSet:");
        for (Item item : itemHashSet) {
            item.show();
        }
        System.out.println();

        // Task 4
        ArrayHandler.fillArray();
        System.out.println("\nArray contents:");
        for (int num : ArrayHandler.getArray()) {
            System.out.print(num + " ");
        }
    }
}
