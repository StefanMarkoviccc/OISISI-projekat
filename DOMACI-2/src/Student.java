import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;


public class Student implements Serializable {
	
	private String prezime;
	private String ime;
	private LocalDateTime datumR;
	private String adresaStanovanja;
	private String kontaktTel;
	private String emailAdresa;
	private String brIndexa;
	private int godUpisa;
	private TrenutnaGodina godina;
	private Status status;
	private double prosecnaOcena;
	private ArrayList<Ocena> ocene;
	private ArrayList<Predmet> nepolozeniPredmeti;
	
	
	
	
	public Student(
	String prezime, String ime, LocalDateTime datumR, String adresaStanovanja, String kontaktTel,
		String emailAdresa, String brIndexa, int godUpisa, TrenutnaGodina godina, Status status) {
	super();
	this.prezime = prezime;
	this.ime = ime;
	this.datumR = datumR;
	this.adresaStanovanja = adresaStanovanja;
	this.kontaktTel = kontaktTel;
	this.emailAdresa = emailAdresa;
	this.brIndexa = brIndexa;
	this.godUpisa = godUpisa;
	this.godina = godina;
	this.status = status;
	this.ocene = new ArrayList<Ocena>();
	this.nepolozeniPredmeti = new ArrayList<Predmet>() ;
	}
	
	
	
	
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public LocalDateTime getDatumR() {
		return datumR;
	}
	public void setDatumR(LocalDateTime datumR) {
		this.datumR = datumR;
	}
	public String getAdresaStanovanja() {
		return adresaStanovanja;
	}
	public void setAdresaStanovanja(String adresaStanovanja) {
		this.adresaStanovanja = adresaStanovanja;
	}
	public String getKontaktTel() {
		return kontaktTel;
	}
	public void setKontaktTel(String kontaktTel) {
		this.kontaktTel = kontaktTel;
	}
	public String getEmailAdresa() {
		return emailAdresa;
	}
	public void setEmailAdresa(String emailAdresa) {
		this.emailAdresa = emailAdresa;
	}
	public String getBrIndexa() {
		return brIndexa;
	}
	public void setBrIndexa(String brIndexa) {
		this.brIndexa = brIndexa;
	}
	public int getGodUpisa() {
		return godUpisa;
	}
	public void setGodUpisa(int godUpisa) {
		this.godUpisa = godUpisa;
	}
	public TrenutnaGodina getGodina() {
		return godina;
	}
	public void setGodina(TrenutnaGodina godina) {
		this.godina = godina;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public double getProsecnaOcena() {
		return prosecnaOcena;
	}
	public void setProsecnaOcena(double prosecnaOcena) {
		this.prosecnaOcena = prosecnaOcena;
	}
	public ArrayList<Ocena> getOcene() {
		return ocene;
	}
	public void setOcene(ArrayList<Ocena> ocene) {
		this.ocene = ocene;
	}
	public ArrayList<Predmet> getNepolozeniPredmeti() {
		return nepolozeniPredmeti;
	}
	public void setNepolozeniPredmeti(ArrayList<Predmet> nepolozeniPredmeti) {
		this.nepolozeniPredmeti = nepolozeniPredmeti;
	}
}
