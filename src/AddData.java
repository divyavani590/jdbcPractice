import java.sql.*;
public class AddData {

	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","");
			Statement st = con.createStatement();
			st.executeUpdate("Insert into student(rollNo, sname, location) values (1001, 'Divya', 'Hyd')");
			System.out.println("Row Inserted");
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
