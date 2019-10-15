import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import javax.swing.JSplitPane;
import javax.swing.JInternalFrame;
import util.PersonTableModel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class MainWindow {

	private JFrame frmPersondbByPuchkii;
	private final JPanel panel = new JPanel();
	private JLabel lblVoornaam;
	private JLabel lblAchternaam;
	private JLabel lblNewLabel_2;
	/**
	 * @wbp.nonvisual location=-27,524
	 */
	private final PersonTableModel personTableModel = new PersonTableModel();
	private JTable tablePersons;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

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
		frmPersondbByPuchkii.setTitle("PersonDB by Puchkii");
		frmPersondbByPuchkii.setBounds(100, 100, 428, 520);
		frmPersondbByPuchkii.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.setBackground(Color.WHITE);
		frmPersondbByPuchkii.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		lblVoornaam = new JLabel("Voornaam");
		lblVoornaam.setBounds(10, 10, 96, 13);
		panel.add(lblVoornaam);
		
		lblAchternaam = new JLabel("Achternaam");
		lblAchternaam.setBounds(142, 10, 96, 13);
		panel.add(lblAchternaam);
		
		lblNewLabel_2 = new JLabel("Geboortedatum");
		lblNewLabel_2.setBounds(278, 10, 96, 13);
		panel.add(lblNewLabel_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 94, 394, 379);
		panel.add(scrollPane);
		
		tablePersons = new JTable();
		scrollPane.setViewportView(tablePersons);
		tablePersons.setModel(personTableModel);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("geklikt");
			}
		});
		btnAdd.setBounds(278, 52, 96, 21);
		panel.add(btnAdd);
		
		textField = new JTextField();
		textField.setBounds(10, 23, 85, 19);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(276, 23, 96, 19);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(142, 23, 116, 19);
		panel.add(textField_2);
		textField_2.setColumns(10);
	}
}
