import java.util.*;

class Item {
    String type;
    String name;
    int price;

    public Item(String type, String name, int price) {
        this.type = type;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "{" +
                "\"type\": \"" + type + "\"," +
                "\"name\": \"" + name + "\"," +
                "\"price\": " + price +
                "}";
    }
}
public class FilterListObject {
    public static List<Item> filterList(List<Item> items) {
        Map<String, Item> map = new HashMap<>();

        for (Item item : items) {
            String key = item.type + "-" + item.name;
            if (!map.containsKey(key) || map.get(key).price > item.price) {
                map.put(key, item);
            }
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        List<Item> items = Arrays.asList(
                new Item("Pen", "Snowman", 10000),
                new Item("Ruler", "Butterfly", 5000),
                new Item("Pen", "Snowman", 12000),
                new Item("Eraser", "Kenko", 12000),
                new Item("Pen", "Kenko", 10000),
                new Item("Eraser", "Kenko", 9000),
                new Item("Eraser", "Snowman", 2000),
                new Item("Ruler", "Snowman", 10000)
        );

        List<Item> filteredItems = filterList(items);
        for (Item item : filteredItems) {
            System.out.println(item);
        }
    }
}
