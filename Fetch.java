package practiceDb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Fetch {
	private static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) throws Exception {
	
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery("select * from employeess");
		while (rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2));
		}
		rs.close();
		st.close();
		conn.close();
		
}

}