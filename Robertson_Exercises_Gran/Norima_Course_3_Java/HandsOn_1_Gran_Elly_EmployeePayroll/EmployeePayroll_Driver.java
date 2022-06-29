import java.util.Scanner;

/**
 * Java Course 3, Module 1
 * 
 *  Assignment 1: Inheritance and Polymorphism
 *  An employee payroll program that uses polymorphism to calculate and print the weekly payroll for your company. 
   *
 * @author Elly Jay Gran
 */

 public class EmployeePayroll_Driver {
 
     public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);

        int numOfEmployees; //declaring variable
        Employee employees[]; //created array of employees
        int i;

        int employeeType; //variable used to get what type of employee

        System.out.println("Number of Employees: "); //display to enter how many number of employees.
        numOfEmployees = sc.nextInt(); //To get user input how many employees.

        employees = new Employee[numOfEmployees];

        for(i = 0; i < numOfEmployees; i++) { //for loop so that if the user entered many employees

            System.out.println("\nProfile for Employee # " + (i+1) + ":"); 
            System.out.println("Type Hourly(1), Salaried(2)," + " Salaried plus Commission(3)\n" + "Enter 1, 2, or 3 ==>");
            employeeType = sc.nextInt();

            switch(employeeType) { //switch case to determine employee type
                case 1: 
                    employees[i] = new Hourly(); //case 1 if hourly.
                    break;
                case 2:
                    employees[i] = new Salaried(); // case 2 if salaried.
                    break;
                case 3:
                    employees[i] = new SalariedPlusCommission(); //case 3 if salaried with commission.
                    break;
            }
            employees[i].load(); //calling the load() method.
        }
        System.out.println("\nPAYCHECK REPORT\n");

        for(i = 0; i < numOfEmployees; i++) {
            System.out.println(employees[i]); //prints out the employee name, social security number, and paycheck.
        }
     }
 }

