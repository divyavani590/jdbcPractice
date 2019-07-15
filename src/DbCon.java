import java.sql.*;

public class DbCon {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","");
			
			if(con!=null) {
				System.out.println("Database connected");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
