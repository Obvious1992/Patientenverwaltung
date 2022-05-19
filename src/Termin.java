import java.time.LocalDateTime;

public class Termin {

	private LocalDateTime zeitpunkt;
	private Arzt arzt;
	private Patient patient;
	private String kommentar;
	
	public Termin(LocalDateTime zeitpunkt, Arzt arzt, Patient patient, String kommentar){
		this.setZeitpunkt(zeitpunkt);
		this.setArzt(arzt);
		this.setPatient(patient);
		this.setKommentar(kommentar);
	}
	
	//Notwendig zum anlegen eines Termins ohne Arzt - Siehe Activity diagram Patient Terminbuchung
	public Termin(LocalDateTime zeitpunkt, Patient patient, String kommentar){
		this.setZeitpunkt(zeitpunkt);
		this.setPatient(patient);
		this.setKommentar(kommentar);
	}


	public LocalDateTime getZeitpunkt() {
		return zeitpunkt;
	}


	public void setZeitpunkt(LocalDateTime zeitpunkt) {
		this.zeitpunkt = zeitpunkt;
	}


	public Arzt getArzt() {
		return arzt;
	}


	public void setArzt(Arzt arzt) {
		this.arzt = arzt;
	}


	public Patient getPatient() {
		return patient;
	}


	public void setPatient(Patient patient) {
		this.patient = patient;
	}


	public String getKommentar() {
		return kommentar;
	}


	public void setKommentar(String kommentar) {
		this.kommentar = kommentar;
	}
	
	
	
}
