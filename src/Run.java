import database.Mysqlcon;

import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Run extends JFrame{

	private JList list;

	private static final long serialVersionUID = 1L;
		static GraphicsConfiguration gc;
		static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		public static void main(String[] args) throws SQLException {

			JFrame myFrame = new JFrame(gc);
			myFrame.setTitle("Userlist By Puchkii");
			myFrame.setLocation(screenSize.width / 2 - 150, screenSize.height/2 - 250);

			myFrame.setSize(300, 500);
			myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			JTextField myInput = new JTextField();

			//gegevens word hier gekoppeld aan com.entities.Persoon bij naam bijv. kevin
			Mysqlcon mysqlcon = new Mysqlcon();
			mysqlcon.init();//select all statement voor de jlist maken
			Statement stmt = mysqlcon.getConnection().createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM user");
			while(rs.next()){
				myFrame.getContentPane().add(new JLabel(rs.getString("firstname")));
				System.out.print(rs.getString("firstname"));

				myFrame.getContentPane().add(new JLabel(rs.getString("lastname")));
				System.out.print(rs.getString("lastname"));

			}
			myFrame.setVisible(true);
		}
	}
}

































//		com.entities.Persoon kevin = new com.entities.Persoon();
//		kevin.setVoornaam("Kevin");
//		kevin.setAchternaam("Blank");
//		kevin.setGeboorteDatum("11-01-1999");
//		System.out.println(kevin);
//		mysqlcon.insertPerson(kevin);

//		com.entities.Persoon sidian = new com.entities.Persoon();
//		sidian.setVoornaam("Sidian");
//		sidian.setAchternaam("Koné");
//		sidian.setGeboorteDatum("25-9-2001");
//		System.out.println(sidian);
//		mysqlcon.insertPerson(sidian);

//		List<com.entities.Persoon> alles = mysqlcon.getAll();
//		for (com.entities.Persoon p : alles) {
//			System.out.println(p.getVoornaam());
//		}

//		com.entities.Persoon edward = new com.entities.Persoon();
//		edward.setVoornaam("Edward");
//		edward.setAchternaam("Hess");
//		edward.setGeboorteDatum("31-10-1958");
//		System.out.println(edward);
//
//		com.entities.Persoon anouk = new com.entities.Persoon();
//		anouk.setVoornaam("Anouk");
//		anouk.setAchternaam("Gemmer");
//		anouk.setGeboorteDatum("06-02-2002");
//		System.out.println(anouk);
//
//		com.entities.Persoon jozef = new com.entities.Persoon();
//		jozef.setVoornaam("Jozef");
//		jozef.setAchternaam("Tromp");
//		jozef.setGeboorteDatum("04-09-1999");
//		System.out.println(jozef);
//
//		com.entities.Persoon lars = new com.entities.Persoon();
//		lars.setVoornaam("Lars");
//		lars.setAchternaam("Stuursma");
//		lars.setGeboorteDatum("25-05-2001");
//		System.out.println(lars);
//
//		com.entities.Persoon dylan = new com.entities.Persoon();
//		dylan.setVoornaam("Dylan");
//		dylan.setAchternaam("Spin");
//		dylan.setGeboorteDatum("09-07-2002");
//		System.out.println(dylan);
//
//		com.entities.Persoon angela = new com.entities.Persoon();
//		angela.setVoornaam("Angela");
//		angela.setAchternaam("Blank");
//		angela.setGeboorteDatum("15-10-1967");
//		System.out.println(angela);
//
