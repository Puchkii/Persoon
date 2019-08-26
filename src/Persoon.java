import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Persoon {

	// Variabelen declareren
	private String voornaam;
	private String achternaam;
	private Date geboorteDatum;

	public String getVoornaam() {
		return voornaam;
	}

	public void setVoornaam(String voornaam) {
		this.voornaam = voornaam;
	}

	public String getAchternaam() {
		return achternaam;
	}

	public void setAchternaam(String achternaam) {
		this.achternaam = achternaam;
	}

	private Date getGeboorteDatum() {
		return geboorteDatum;
	}

	private void setGeboorteDatum(Date geboorteDatum) {
		this.geboorteDatum = geboorteDatum;
	}

	@Override
	public String toString() {
		return "Persoon: " + voornaam + " " + achternaam + " leeftijd: " + getAantalDagenGeleefd();

	}

	public long getAantalDagenGeleefd() {
		Date now = new Date();
		long millis = 0;
		//als geboortedatum niet gelijk aan niks word de geboortedatum verder beneden verwerkt in de som
		if (geboorteDatum != null ) {
			millis = now.getTime() - geboorteDatum.getTime();
		}
		//berekend de tijd zodat het in dagen word weergegeven
		return (long) (millis / (1000 * 60 * 60 * 24));

	}

	public void setGeboorteDatum(String geboorteDatum) {
		SimpleDateFormat sd = new SimpleDateFormat("dd-MM-yyyy");
		
		//???
		try {
			//???
			this.geboorteDatum = sd.parse(geboorteDatum);
		} catch (ParseException e) {
			//geboortedatum word als een nieuwe datum gemaakt
			this.geboorteDatum = new Date();
			//e.printStackTrace();
		}
	}
}