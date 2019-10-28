import util.PersonTableModel;
import util.Persons;
import database.Mysqlcon;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.sql.*;
import java.awt.event.ActionEvent;

public class MainWindow extends Mysqlcon{

	private JFrame frmPersondbByPuchkii;
	private final JPanel panel = new JPanel();
	private JLabel lblVoornaam;
	private JLabel lblAchternaam;
	private JLabel lblGeboortedatum;
	/**
	 * @wbp.nonvisual location=-27,524
	 */
	private final PersonTableModel personTableModel = new PersonTableModel();
	private JTable tablePersons;
	private JTextField inputFirstname;
	private JTextField inputBirthday;
	private JTextField inputLastname;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frmPersondbByPuchkii.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPersondbByPuchkii = new JFrame();
		frmPersondbByPuchkii.setBackground(Color.BLACK);
		frmPersondbByPuchkii.setTitle("PersonDB by Puchkii");
		frmPersondbByPuchkii.setBounds(100, 100, 428, 520);
		frmPersondbByPuchkii.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.setBackground(Color.BLACK);
		frmPersondbByPuchkii.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		lblVoornaam = new JLabel("Voornaam");
		lblVoornaam.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblVoornaam.setForeground(Color.WHITE);
		lblVoornaam.setBounds(10, 10, 96, 13);
		panel.add(lblVoornaam);
		
		lblAchternaam = new JLabel("Achternaam");
		lblAchternaam.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAchternaam.setForeground(Color.WHITE);
		lblAchternaam.setBounds(142, 10, 96, 13);
		panel.add(lblAchternaam);
		
		lblGeboortedatum = new JLabel("Geboortedatum");
		lblGeboortedatum.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblGeboortedatum.setForeground(Color.WHITE);
		lblGeboortedatum.setBounds(278, 10, 96, 13);
		panel.add(lblGeboortedatum);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 94, 394, 379);
		panel.add(scrollPane);
		
		tablePersons = new JTable();
		scrollPane.setViewportView(tablePersons);
		tablePersons.setModel(personTableModel);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Clicked add button");
				personTableModel.addPerson(inputFirstname.getText(),inputLastname.getText(),inputBirthday.getText());
//				personTableModel.addPersonLast(inputLastname.getText());
//				personTableModel.addPersonBirth(inputBirthday.getText());
			}
		});
		btnAdd.setBounds(278, 52, 96, 21);
		panel.add(btnAdd);
		
		inputFirstname = new JTextField();
		inputFirstname.setBounds(10, 23, 96, 19);
		panel.add(inputFirstname);
		inputFirstname.setColumns(10);
		
		inputBirthday = new JTextField();
		inputBirthday.setBounds(278, 23, 96, 19);
		panel.add(inputBirthday);
		inputBirthday.setColumns(10);
		
		inputLastname = new JTextField();
		inputLastname.setBounds(142, 23, 96, 19);
		panel.add(inputLastname);
		inputLastname.setColumns(10);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 12));
//		btnUpdate.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("Clicked update button");
//			}
//		});
		btnUpdate.setBounds(10, 52, 96, 21);
		panel.add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 12));
//		btnDelete.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("Clicked delete button");
				//delete action should be added here
//			}
//		});
		btnDelete.setBounds(142, 52, 96, 21);
		panel.add(btnDelete);
	}
}
