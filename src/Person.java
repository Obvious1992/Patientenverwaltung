import java.io.Serializable;

public class Person implements Serializable{

	private String vorname;
	private String nachname;
	private Adresse adresse;
	
	public Person() {
	
	}
	
	public Person(String vorname, String name, Adresse adresse) {
		this.setNachname(name);
   		this.setVorname(vorname);
   		this.setAdresse(adresse);
   	}
	
public Person(String vorname, 
				String name, 
				String strasse, 
				String hausnummer, 
				String postleitzahl, 
				String stadt) {
	this.setNachname(name);
   	this.setVorname(vorname);
   	this.setAdresse(new Adresse(strasse, hausnummer, postleitzahl, stadt));
   }

	
	
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	
	
	public String getNachname() {
		return nachname;
	}
	public void setNachname(String name) {
		this.nachname = name;
	}
	
	
	public Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	
}
