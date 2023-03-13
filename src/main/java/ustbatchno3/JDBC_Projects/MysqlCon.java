package ustbatchno3.JDBC_Projects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 * Hello world!
 *
 */
public class MysqlCon 
{
    public static void main( String[] args )
    {
    	try{  
    		Class.forName("com.mysql.jdbc.Driver");  
    		Connection con=DriverManager.getConnection(  
    		"jdbc:mysql://localhost:3306/db","root","pass@word1");  
    		//here sonoo is database name, root is username and password  
    		java.sql.Statement stmt=(java.sql.Statement)con.createStatement();  
    		ResultSet rs=((java.sql.Statement) stmt).executeQuery("select * from company");  
    		while(rs.next())  
	System.out.println(rs.getString(1)+"  "+rs.getInt(2)+"  "+rs.getInt(3));  
    		con.close();  
    		}catch(Exception e){ System.out.println(e);}  
    }
}
