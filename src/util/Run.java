package util;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class Run extends JFrame{

	private JList list;

	private static final long serialVersionUID = 1L;
		static GraphicsConfiguration gc;
		static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

	public Run(GraphicsConfiguration gc) {
		super(gc);
		setTitle("Userlist By Puchkii");
		setLocation(screenSize.width / 2 - 150, screenSize.height/2 - 250);

		setSize(300, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		add(panel);
		JTextField myInput = new JTextField("tekst");
		panel.add(myInput);
		JButton button = new JButton("Submit");
		panel.add(button);
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent actionEvent) {
				myInput.setText("Geklikt");//actie na de klik
			}
		});
		JTable table = new JTable();
		PersonTableModel model = new PersonTableModel();
		table.setModel(model);
		panel.add(table);
		setVisible(true);
	}

	public static void main(String[] args) {

			Run myFrame = new Run(gc);
		}


	}


