import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class OracleTest {

	public static void main(String[] args) {
	
	try {
		
		//Class.forName("oracle.jdbc.driver.OracleDriver"); NOT NEEDED FROM JAVA 4 ONWRDS
		//System.out.println("Driver class loaded biatch."); --------||-------------
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott",
				"tiger");
		//System.out.println("connection established biatcchhh!");
		
		Statement stmt = conn.createStatement();
		
		String qry = "create table employee(epm_id number(3) primary key,"
				+ "emp_name varchar2(20), emp_salary number)";
		
		String qry2 = "insert into employee values(1,'Ash',15000)";
		
		int x = stmt.executeUpdate(qry);
		System.out.println(x + "table created");
		int y = stmt.executeUpdate(qry2);
		System.out.println(y + "Record(s) inserted");
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	
	
	
	}
	
}
