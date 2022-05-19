import java.util.Date;

public class Oberarzt extends Arzt{

	private Date oberarztSeit;
	
	
	public Oberarzt(String vorname, String name, Adresse adresse, double gehalt, String fachrichtung, String abteilung,
			String iban, Date oberarztSeit) throws Exception {
		super(vorname, name, adresse, gehalt, fachrichtung, abteilung, iban);

		this.setOberarztSeit(oberarztSeit);
	}

	public Date getOberarztSeit() {
		return oberarztSeit;
	}

	public void setOberarztSeit(Date oberarztSeit) {
		this.oberarztSeit = oberarztSeit;
	}

	public void SchichtplanAnlegen() throws Exception
	{
		throw new Exception("Not implemented");
	}
	

	@Override
	public void OperationDurchführen() 
	{
		System.out.println("Der Oberarzt operiert");
	}
	
	
	
	
}
