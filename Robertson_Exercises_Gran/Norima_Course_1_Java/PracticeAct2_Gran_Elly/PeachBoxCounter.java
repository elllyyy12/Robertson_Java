import java.util.*;

/**
 * PeachBoxCounter
 */
public class PeachBoxCounter {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of peaches picked: ");
        int numOfPeaches = sc.nextInt();

        for(int i = 0; i <= numOfPeaches; i = i + 20){
            
            System.out.println("shipped " + i + " peaches so far");
        }
    }
}