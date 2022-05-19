import java.io.Serializable;

public class Adresse implements Serializable{

	private String strasse;
	private String hausnummer;
	private String postleitzahl;
	private String stadt;
	
	/**
	 * 
	 * @param strasse
	 * @param hausnummer
	 * @param postleitzahl
	 * @param stadt
	 */
	public Adresse(String strasse, String hausnummer, String postleitzahl, String stadt) {
		this.setStrasse(strasse);
		this.setHausnummer(hausnummer);
		this.setPostleitzahl(postleitzahl);
		this.setStadt(stadt);
	}
	
	public String getStrasse() {
		return strasse;
	}
	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}
	
	
	public String getHausnummer() {
		return hausnummer;
	}
	public void setHausnummer(String hausnummer) {
		this.hausnummer = hausnummer;
	}
	
	
	public String getPostleitzahl() {
		return postleitzahl;
	}
	public void setPostleitzahl(String postleitzahl) {
		this.postleitzahl = postleitzahl;
	}
	
	
	public String getStadt() {
		return stadt;
	}
	public void setStadt(String stadt) {
		this.stadt = stadt;
	}
	
}
