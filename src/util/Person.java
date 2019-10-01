package util;

import database.Mysqlcon;

import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Person{

	private int id;
	private String firstName;
	private String lastName;

	public Person(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
//
//	//gegevens word hier gekoppeld aan com.entities.Persoon bij naam bijv. kevin
//	database.Mysqlcon mysqlcon = new Mysqlcon();
//	//mysqlcon.init();
//	//select all statement voor de jlist maken
//	Statement stmt = mysqlcon.getConnection().createStatement();
//	ResultSet rs = stmt.executeQuery("SELECT * FROM user");
//	while(rs.next()){
//		myFrame.getContentPane().add(new JLabel(rs.getString("firstname")));
//		System.out.print(rs.getString("firstname"));
//
//		myFrame.getContentPane().add(new JLabel(rs.getString("lastname")));
//		System.out.print(rs.getString("lastname"));
//
//	}
}


/**
 * hier is informatie over users tijdelijk aan de kant voor latere verwerking in de code
 */





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


/**
 *oude code die misschien handig uitkomt later
 */


//mijn oude code even aan de kant voor een test
//	// Variabelen declareren
//	private String voornaam;
//	private String achternaam;
//	private Date geboorteDatum;
//
//	public String getVoornaam() {
//		return voornaam;
//	}
//
//	public void setVoornaam(String voornaam) {
//		this.voornaam = voornaam;
//	}
//
//	public String getAchternaam() {
//		return achternaam;
//	}
//
//	public void setAchternaam(String achternaam) {
//		this.achternaam = achternaam;
//	}
//
//	private Date getGeboorteDatum() {
//		return geboorteDatum;
//	}
//
//	private void setGeboorteDatum(Date geboorteDatum) {
//		this.geboorteDatum = geboorteDatum;
//	}
//
//	@Override
//	public String toString() {
//		return "com.entities.Persoon: " + voornaam + " " + achternaam + " leeftijd: " + getAantalDagenGeleefd();
//
//	}
//
//	public long getAantalDagenGeleefd() {
//		Date now = new Date();
//		long millis = 0;
//		//als geboortedatum niet gelijk aan niks word de geboortedatum verder beneden verwerkt in de som
//		if (geboorteDatum != null ) {
//			millis = now.getTime() - geboorteDatum.getTime();
//		}
//		//berekend de tijd zodat het in dagen word weergegeven
//		return (long) (millis / (1000 * 60 * 60 * 24));
//
//	}
//
//	public void setGeboorteDatum(String geboorteDatum) {
//		SimpleDateFormat sd = new SimpleDateFormat("dd-MM-yyyy");
//
//		//???
//		try {
//			//???
//			this.geboorteDatum = sd.parse(geboorteDatum);
//		} catch (ParseException e) {
//			//geboortedatum word als een nieuwe datum gemaakt
//			this.geboorteDatum = new Date();
//			//e.printStackTrace();
//		}
//	}
//}