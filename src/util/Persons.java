package util;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import database.Mysqlcon;

public class Persons extends Mysqlcon{
	List<Person> persons = new ArrayList<Person>();
	
	public Persons () {
		init();
		try {
			Statement stmt = connection.createStatement();
			ResultSet result = stmt.executeQuery("SELECT * FROM user;");
			while(result.next()) {
				Person p = new Person(result.getString("firstname"),result.getString("lastname"),result.getString("birthday"));
				persons.add(p);
			}
			
		} catch (Exception e) {
			System.out.println("help");
		}
	}
	
	public Iterator<Person> iterator(){
		return persons.iterator();
	}
	
	public void add(String firstname) {
		 System.out.println("Inserting records into the table...");
	      Statement stmt;
		try {
			stmt = connection.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      
	      String sql = "INSERT INTO user " +
	                   "VALUES ()";
	
	public void delete(int id) {
		
	}
	
	public void update(String firstname) {
		
	}

}
