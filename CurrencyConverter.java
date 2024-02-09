import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueConversion = true;

        while(continueConversion)
      {
        System.out.println("Enter the amount in Indian Rupees (INR) to convert:");
        double amountINR = scanner.nextDouble();

        double usdRate = 0.012051 ;    // 1 INR = 0.012052 USD
        double eurRate = 0.01119;      // 1 INR = 0.01119 EUR

        double amountUSD = amountINR * usdRate;
        double amountEUR = amountINR * eurRate;

        //To Display result
        System.out.println(amountINR + " INR is equivalent to " + amountUSD + " USD\n");
        System.out.println(amountINR + " INR is equivalent to " + amountEUR + " EUR");
        System.out.println("Do you want to continue Y/N? ");
        String response = scanner.next().toLowerCase();
        continueConversion = response.equals("y");
      }
      System.out.println("Goodbye,Have a great day!!!");
    }
}
