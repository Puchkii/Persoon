package util;

import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.util.ArrayList;
import java.util.List;

public class PersonTableModel extends DefaultTableModel {
	List<Person> personen = new ArrayList<Person>();

	//defines table model for persons
	public PersonTableModel(){
		columnIdentifiers.add("Voornaam");
		columnIdentifiers.add("Achternaam");
		columnIdentifiers.add("Dagen geleefd");

		//personen.add(new Person("Firstname", "Lastname",6));
		personen.add(new Person("Joep", "Meloen",9));
		personen.add(new Person("Piet", "Verdriet",6));
		personen.add(new Person("Piet", "Verdriet",6));

		//String[] column = {columnIdentifiers.get(0).getClass()}; //test string for column names

		String[] dummy = {personen.get(0).getFirstName(), personen.get(0).getLastName(), Integer.toString(personen.get(0).getDaysAlive())};
		addRow(dummy);
	}

	//persons list
	public List<Person> getPersonen() {
		return personen;
	}

//	@Override
//	public int getRowCount() {
//		return personen.size();
//	}
//
//	@Override
//	public int getColumnCount() {
//		return 3;
//	}
//
//	@Override
//	public String getColumnName(int i) {
//		switch (i){
//			case 0: return "Voornaam";
//			case 1: return "Achternaam";
//			case 2: return "Geboortedatum";
//			default: return "Pizza is lekker";
//		}
//	}
//
//	@Override
//	public Class<?> getColumnClass(int i) {
//		return String.class;
//	}
//
//	@Override
//	public boolean isCellEditable(int i, int i1) {
//		return false;
//	}
//
//	@Override
//	public Object getValueAt(int i, int i1) {
//		Person p = personen.get(i);
//		switch (i1) {
//			case 0:
//				return p.getFirstName();
//			case 1:
//				return p.getLastName();
//			case 2:
//				return p.getDaysAlive();
//			default: return "";
//		}
//	}
//
//	@Override
//	public void setValueAt(Object o, int i, int i1) {
//
//	}
//
//	@Override
//	public void addTableModelListener(TableModelListener tableModelListener) {
//
//	}
//
//	@Override
//	public void removeTableModelListener(TableModelListener tableModelListener) {
//
//	}
}
