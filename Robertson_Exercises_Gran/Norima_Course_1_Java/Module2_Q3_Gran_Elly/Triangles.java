import java.util.Scanner;

/**
 * Java Course 1, Module 2
 * 
 *  Java program that generates an isosceles triangle made of asterisks.
   *
 * @author Elly Jay C. Gran
 */

public class Triangles {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); //For the user input.

		//Lines 18-20: Declaring int with the variables of i,j and n.
        int i;
        int j;
        int n;

        System.out.println("Enter the size of the equal sides in an isosceles triangle: "); //Display to the user to print the size of isosceles triangle.
        n = sc.nextInt(); //Gets the user input.

		//Lines 26-36: I used for loop to get the placements of the asterisk. For
        for(i=1;i<=n;i++){ 
		    for(j=1;j<=i;j++)
		{
		        if(j==1 || j==i)  //If j is equals to 1 or j is equals to i it will print line 30.
		        System.out.print("*");
		        else
		            if(i==n) 
		            System.out.print("*");
		        else
		            System.out.print("*"); 
		}
		System.out.println(); 
		}
		sc.close(); //To close the scanner
    }
}
