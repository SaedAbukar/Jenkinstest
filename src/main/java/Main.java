import java.time.LocalDate;
import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     TripCostCalculator costCalculator = new TripCostCalculator();

     System.out.println("Enter travel distance: ");
     int distance = Integer.parseInt(sc.nextLine());
     System.out.println("Enter price per liter: ");
     double pricePerLiter = Double.parseDouble(sc.nextLine());
     System.out.println("Enter fuel consumption per l/100km: ");
     double consumptionPerLiter = Double.parseDouble(sc.nextLine());
     System.out.println("Total cost of the trip is: ");
     System.out.println(costCalculator.calculateTotalCost(distance, pricePerLiter, consumptionPerLiter) + "€");
 }
}
