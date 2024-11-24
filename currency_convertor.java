import java.util.Scanner;

public class currency_convertor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            
            System.out.print("Enter base currency (e.g., USD): ");
            String baseCurrency = scanner.next().toUpperCase();

            System.out.print("Enter target currency (e.g., EUR): ");
            String targetCurrency = scanner.next().toUpperCase();

            System.out.print("Enter amount to convert: ");
            double amount = scanner.nextDouble();

            
            double exchangeRate = getExchangeRate(baseCurrency, targetCurrency);

            if (exchangeRate == -1) {
                System.out.println("Currency conversion not available for the given currencies.");
                return;
            }

            
            double convertedAmount = amount * exchangeRate;

            // Step 5: Display Result
            System.out.printf("Converted Amount: %.2f %s\n", convertedAmount, targetCurrency);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    
    private static double getExchangeRate(String base, String target) {
       
        if (base.equals("USD") && target.equals("EUR")) {
            return 0.92; 
        } else if (base.equals("USD") && target.equals("INR")) {
      
        }
        return -1;
    }
}