package gyakorlat4d;
//package gyakorlat4d;
public class Alkalmazott {
	private	String nev;
	private	int fizetes;
	
	public int salaryIncrease(int fizetes_) {
		return this.fizetes+= fizetes_;
	}
	public String osszefuzNenFiz() {
		String osszefuz= nev+fizetes;
		return osszefuz;
	}
	public void setNev(String nev_) {//beállit Setter metodus amivel a nevet allitjukbe
		this.nev=nev_;
	}
	public String getNev() {//elkér Getter metodus amivel név adattagbol kérjukle az adatott
		String nev_ ="";
		return nev_= this.nev;
	}
	public void setFiz( int fizetes_) {//beállit Setter metodus amivel a fizetest allitjukbe
		if (fizetes_<0 ) {
			fizetes_=0;
		}
		this.fizetes=fizetes_;
	}
	public int getFiz() {//elkér Getter metodus amivel fizetes adattagbol kérjukle az adatott
		int fizetes_=0;
		return fizetes_=this.fizetes;
	}
	public boolean fizVizsgalat(int fizAlso,int fizFelso) {
		boolean ok= false;
		if (this.fizetes>fizAlso && this.fizetes<fizFelso) {
			ok=true;
		}
		else {
			ok=false;
		}
		return ok;
	}
	public double ado(int adoKulcs) {
		double adoErtek=0.0;
		adoErtek += Math.round(fizetes*(float)adoKulcs/100);
		return adoErtek;
	}
	public boolean fizOsszehasonlit(int fizetes1,int parameterfizetes) {
		boolean ok=false;
		if (fizetes1>parameterfizetes) {
			ok=true;
		}
		else {
			ok=false;
		}
		return ok;
	}
}
