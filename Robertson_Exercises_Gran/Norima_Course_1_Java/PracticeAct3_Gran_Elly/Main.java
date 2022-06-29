import java.util.*;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your Name: ");
        String name = sc.nextLine();
        System.out.println("Your name has " + name.length() + " letters including spaces.");
        System.out.println("The first letter is: " + name.charAt(0));
    }
}