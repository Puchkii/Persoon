package util;

public class Person {

	private int[] id;
	private String[] firstName;
	private String[] lastName;

	public Person() {

	}

	public Person(String[] firstName, String[] lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int[] getId() {
		return id;
	}

	public void setId(int[] id) {
		this.id = id;
	}

	public String[] getFirstName() {
		return firstName;
	}

	public void setFirstName(String[] firstName) {
		this.firstName = firstName;
	}

	public String[] getLastName() {
		return lastName;
	}

	public void setLastName(String[] lastName) {
		this.lastName = lastName;
	}
}
























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