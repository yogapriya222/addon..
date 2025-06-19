package addon_day11;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class task3 {
	

	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/test";
		String username="root";
		String password="";
		Connection con=DriverManager.getConnection(url, username, password);
		Statement stmt=con.createStatement();
		String query="alter table stu drop age";
		stmt.executeUpdate(query);
}
}