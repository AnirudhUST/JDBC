package ustbatchno3.JDBC_Projects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class TableEmp {

	public static void main( String[] args )
	 {
    	try {
    		Class.forName("com.mysql.jdbc.Driver");  
    		Connection con=DriverManager.getConnection(  
    		"jdbc:mysql://localhost:3306/db","root","pass@word1");  
    		//here sonoo is database name, root is username and password {
    		java.sql.Statement stmt=(java.sql.Statement)con.createStatement();
    		 String query = "CREATE TABLE CUSTOMERS("
    		         + "ID INT NOT NULL, "
    		         + "NAME VARCHAR (20) NOT NULL, "
    		         + "AGE INT NOT NULL, "
    		         + "SALARY DECIMAL (18, 2), "
    		         + "ADDRESS CHAR (25) , "
    		         + "PRIMARY KEY (ID))";
    		      stmt.execute(query);
    		      System.out.println("Table Created......");
    		      
    		      String query1 = "INSERT INTO CUSTOMERS(" + "ID, Name, AGE, SALARY, ADDRESS) VALUES "
    		    	         + "(1, 'Amit', 25, 3000, 'Hyderabad'), "
    		    	         + "(2, 'Kalyan', 27, 4000, 'Vishakhapatnam'), "
    		    	         + "(3, 'Renuka', 30, 5000, 'Delhi'), "
    		    	         + "(4, 'Archana', 24, 1500, 'Mumbai'),"
    		    	         + "(5, 'Koushik', 30, 9000, 'Kota'),"
    		    	         + "(6, 'Hardik', 45, 6400, 'Bhopal'),"
    		    	         + "(7, 'Trupthi', 33, 4360, 'Ahmedabad'),"
    		    	         + "(8, 'Mithili', 26, 4100, 'Vijayawada'),"
    		    	         + "(9, 'Maneesh', 39, 4000, 'Hyderabad'),"
    		    	         + "(10, 'Rajaneesh', 30, 6400, 'Delhi'),"
    		    	         + "(11, 'Komal', 29, 8000, 'Ahmedabad'),"
    		    	         + "(12, 'Manyata', 25, 5000, 'Vijayawada')";
    		    	      int i = stmt.executeUpdate(query1);
    		    	      System.out.println("Rows inserted: "+i);
    		
    		
    						
    	}catch(Exception e){ System.out.println(e);}  
    		 
    }
}

    	