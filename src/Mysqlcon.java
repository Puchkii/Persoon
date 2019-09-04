import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Mysqlcon {



	static Connection connection = null;
	static String databaseName = "persoon";
	static String url = "jdbc:mysql://localhost:3306/" +databaseName;

	static String username = "`puchkii`";
	static String password = "4>uF2=JC4%xa->C";

	public static void main(String args[]) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		connection = DriverManager.getConnection(url,username,password);
		PreparedStatement ps = connection.prepareStatement("INSERT INTO `persoon`.`voornaam` (`persoonFirstname`) VALUES ('setVoornaam');");//deze moet nog nodig worden gefixt

		int status = ps.executeUpdate();

		if (status != 0){
			System.out.println("Database was connected");
			System.out.println("Record was inserted");
		}

	}
}
