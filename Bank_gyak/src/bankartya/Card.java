package bankartya;

import java.time.LocalDate;

public class Card {
	public enum kibocsajtobank{ OTP, KH, ERSTE, CIB}
	
	private String tulajdonosneve;
	private LocalDate ervenyesseg;
	private int egyenleg;
	private kibocsajtobank banknev;
	
	//Ures
	public Card() {
		
	}
	
	public Card(String tulajdonosneve, LocalDate ervenyesseg, kibocsajtobank banknev, int egyenleg ) {
		super();
		this.tulajdonosneve = tulajdonosneve;
		this.ervenyesseg = ervenyesseg;
		this.egyenleg = egyenleg;
		this.banknev = banknev;
	}

	public String getTulajdonosneve() {
		return tulajdonosneve;
	}

	public void setTulajdonosneve(String tulajdonosneve) {
		this.tulajdonosneve = tulajdonosneve;
	}

	public LocalDate getErvenyesseg() {
		return ervenyesseg;
	}

	public void setErvenyesseg(LocalDate ervenyesseg) {
		this.ervenyesseg = ervenyesseg;
	}

	public int getEgyenleg() {
		return egyenleg;
	}

	public void setEgyenleg(int egyenleg) {
		this.egyenleg = egyenleg;
	}

	public kibocsajtobank getBanknev() {
		return banknev;
	}

	public void setBanknev(kibocsajtobank banknev) {
		this.banknev = banknev;
	}

	@Override
	public String toString() {
		return "Card [tulajdonosneve=" + tulajdonosneve + ", ervenyesseg=" + ervenyesseg + ", egyenleg=" + egyenleg
				+ ", banknev=" + banknev + "]";
	}
	public boolean ervenyesdatum() {
		return !this.ervenyesseg.isBefore(LocalDate.now());
	}
	public boolean penzfelvet(int felvettosszeg) {
		boolean ok=false;
		if (getEgyenleg()>=felvettosszeg && ervenyesdatum()) {
			setEgyenleg(getEgyenleg()-felvettosszeg);
			ok=true;
		}
		
		return ok;
	}
}
