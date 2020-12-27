package Model;
import java.io.Serializable;
import java.time.LocalDateTime;

public class Ocena implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1098667057938323360L;
	private Student student;
	private Predmet predmet;
	private int ocena;
	private LocalDateTime datumPolaganja;
	public Ocena(Student student, Predmet predmet, int ocena, LocalDateTime datumPolaganja)
	{
		super();
		this.student = student;
		this.predmet = predmet;
		this.ocena = ocena;
		this.datumPolaganja = datumPolaganja;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Predmet getPredmet() {
		return predmet;
	}
	public void setPredmet(Predmet predmet) {
		this.predmet = predmet;
	}
	public int getOcena() {
		return ocena;
	}
	public void setOcena(int ocena){
		if(ocena>=6 && ocena<=10) {
		this.ocena = ocena;
		}
	}
	public LocalDateTime getDatumPolaganja() {
		return datumPolaganja;
	}
	public void setDatumPolaganja(LocalDateTime datumPolaganja) {
		this.datumPolaganja = datumPolaganja;
	}
	
	
	
	
}
