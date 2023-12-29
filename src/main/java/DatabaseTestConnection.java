import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseTestConnection {

	public static void main(String[] args) {
       try {
    	    
    	   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/traine_cm","root","swati");
    	   Statement stm = con.createStatement();
    	   ResultSet rs =  stm.executeQuery("select * from trainer_cm");
    	   while(rs.next())
    	   {
    		   System.out.println("ID="+rs.getInt("id")+" Name = "+rs.getString("name"));
    		   //System.out.println("unable to established connection");
    	   }
       }
       catch (SQLException e) {
    	   System.out.println("unable to established connection"+e);
       }

	}

}
