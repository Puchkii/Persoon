package util;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.util.ArrayList;
import java.util.List;

public class PersonTableModel implements TableModel {
	List<Person> personen = new ArrayList<Person>();

	public PersonTableModel(){
		personen.add(new Person("Firstname", "Lastname"));
		personen.add(new Person("Joep", "Meloen"));
		personen.add(new Person("Piet", "Verdriet"));

	}

	public List<Person> getPersonen() {
		return personen;
	}

	@Override
	public int getRowCount() {
		return personen.size();
	}

	@Override
	public int getColumnCount() {
		return 3;
	}

	@Override
	public String getColumnName(int i) {
		switch (i){
			case 0: return "Voornaam";
			case 1: return "Achternaam";
			case 2: return "Geboortedatum";
			default: return "Pizza is lekker";
		}
}

	@Override
	public Class<?> getColumnClass(int i) {
		return String.class;
	}

	@Override
	public boolean isCellEditable(int i, int i1) {
		return false;
	}

	@Override
	public Object getValueAt(int i, int i1) {
		Person p = personen.get(i);
		switch (i1) {
			case 0:
				return p.getFirstName();
			case 1:
				return p.getLastName();

			default: return "";
		}
	}

	@Override
	public void setValueAt(Object o, int i, int i1) {

	}

	@Override
	public void addTableModelListener(TableModelListener tableModelListener) {

	}

	@Override
	public void removeTableModelListener(TableModelListener tableModelListener) {

	}
}
