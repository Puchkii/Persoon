package util;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
	
	public Person add(String firstname, String lastname, String birthday) {
		try {
			PreparedStatement stmt = connection.prepareStatement("INSERT INTO user (firstname, lastname, birthday) VALUES (?, ?, ?)");
			stmt.setString(1, firstname);
			stmt.setString(2, lastname);
			stmt.setString(3, birthday);
			stmt.execute();
			Person p = new Person(firstname, lastname, birthday);
			persons.add(p);
			return p;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}
	
	public void delete(int id) {
		
	}
	
	public Person update(int id, String firstname, String lastname, String birthday) {
		try {
			PreparedStatement stmt = connection.prepareStatement("UPDATE INTO user (firstname, lastname, birthday) VALUES (?, ?, ?)");
			stmt.setString(1, firstname);
			stmt.setString(2, lastname);
			stmt.setString(3, birthday);
			Person p = new Person(firstname, lastname, birthday);
			persons.update(p);
			return(p);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
