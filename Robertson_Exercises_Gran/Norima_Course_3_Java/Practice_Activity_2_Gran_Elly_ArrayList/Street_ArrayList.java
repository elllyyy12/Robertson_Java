import java.util.*;

/**
 * Java Course 3, Module 2
 * 
 * Provide a for-each loop (not a standard for loop) that prints the addressList ’s addresses, one address per line.
   *
 * @author Elly Jay C. Gran
 */
public class Street_ArrayList {

    public static void main(String[] args) {
        
        ArrayList<String> addressList = new ArrayList<String>(); //arraylist from the given instruction.
        addressList.add("1600 Pennsylvania Avenue"); 
        addressList.add("221B Baker Street");
        addressList.add("8700 N.W. River Park Drive");

        for (String strAddresslist: addressList) { //foreach loop that prints the addressList ’s addresses.
            System.out.println(strAddresslist);
        }
    }
}