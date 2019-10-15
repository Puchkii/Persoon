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
}