import java.io.Serializable;

public class Person implements Serializable{

	private String vorname;
	private String nachname;
	private Adresse adresse;
	private int age;

	
	public Person() {
	
	}
	
	//Benötigt da Basisklasse für Patient & Arzt
	public Person(String vorname, String name, Adresse adresse) {
		this.setNachname(name);
   		this.setVorname(vorname);
   		this.setAdresse(adresse);
   	}

	public Person(String vorname, String name, Adresse adresse, int age) {
		this.setNachname(name);
   		this.setVorname(vorname);
   		this.setAdresse(adresse);
		this.setAge(age);
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

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	
}
