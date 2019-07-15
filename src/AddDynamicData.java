import java.sql.*;
import java.util.*;

public class AddDynamicData {

	public static void main(String[] args) throws SQLException {
		
		try {
		
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Student RollNo:");
			int rNo = sc.nextInt();
			
			System.out.println("Student Name:");
			String sname = sc.next();
			
			System.out.println("Student Location:");
			String location = sc.next();
			
			String sql = "Insert into student(rollNo, sname, location) values (" +rNo + ", '" + sname + "', '" + location + "')";
					
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","");
			Statement st = con.createStatement();
			st.executeUpdate(sql);
			System.out.println("Row Inserted");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		

	}

}
