import java.util.*;

/**
 * Author: Elly Jay Gran
 * Topic: Town class that describes the demographics of small towns.
 */
public class Main {

    public static void main(String[] args) {
        
        Town newHome = new Town();
        newHome.initialValues();
        newHome.simulateBirth();
        newHome.simulateBirth();
        newHome.printStatistics();
    }
}

// This is my Main method that creates town named newHome, Calls the methods and prints out newHome's vital statistics.
// I called the simulateBirth method 2 times for the birth of pair of twins.
