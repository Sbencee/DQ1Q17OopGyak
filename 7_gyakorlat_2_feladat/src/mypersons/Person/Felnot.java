package mypersons.Person;

public class Felnot extends Szemely{
	
	private String munkahely;
	
	
	public Felnot() {
		
	}
	public Felnot(String nev,int kor,String munkahely) {
		super(nev,kor);
		this.munkahely = munkahely;
	}

	public String getMunkahely() {
		return munkahely;
	}

	public void setMunkahely(String munkahely) {
		this.munkahely = munkahely;
	}
	@Override
	public String toString() {
		return "Felnot [munkahely=" + munkahely + ", Nev()=" + getNev() + ", tKor()=" + getKor() + "]";
	}
	
	
	
}
