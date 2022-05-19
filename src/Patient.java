import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

public class Patient extends Person implements Serializable {

	private String krankenversicherung;
	private Date letzterBesuch;
	
	
public Patient(String vorname, String name, Adresse adresse, String krankenversicherung, Date letzterBesuch){
	super(vorname,name, adresse);
	
	this.setKrankenversicherung(krankenversicherung);
	this.setLetzterBesuch(letzterBesuch);
}


	public String getKrankenversicherung() {
		return krankenversicherung;
	}

	public void setKrankenversicherung(String krankenversicherung) {
		this.krankenversicherung = krankenversicherung;
	}

	public Date getLetzterBesuch() {
		return letzterBesuch;
	}

	public void setLetzterBesuch(Date letzterBesuch) {
		this.letzterBesuch = letzterBesuch;
	}
	
	public void TerminVereinbaren(LocalDateTime gewuenschterTermin) throws Exception {
		throw new Exception("Not implemented");
		
	}
	
	public void TerminStornieren(LocalDateTime Termin) throws Exception {
		throw new Exception("Not implemented");
		
	}
	
}
