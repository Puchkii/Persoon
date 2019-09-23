import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class Mysqlcon {



	Connection connection = null;
	static String databaseName = "persoondb";
	static String url = "jdbc:mysql://localhost:3306/" +databaseName+ "?serverTimezone=CET";

	static String username = "puchkii";
	static String password = "4>uF2=JC4%xa->C";



	public void init(){
		try {
			connection = DriverManager.getConnection(url,username,password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void insertPerson(Persoon persoon) {
		try {
			PreparedStatement ps = connection.prepareStatement("INSERT INTO `personen` (`firstname`) VALUES ('"+persoon.getVoornaam()+ "')");
			int status = ps.executeUpdate();

			if (status != 0){
				System.out.println("Database was connected");
				System.out.println("Record was inserted");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<Persoon> getAll(){

		return null;
	}
}
