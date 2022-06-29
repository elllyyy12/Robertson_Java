import java.util.Scanner;

public class StockChangeCalculator{
    public static void main(String[] args) {
        double totalValue;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the symbol of stock: ");
        String stockSymbol = sc.nextLine();
        System.out.println("Enter day 1 value: ");
        float d1 = sc.nextFloat();
        System.out.println("Enter day 2 value: ");
        float d2 = sc.nextFloat();

        totalValue = d2 - d1 / d1 * 100;
        System.out.println(stockSymbol + " has change " + totalValue + " in one day.");
    }
}
