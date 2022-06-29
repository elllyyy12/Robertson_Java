import java.util.*;

public class Automobile {
    
    Scanner sc = new Scanner(System.in); //This is for the user input.

    private String make; //Just like in the instruction, I created 2 variables named make and color.
    private String color; //Based on the lecture video, This is set to private so that this class is the one that can see what the user inputs.
                            //The Automobile.java class can't call this. The other class can only call the method.
    public void setMake(){
        System.out.println("Select Buick, Chevrolet, or Pontiac (b,c,p): "); //This is the user input for setMake() Method.
        char make1 = (sc.next()).charAt(0); //This will get the user input.

        while(make1 != 'b' && make1 != 'c' && make1 !='p'){ //I created while loop for input validation. Incase the user inputs different character.
            System.out.println("The only valid selections are 'b', 'c', or 'p'"); //Prompts when the user inputs wrong.
            System.out.println("Select Buick, Chevrolet, or Pontiac (b,c,p): "); //Display for the user to pick choices.
            make1 = (sc.next()).charAt(0); //Gets the user input.
        }

        switch(make1){ //I created this switch case on setMake() Method to return the values later on printMake() Method.
            case 'b': make = "Buick"; break;
            case 'c': make = "Chevrolet"; break;
            case 'p': make = "Pontiac";
        }
    }

    public void setColor(){
        System.out.println("Select blue, green, or red (b,g,r):"); //Displays for the user to pick color
        char color1 = (sc.next()).charAt(0); //gets the user input.

        while(color1 != 'b' && color1 != 'g' && color1 != 'r'){ //Same in the setMake() Method this while loop is for input validation.
            System.out.println("The only valid selections are 'b', 'g', or 'r'"); 
            System.out.println("Select blue, green, or red (b,g,r):");
            color1 = (sc.next()).charAt(0);
        }

        switch(color1){ //Same with setMake() Method, This switch case is to return the values of setColor() Method to printColor() Method.
            case 'b': color = "Blue"; break;
            case 'g': color = "Green"; break;
            case 'r': color = "Red"; 
        }
    }

    public String printMake(){
        return make; //This is the printMake() method. At first it was set to "public void" and then I changed it to "public string" because I was having -
    }                //error that void cannot return values. I just learned that.

    public String printColor(){
        return color; //Same as the printMake() method. I just returned the values here.
    }
}
