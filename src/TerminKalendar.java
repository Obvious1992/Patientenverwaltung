import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class TerminKalendar {

	private ArrayList<Termin> Termine = new ArrayList<Termin>();
	
	public boolean PatientBuchtTermin(Termin termin) throws Exception {
		
		if(!PruefenObEinTagEinArbeitstagIst(termin.getZeitpunkt()))
			return false;
		
		if(!PruefenObTerminFreiIst(termin.getZeitpunkt()))
			return false;
		
		Termine.add(termin);
		
		return true;
	}
	
	public boolean MitarbeiterBuchtTermin(Termin termin) throws Exception {
		
		if(!PruefenObEinTagEinArbeitstagIst(termin.getZeitpunkt()))
			return false;
		
		Termine.add(termin);
		
		return true;
	}
	
	
	public boolean TerminStornieren(Termin termin)throws Exception  {
		
		if(!PruefenObTerminExistiert(termin))
			return false;
		
		Termine.remove(termin);
		
		return true;
	}
	
	//Prüft ob ein übergebenes Datum ein Arbeitstag (Mo-Fr) ist
	private boolean PruefenObEinTagEinArbeitstagIst(LocalDateTime Date) throws Exception {
		
		DayOfWeek tag = Date.getDayOfWeek();
		
		if(tag == DayOfWeek.SATURDAY)
			throw new Exception("Der gewuenschte Tag sollte kein Samstag sein");
		if(tag == DayOfWeek.SUNDAY)
			throw new Exception("Der gewuenschte Tag sollte kein Sonntag sein");
		else
			return true;
		
	}
	

	//Prüft ob ein übergebene Datum/ Uhrzeit noch verfügbar sind 
	private boolean PruefenObTerminFreiIst(LocalDateTime gewuenschtesDatum) throws Exception {
		
		for(Termin termin : Termine) {
			if(gewuenschtesDatum.equals(termin.getZeitpunkt()))
				throw new Exception("Der gewuenschte Termin ist bereits vergeben");
		}
		return true;
	}
	
	private boolean PruefenObTerminExistiert(Termin t) throws Exception {
		if(Termine.contains(t))
			return true;
		throw new Exception("Der angegebene Termin existiert nicht");
	}
	
	public int GetAnzahlTermine() {
		return Termine.size();
	}
	
	
}
