public class Person {
    //For lines 3 - 5. I created 3 variables.
    private static int numOfPeople;
    private String firstName;
    private String lastName;

    Person(){ //Person constructor for john doe.
        firstName = "John";
        lastName = "Doe";
        numOfPeople++;
    }

    Person(String firstName, String lastName){ //Another person constructor with 2 parameters
        this.firstName = firstName;
        this.lastName = lastName;
        numOfPeople++;
    }

    public void setFirst(String firstName){ //This is the method for first name.
        this.firstName = firstName;
    }

    public void setLast(String lastName){ //Method for last name.
        this.lastName = lastName;
    }

    public static int getNumOfPeople(){ //method for getting num of people
        return numOfPeople;
    }

    public void printFullName(){ //Method to display full name.
        System.out.println(firstName + " " + lastName);
    }
}
