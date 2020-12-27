
import java.util.ArrayList;


public class Predmet {
	
	private String sifraPr;
	private String NazivPr;
	private Semestar semestar;
	private TrenutnaGodina godStudija;
	private Profesor profesor;
	private int espb;
	private ArrayList<Student> poloziliPr;
	private ArrayList<Student> paliPr;
	
	
	
	public Predmet(String sifraPr, String nazivPr, Semestar semestar, TrenutnaGodina godStudija, Profesor profesor,
			int espb) {
		super();
		this.sifraPr = sifraPr;
		NazivPr = nazivPr;
		this.semestar = semestar;
		this.godStudija = godStudija;
		this.profesor = profesor;
		this.espb = espb;
		this.poloziliPr = new ArrayList<Student>();
		this.paliPr = new ArrayList<Student>();
	}
	public String getSifraPr() {
		return sifraPr;
	}
	public void setSifraPr(String sifraPr) {
		this.sifraPr = sifraPr;
	}
	public String getNazivPr() {
		return NazivPr;
	}
	public void setNazivPr(String nazivPr) {
		NazivPr = nazivPr;
	}
	public Semestar getSemestar() {
		return semestar;
	}
	public void setSemestar(Semestar semestar) {
		this.semestar = semestar;
	}
	public TrenutnaGodina getGodStudija() {
		return godStudija;
	}
	public void setGodStudija(TrenutnaGodina godStudija) {
		this.godStudija = godStudija;
	}
	public Profesor getProfesor() {
		return profesor;
	}
	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}
	public int getEspb() {
		return espb;
	}
	public void setEspb(int espb) {
		if(espb>=0 && espb<=240) {
		this.espb = espb;
		}
	}
	public ArrayList<Student> getPoloziliPr() {
		return poloziliPr;
	}
	public void setPoloziliPr(ArrayList<Student> poloziliPr) {
		this.poloziliPr = poloziliPr;
	}
	public ArrayList<Student> getPaliPr() {
		return paliPr;
	}
	public void setPaliPr(ArrayList<Student> paliPr) {
		this.paliPr = paliPr;
	}
	
	
	
}
