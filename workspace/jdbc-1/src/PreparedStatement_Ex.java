import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStatement_Ex {

	public static void main(String[] args) {
		
		try {
			
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott",
					"tiger");
			
			String qry = "insert into employee values(?,?,?)";
			PreparedStatement ps = conn.prepareStatement(qry);
			
			ps.setInt(1, 2);
			ps.setString(2, "Brock");
			ps.setDouble(3, 10000);
			
			int x = ps.executeUpdate();
			
			System.out.println(x + "records inserted.");
			 
			
		} catch (Exception e) {
			// TODO: handle exception  
			e.printStackTrace();
		}
	}
	
	
}
