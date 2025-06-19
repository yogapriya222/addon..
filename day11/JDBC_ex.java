package addon_day11;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBC_ex {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
	Class.forName("com.mysql.jdbc.Driver");
	String url="jdbc:mysql://localhost:3306/test";
	String username="root";
	String password="";
	Connection con=DriverManager.getConnection(url, username, password);
	Statement stmt=con.createStatement();
	String query="create table stu(id int,name varchar(20),age int)";
	stmt.executeUpdate(query);
	System.out.println("table created");
//	String query="select * from stu";
//	ResultSet rs=stmt.executeQuery(query);
//	while(rs.next()) {
//
//		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
//	}
//	while(rs.next())
//	{
//		System.out.println(rs.getInt("id")+" "+rs.getString("name")+" "+rs.getInt("age"));
//	}
//	Scanner sc=new Scanner(System.in);
//	System.out.println("enter your id");
//	int id=sc.nextInt();
//	sc.nextLine();
//	System.out.println("enter your name");
//	String name=sc.nextLine();
//	System.out.println("enter your age");
//	int age=sc.nextInt();
//	
//	
//	String query="insert into stu values(?,?,?)";
//	PreparedStatement ps=con.prepareStatement(query);
//
//	ps.setInt(1, id);
//	ps.setString(2, name);
//	ps.setInt(3, age);
//ps.execute();
//System.out.println("execute successfully");
}
}
