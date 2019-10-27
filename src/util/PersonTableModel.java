package util;

import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PersonTableModel extends DefaultTableModel {
	
	private Persons persons;

	//defines table model for persons
	public PersonTableModel(){
		persons = new Persons();
		setColumnIdentifiers(new String[] {"Voornaam", "Achternaam", "Dagen geleefd"});
		Iterator<Person> iterator = persons.iterator();
		while(iterator.hasNext()) {
			Person p = iterator.next();
			addRow(p.getRow());
		}
		
	}
	
	public void addPersonFirst(String firstname) {
		addRow(persons.add(firstname).getRow());
	}
	public void addPersonLast(String lastname) {
		addRow(persons.add(lastname).getRow());
	}
	public void addPersonBirth(String birthday) {
		addRow(persons.add(birthday).getRow());
	}

	
//	public void deletePerson(String firstname, String lastname, String birthday) {
//		
//	}
//	
//	public void updatePerson(int id, String firstname) {
//		//id from table and database have to work together to give the right update
//
//		
//		//setValueAt(persons.update(id, firstname).getRow(), row, column);
//		
//	}
}