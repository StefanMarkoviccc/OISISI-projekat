package Model;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Profesor {
	
	private String prezime;
	private String ime;
	private LocalDateTime datumR;
	private String adresaStanovanja;
	private String telefon;
	private String email;
	private String adresaKancelarije;
	private String brLK;
	private String titula;
	private String zvanje;
	private ArrayList<Predmet> predmeti;
	
	
	
	
	
	
	
	
	public Profesor(String prezime, String ime, LocalDateTime datumR, String adresaStanovanja, String telefon,
			String email, String adresaKancelarije, String brLK, String titula, String zvanje,
			ArrayList<Predmet> predmeti) {
		super();
		this.prezime = prezime;
		this.ime = ime;
		this.datumR = datumR;
		this.adresaStanovanja = adresaStanovanja;
		this.telefon = telefon;
		this.email = email;
		this.adresaKancelarije = adresaKancelarije;
		this.brLK = brLK;
		this.titula = titula;
		this.zvanje = zvanje;
		this.predmeti = predmeti;
	}
	
	public Profesor(String prezime, String ime, LocalDateTime datumR, String adresaStanovanja, String telefon,
			String email, String adresaKancelarije, String brLK, String titula, String zvanje) {
		super();
		this.prezime = prezime;
		this.ime = ime;
		this.datumR = datumR;
		this.adresaStanovanja = adresaStanovanja;
		this.telefon = telefon;
		this.email = email;
		this.adresaKancelarije = adresaKancelarije;
		this.brLK = brLK;
		this.titula = titula;
		this.zvanje = zvanje;
		this.predmeti = new ArrayList<Predmet>();
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
	public String getTelefon() {
		return telefon;
	}
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAdresaKancelarije() {
		return adresaKancelarije;
	}
	public void setAdresaKancelarije(String adresaKancelarije) {
		this.adresaKancelarije = adresaKancelarije;
	}
	public String getBrLK() {
		return brLK;
	}
	public void setBrLK(String brLK) {
		this.brLK = brLK;
	}
	public String getTitula() {
		return titula;
	}
	public void setTitula(String titula) {
		this.titula = titula;
	}
	public String getZvanje() {
		return zvanje;
	}
	public void setZvanje(String zvanje) {
		this.zvanje = zvanje;
	}
	public ArrayList<Predmet> getPredmeti() {
		return predmeti;
	}
	public void setPredmeti(ArrayList<Predmet> predmeti) {
		this.predmeti = predmeti;
	}
	
	
	

}
