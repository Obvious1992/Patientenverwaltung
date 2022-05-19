
public class Arzt extends Person{

	//Gehalt vom Arzt
	private double Gehalt;
	
	private String Fachrichtung;
	private String Abteilung;
	private String iBAN;
	
	public Arzt(String vorname, String name, Adresse adresse, double gehalt, String fachrichtung, String abteilung, String iban ) throws Exception {
		super(vorname, name, adresse);
		
		this.setAbteilung(abteilung);
		this.setGehalt(gehalt);
		this.setIBAN(iban);
		this.setFachrichtung(fachrichtung);
	}

	public String getFachrichtung() {
		return Fachrichtung;
	}

	public void setFachrichtung(String fachrichtung) {
		Fachrichtung = fachrichtung;
	}

	public double getGehalt() {
		return Gehalt;
	}


public void setGehalt(double gehalt) throws Exception {
	if(gehalt < 50000 | gehalt > 150000)
   		throw new Exception("Gehalt muss zwischen 500000 und 150000 Euro liegen");
   	
   	Gehalt = gehalt;
   }

	public String getAbteilung() {
		return Abteilung;
	}

	public void setAbteilung(String abteilung) {
		Abteilung = abteilung;
	}

	public String getIBAN() {
		return iBAN;
	}

	public void setIBAN(String iBAN) {
		iBAN = iBAN;
	}
	
	public void OperationDurchführen() throws Exception
	{
		throw new Exception("Not implemented");
	}
	
	public void OberarztKonsultieren() throws Exception
	{
		throw new Exception("Not implemented");
	}
	
	private void GehaltUeberweisen()throws Exception {
		throw new Exception("Not implemented");
		   	}
	
}
