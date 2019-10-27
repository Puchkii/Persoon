package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Mysqlcon {

	//connection configuration

	protected Connection connection = null;
	private final String databaseName = "persoondb";
	private final  String url = "jdbc:mysql://localhost:3306/" + databaseName + "?serverTimezone=CET";

	private final String username = "puchkii";
	private final String password = "4>uF2=JC4%xa->C";

	//establishes connection to db
	
	public Mysqlcon() {
		init();
	}
	
	public void init(){
		try {
			connection = DriverManager.getConnection(url,username,password);
		} catch (SQLException e) {
			e.printStackTrace(); //prints out an error when it cant initialize connection
		}
	}

	public Connection getConnection() {
		return connection;
	}
}
