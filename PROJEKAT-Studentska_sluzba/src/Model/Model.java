package Model;

import java.util.ArrayList;

public class Model {


	private ArrayList<Student> studenti;
	private ArrayList<Ocena> ocene;
	
	
	
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
	
	

	public Model() 
	{
		studenti = new ArrayList<Student>();
		ocene = new ArrayList<Ocena>();
	}
	
	
	public Model(ArrayList<Student> studenti, ArrayList<Profesor> profesori, ArrayList<Predmet> predmeti,
			ArrayList<Ocena> ocene) {
		super();
		this.studenti = studenti;
		this.ocene = ocene;
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
