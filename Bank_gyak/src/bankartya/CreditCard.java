package bankartya;

import java.time.LocalDate;

public class CreditCard extends Card {

	private int hitelkeret;

	public CreditCard() {
		
	}

	public CreditCard(String tulajdonosneve, LocalDate ervenyesseg, kibocsajtobank banknev, int egyenleg) {
		super(tulajdonosneve, ervenyesseg, banknev, egyenleg);
		this.hitelkeret = 100000 ;
	}

	public CreditCard(String tulajdonosneve, LocalDate ervenyesseg, kibocsajtobank banknev, int egyenleg, int hitelkeret) {
		super(tulajdonosneve, ervenyesseg, banknev, egyenleg);
		this.hitelkeret = hitelkeret;
	}
	
	
	public int getHitelkeret() {
		return hitelkeret;
	}

	public void setHitelkeret(int hitelkeret) {
		this.hitelkeret = hitelkeret;
	}

	@Override
	public boolean penzfelvet(int felvettosszeg) {
		boolean ok=false;
		int osszeg=0;
		if (getEgyenleg()+getHitelkeret()>=felvettosszeg && ervenyesdatum()) {
			osszeg=(getEgyenleg()+getHitelkeret())-felvettosszeg;
			if (osszeg>getEgyenleg()) {
				setHitelkeret(osszeg-getEgyenleg());
				setEgyenleg(0);
			}
			else {
				setEgyenleg(getEgyenleg()-osszeg);
			}
			ok=true;
		}
		
		return ok;
	}
	/*@Override
	public  boolean penzfelvet(int kivetosszeg) {
		boolean ok= false;
		int osszeg=0;
		Card penz = new Card();
		if (getEgyenleg()+getHitelkeret()>=kivetosszeg && ervenyes()) {
			osszeg=getEgyenleg()-kivetosszeg;
			if (osszeg<0 && (osszeg*(-1)<=hitelkeret)) {
				hitelkeret=getHitelkeret()-(osszeg*(-1));
				setHitelkeret(hitelkeret);
				setEgyenleg(0);
				ok=true;
			}
			else if (osszeg>=0) {
				setEgyenleg(osszeg);
				ok=true;
			}
		} 
		return ok;
	}*/
	@Override
	public String toString() {
			return " Nev: " + getTulajdonosneve() +" Ervenyesseg: "+getErvenyesseg()+" Bank: "+getBanknev()+" Egyenleg: "+getEgyenleg()+" Keredit:"+getHitelkeret() ;
	}
	
	
}
