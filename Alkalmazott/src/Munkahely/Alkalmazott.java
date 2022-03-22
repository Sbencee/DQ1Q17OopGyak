package Munkahely;

public class Alkalmazott {
	private String nev;
	private int kor;
	private int fizetes;
	
	static int nyugdijkorhatar;
	
	public Alkalmazott(String nev, int kor, int fizetes) {
		this.nev=nev;
		this.kor=kor;
		this.fizetes=fizetes;
	}
	public Alkalmazott(String nev, int kor) {
		this.nev=nev;
		this.kor=kor;
		this.fizetes=kor*10000;
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
	public int getFizetes() {
		return fizetes;
	}
	public void setFizetes(int fizetes) {
		this.fizetes = fizetes;
	}
	public int getNyugdijkorhatar() {
		return nyugdijkorhatar;
	}

	public int nyugdij() {
		return getNyugdijkorhatar()-getKor();
	}
	@Override
	public String toString() {
		return "Nev: "+getNev()+", Kor: "+getKor()+", Fizetés: "+getFizetes()+", a nyugdíjkorhatárig hátralévõ idõ: "+nyugdij();
	}
	public Alkalmazott comparenyugdij(Alkalmazott A, Alkalmazott B) {
		if(A.nyugdij()>B.nyugdij())
			return A;
		else if(A.nyugdij()<B.nyugdij())
			return B;
		else
			return null;
	}
	
}
