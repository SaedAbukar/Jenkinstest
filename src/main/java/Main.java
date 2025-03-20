import java.time.LocalDate;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
     ShoppingCart shoppingCart = new ShoppingCart();
     System.out.println("Select a language:");
     System.out.println("1. Swedish");
     System.out.println("2. Finnish");
     System.out.println("3. Japanese");
     Scanner scanner = new Scanner(System.in);
     int language = scanner.nextInt();

     Locale locale;
     switch (language) {
         case 1:
             locale = new Locale("sv", "SE");
             break;
         case 2:
             locale = new Locale("fi", "FI");
             break;
         case 3:
             locale = new Locale("ja", "JP");
             break;
         default:
             System.out.println("Invalid language selection");
             locale = new Locale("en", "US");
             break;
     }

     ResourceBundle messages;
     try {
         messages = ResourceBundle.getBundle("messages", locale);
     } catch (MissingResourceException e) {
         System.out.println("Language is not supported");
         messages = ResourceBundle.getBundle("messages", new Locale("en", "US"));
     }

     // Enter the number of items to purchase:
     System.out.println(messages.getString("items"));
     int items = scanner.nextInt();
     for (int i = 0; i < items; i++) {
         // Enter the name of the item
         System.out.println(messages.getString("name"));
         String name = scanner.next();
         // Enter the price for item:
         System.out.println(messages.getString("price"));
         double price = price = scanner.nextInt();
         // Enter the quantity for item:
         System.out.println(messages.getString("quantity"));
         double quantity = scanner.nextInt();
         double total = quantity * price;
         shoppingCart.addItem(name, total);
     }
     // Total cost:
     System.out.printf(messages.getString("cost"), shoppingCart.getTotalCost());
     scanner.close();
 }
}
