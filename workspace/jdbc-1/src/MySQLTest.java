import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLTest {

	
	public static void main(String[] args) {
		
	try {
		
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver class loaded biatch.");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root" ,
				"admin");
		System.out.println("connection established biatcchhh in sql!");
		
		
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	
	
	
	}
	
}
