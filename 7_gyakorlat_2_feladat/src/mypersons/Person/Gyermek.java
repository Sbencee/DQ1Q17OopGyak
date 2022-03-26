package mypersons.Person;

public class Gyermek extends Szemely{
	
	private String iskola;
	
	public Gyermek() {	
	}
	public Gyermek(String nev,int kor,String iskola) {
		super(nev,kor);
		this.iskola = iskola;
	}

	public String getIskola() {
		return iskola;
	}

	public void setIskola(String iskola) {
		this.iskola = iskola;
	}
	@Override
	public String toString() {
		return "Gyermek [iskola=" + iskola + ", Iskola=" + getIskola() + ", Nev=" + getNev() + ", Kor="
				+ getKor() + "]";
	}
	

	
	
	
	
}
