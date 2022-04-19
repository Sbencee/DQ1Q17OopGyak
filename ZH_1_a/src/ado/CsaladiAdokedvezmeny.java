package ado;

public class CsaladiAdokedvezmeny extends Adokedvezmeny{
	private int gyerekszam;
	private int egyGyerekKedvezmeny;
	private static int tomb[] = {10000,17500,33000};

	public CsaladiAdokedvezmeny(String tipusa, int gyerekszam) {
		super(tipusa);
		if (gyerekszam>0) {
			this.gyerekszam = gyerekszam;
		}
		if (gyerekszam==1) {
			this.egyGyerekKedvezmeny = tomb[0];
		}
		else  if (gyerekszam==2) {
			this.egyGyerekKedvezmeny = tomb[1];
		}
		else if(gyerekszam>=3) {
			this.egyGyerekKedvezmeny = tomb[2];
		}
		
	}

	public int getGyerekszam() {
		return gyerekszam;
	}

	public void setGyerekszam(int gyerekszam) {
		this.gyerekszam = gyerekszam;
	}

	public int getEgyGyerekKedvezmeny() {
		return egyGyerekKedvezmeny;
	}

	public void setEgyGyerekKedvezmeny(int egyGyerekKedvezmeny) {
		this.egyGyerekKedvezmeny = egyGyerekKedvezmeny;
	}

	@Override
	public int adokedvezmeny() {
		return getGyerekszam()*getEgyGyerekKedvezmeny();
	}

	@Override
	public String toString() {
		return "CsaladiAdokedvezmeny [getGyerekszam()=" + getGyerekszam() + ", getEgyGyerekKedvezmeny()="
				+ getEgyGyerekKedvezmeny() + ", adokedvezmeny()=" + adokedvezmeny() + ", getTipusa()=" + getTipusa()
				+ "]";
	}
	public boolean osszehasonli(CsaladiAdokedvezmeny csalad) {
		boolean ok=false;
		if (adokedvezmeny()>csalad.adokedvezmeny()) {
			return ok = true;
		}
		return ok;
	}
	
}
