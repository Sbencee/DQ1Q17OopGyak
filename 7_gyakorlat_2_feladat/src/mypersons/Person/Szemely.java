package mypersons.Person;

public abstract class Szemely {
	private String nev;
	private int kor;

	public Szemely() {
		
	}
	public Szemely(String nev, int kor) {
		super();
		this.nev = nev;
		this.kor = kor;
	}
	public String getNev() {
		return nev;
	}
	public void setNev(String nev) {
		this.nev = nev;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	@Override
	public String toString() {
		return "Szemely [nev=" + nev + ", kor=" + kor + "]";
	}
	public boolean eletKor(int kor) {
		boolean ok=false;
		if (kor<this.kor) {
			ok=true;
		}
		return ok;
	}
}
