import java.sql.*;

/**
 * Java Course 3, Module 3
 * 
 * Java database connectivity and show how to connect with the MySQL database and the JDBC code
   *
 * @author Elly Jay Gran
 */

 public class user_policies {
 
     public static void main(String[] args) {
         
        try (
            Connection conn = DriverManager.getConnection( //Constructed a database 'Connection' object called 'conn'
                "jdbc:mysql://localhost:3306/User_Policies","root", "root123");
                Statement stmt = conn.createStatement(); //Constructed a 'Statement' object called 'stmt' inside the Connection created
        ){
            String strSelect = "select policy_no, user_id, date_registered, policy_type_id from user_policies where date_registered < '2012-01-01'"; //To Execute the SQL query via the 'Statement'.
            System.out.println("The SQL statement is: " + strSelect + "\n");

            ResultSet rset = stmt.executeQuery(strSelect); //Process the 'ResultSet' by scrolling the cursor forward via next().
            System.out.println("The records selected are:");

            while(rset.next()) {
                String policyNumber = rset.getString("policy_no");
                String userID = rset.getString("user_id");
                String date_registered = rset.getString("date_registered");
                String policyTypeID = rset.getString("policy_type_id");
                System.out.println("PolicyNumber\t User ID\t Date Registered\t Policy Type ID");
                System.out.println(policyNumber + "\t         " + userID + "\t         " + date_registered + "\t         " + policyTypeID); //To display the columns excuse me for not using format on this one. Sorry.
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
     }
 }
