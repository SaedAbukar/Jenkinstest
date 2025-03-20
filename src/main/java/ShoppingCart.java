import java.util.*;

public class ShoppingCart {
    private int totalCost;
    private int itemCost;
    private HashMap<String, Double> items;
    Locale locale;

    public ShoppingCart() {
        items = new HashMap<>();
    }

    public void addItem(String name, double price) {
        items.put(name, price);
    }

    public double getTotalCost() {
        for (HashMap.Entry<String, Double> entry : items.entrySet()) {
            totalCost += entry.getValue();
        }
        return totalCost;
    }
}
