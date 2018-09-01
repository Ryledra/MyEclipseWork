
import java.sql.*;

public class Data {
	public void insertRecord(int regno, String name, int marks) {
		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "vince", "miette");
			Statement st = conn.createStatement();
			st.executeUpdate("insert into school values(" + regno + ",'" + name + "'," + marks + ")");

		} catch (Exception E) {
			System.out.println(E.toString());
		}
	}

	public void displayRecords() {
		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "vince", "miette");
			Statement st = conn.createStatement();
			ResultSet result = st.executeQuery("select * from school");
			while (result.next()) {
				System.out.print(result.getInt(1)+"...");
				System.out.print(result.getString(2)+"...");
				System.out.println(result.getInt(3));
			}

		} catch (Exception E) {
			System.out.println(E.toString());
		}
	}
}
