import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {

    @Test
    void getTotalCost() {
        ShoppingCart shoppingCart = new ShoppingCart();
        String name = "Moi";
        Double price = 12.0;
        shoppingCart.addItem(name, price);
        Double totalCost = shoppingCart.getTotalCost();
        assertEquals(price, totalCost);
    }
}