package Model;
import java.io.Serializable;
import java.util.ArrayList;

public class Model implements Serializable {
	private static final long serialVersionUID = -3478224963893009178L;
	private ArrayList<Student> studenti;
	private ArrayList<Ocena> ocene;
	private ArrayList<Profesor> profesori;
	private ArrayList<Predmet> predmeti;
	
	public boolean addProfesora(Profesor p) 
	{
		for(int i=0;i<profesori.size();i++) 
		{
			if(profesori.get(i).getBrLK()==p.getBrLK()) 
			{
				return false;
			}
			profesori.add(p);
		}
		return true;
	}
	
	public boolean deleteOcena(Ocena o) 
	{
		for(int i=0;i<ocene.size();i++) 
		{
			if(ocene.get(i).getStudent()==o.getStudent() && ocene.get(i).getPredmet()==o.getPredmet())
			{
				ocene.remove(o);
				return true;
			}
		}
		return false;
	}
	
	
	
	public boolean deleteStudent(Student s)
	{
		for(int i=0;i<studenti.size();i++) 
		{
			if(studenti.get(i).getBrIndexa()==s.getBrIndexa())
					{
						studenti.remove(s);
						return true;
					}
		}
		return false;
	} 
	
	
	
	
	
	
	
	public boolean addOcena(Ocena o) 
	{
		for(int i=0;i<ocene.size();i++) 
		{
			if(ocene.get(i).getStudent()==o.getStudent() && ocene.get(i).getPredmet()==o.getPredmet()) 
			{
				return false;
			}
		}
		ocene.add(o);
		return true;
	}
	
	
	
	
	
	public boolean addStudenta(Student s) 
	{
		for(int i=0;i<studenti.size();i++) 
		{
			if(studenti.get(i).getBrIndexa()==s.getBrIndexa()) 
			{
				return false;
			}
		}
		studenti.add(s);
		return true;
	}
	
	public Student findStudent(String index )
	{
		for(int i=0;i<studenti.size();i++) 
		{
			if(studenti.get(i).getBrIndexa()==index) 
			{
				return studenti.get(i);	
			}
			
		}
		return null;
	}
	
	
	
	
	
	
	public Ocena findOcena(String index,String sifraPr) 
	{
		for(int i=0;i<ocene.size();i++) 
		{
			if(ocene.get(i).getStudent().getBrIndexa()==index && ocene.get(i).getPredmet().getSifraPr()==sifraPr)
			{
				return ocene.get(i);	
			}
				
		}
		return null;
	}
	
	public Model() 
	{
		studenti = new ArrayList<Student>();
		ocene = new ArrayList<Ocena>();
		profesori = new ArrayList<Profesor>();
		predmeti = new ArrayList<Predmet>();
	}
	

	
	
	public ArrayList<Student> getStudenti() {
		return studenti;
	}
	public void setStudenti(ArrayList<Student> studenti) {
		this.studenti = studenti;
	}
	
	public ArrayList<Ocena> getOcene() {
		return ocene;
	}
	public void setOcene(ArrayList<Ocena> ocene) {
		this.ocene = ocene;
	}
	

}
