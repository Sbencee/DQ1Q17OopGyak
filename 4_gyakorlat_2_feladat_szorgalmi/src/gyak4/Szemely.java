package gyak4;

public class Szemely {
	private String nev;
	private int suly;
	private double magassag;
	
	public void setNev(String nev_) {
		this.nev=nev_;
	}
	public String getNev() {
		return this.nev;
	}
	public void setSuly(int suly_) {
		this.suly=suly_;
	}
	public int getSuly() {
		return this.suly;
	}
	public void setMagassag(double magassag_) {
		this.magassag=magassag_;
	}
	public double getMagassag() {
		return this.magassag;
	}
	public double tti() {
		return ((double)getSuly()/(getMagassag()*getMagassag()));
	}
	public String alkat(double tti_) {
		String s="";
		if(tti_<18.5) {
			s="sovány";
		}
		else if (tti_>25) {
			s="kövér";
		}
		else {
			s="normál";
		}
		return s;
	}
	public String osszefuz() {
		String s1="";
		//s1=getNev();
		s1+= getNev().concat(", ");
		s1+= String.valueOf(getSuly()).concat(", ");
		s1+= String.valueOf(getMagassag()).concat(", ");
		s1+= String.valueOf(ttiCsonkol(tti(),2)).concat(", ");
		s1+= alkat(ttiCsonkol(tti(),2));
		return s1;
	}
	static double ttiCsonkol(double tti_, int csonkMeghat)   
	{   
		tti_ = tti_* Math.pow(10, csonkMeghat);   
		tti_ = Math.floor(tti_);   
		tti_ = tti_ / Math.pow(10, csonkMeghat);   
		return tti_;
	}   
}
