package Model;

import java.util.ArrayList;

public class Model {


	private ArrayList<Student> studenti;
	private ArrayList<Ocena> ocene;
	private ArrayList<Profesor> profesori;
	private ArrayList<Predmet> predmeti;
	
	
	
	public boolean addStudenta(Student s) 
	{
		for(int i=0;i<studenti.size();i++) 
		{
			if(studenti.get(i).getBrIndexa()==s.getBrIndexa()) 
			{
				return false;
			}
			studenti.add(s);
		}
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
			ocene.add(o);
		}
		return true;
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
	
	public boolean deleteProfesor(Profesor p) 
	{
		for(int i=0;i<profesori.size();i++) 
		{
			if(profesori.get(i).getBrLK()==p.getBrLK()) 
			{
				profesori.remove(p);
				return true;
			}
		}
		return false;
	}
	
	public boolean deletePredmet(Predmet p) 
	{
		for(int i=0;i<predmeti.size();i++) 
		{
			if(predmeti.get(i).getSifraPr()==p.getSifraPr()) 
			{
				predmeti.remove(p);
				return true;
			}
		}
		return false;
	}
	
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
	
	public boolean addPredmet(Predmet pr) 
	{
		for(int i=0;i<predmeti.size();i++) 
		{
			if(predmeti.get(i).getSifraPr()==pr.getSifraPr()) 
			{
				return false;
			}
			predmeti.add(pr);
		}
		return true;
	}
	
	public Profesor findProfesor(String BrLk) 
	{
		for(int i=0;i<profesori.size();i++) 
		{
			if(profesori.get(i).getBrLK()==BrLk) 
			{
				return profesori.get(i);
				
			}
				
		}
		return null;
	}
	
	public Predmet findPredmet(String sifraPr) 
	{
		for(int i=0;i<predmeti.size();i++) 
		{
			if(predmeti.get(i).getSifraPr()==sifraPr)
			{
				return predmeti.get(i);
				
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
	
	
	public Model(ArrayList<Student> studenti, ArrayList<Profesor> profesori, ArrayList<Predmet> predmeti,
			ArrayList<Ocena> ocene) {
		super();
		this.studenti = studenti;
		this.ocene = ocene;
		this.profesori = profesori;
		this.predmeti = predmeti;
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
	
	public ArrayList<Profesor> getProfesori() {
		return profesori;
	}
	public void setProfesori(ArrayList<Profesor> profesori) {
		this.profesori = profesori;
	}
	public ArrayList<Predmet> getPredmeti() {
		return predmeti;
	}
	public void setPredmeti(ArrayList<Predmet> predmeti) {
		this.predmeti = predmeti;
	

	}
}
