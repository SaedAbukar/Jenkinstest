import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TripCostCalculatorTest {

    @Test
    void calculateTotalCost() {
        TripCostCalculator calculator = new TripCostCalculator();
        double cost = calculator.calculateTotalCost(500, 5, 5);
        double totalFuelNeeded = (500 / 100) * 5;
        double testCost = totalFuelNeeded * 5;
        assertEquals(testCost, cost);
    }
}