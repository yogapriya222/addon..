package addon_day11;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class task2 {
	

	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/test";
		String username="root";
		String password="";
		Connection con=DriverManager.getConnection(url, username, password);
		Statement stmt=con.createStatement();
		String query="insert into stu (id,name,age)values(2,'pooja',23),(3,'mythily',28),(4,'priya',22),(5,'keerthu',30)";
		int no=stmt.executeUpdate(query);
		System.out.println(no);
}}
