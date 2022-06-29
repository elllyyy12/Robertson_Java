/**
 * Java Course 2, Module 2
 * 
 * Hands-on Assignment 2: Object-Oriented Programming Advanced_Person
   *
 * @author Elly Jay C. Gran
 */
public class PersonDriver {

    public static void main(String[] args) {
        
        Person person1 = new Person();
        person1.printFullName();
        Person person2 = new Person("Matt", "Thebo");
        person2.printFullName();
        person1.setFirst("Paul");
        person1.setLast("John");
        person1.printFullName();
        System.out.println("Total number of people = " + Person.getNumOfPeople());
    }
    //This is the driver class. The document provided this code for the driver class. 
}