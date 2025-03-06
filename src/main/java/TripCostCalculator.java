public class TripCostCalculator {


    public double calculateTotalCost(double travelDistance, double pricePerLiter, double fuelConsumption) {
        double totalFuelNeeded = (travelDistance / 100) * fuelConsumption;

        double totalCost = totalFuelNeeded * pricePerLiter;
        return totalCost;
    }
}