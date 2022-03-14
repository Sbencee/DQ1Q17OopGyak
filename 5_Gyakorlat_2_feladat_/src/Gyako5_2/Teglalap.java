package Gyako5_2;

public class Teglalap {
	private int hosszusag;
	private int szelesseg;
	
	public Teglalap() {//üres konstruktor
		
	}
	public Teglalap(int hosszusag_, int szelesseg_) {//konstruktor
		this.hosszusag = hosszusag_;
		this.szelesseg = szelesseg_;
	}
	public int getHosszusag() {
		return hosszusag;
	}
	public void setHosszusag(int hosszusag_) {
		this.hosszusag = hosszusag_;
	}
	public int getSzelesseg() {
		return szelesseg;
	}
	public void setSzelesseg(int szelesseg_) {
		this.szelesseg = szelesseg_;
	}
	public void display(int i) {
		System.out.println((i+1)+". Hosszúság: "+getHosszusag()+", Szélesség: "+getSzelesseg());
	}
	@Override
	public String toString() {
		return "Hosszúság: "+getHosszusag()+" Szélesség: "+getSzelesseg()+"\n"; 
	}
}
