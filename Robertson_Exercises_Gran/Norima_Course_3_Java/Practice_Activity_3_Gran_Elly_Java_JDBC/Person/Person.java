import java.sql.*;

/**
 * Person
 */
public class Person {

    public static void main(String[] args) {
        
        try(
            Connection conn = DriverManager.getConnection( //Constructed a database 'Connection' object called 'conn'
                "jdbc:mysql://localhost:3306/Person","root", "root123"); //For MySQL
                Statement stmt = conn.createStatement(); //Construct a 'Statement' object called 'stmt' inside the Connection created
        ) {
            String strSelect = "select distinct firstName from Persons"; //Used "Distinct to get the names but not with the same names."
            System.out.println("The SQL statement is: " + strSelect + "\n"); //Display 

            ResultSet rset = stmt.executeQuery(strSelect); //Created a ResultSet. Notes(for me): ResultSet is a table of data representing a database result set, which is usually generated by executing a statement that queries the database
            System.out.println("The records selected are:"); //display

            while(rset.next()) { //while loop to get the firstname.
                String firstName = rset.getString("firstName");
                
                System.out.println(firstName);
            }
            
        }catch(SQLException ex) {
            ex.printStackTrace();
        }
    }
}