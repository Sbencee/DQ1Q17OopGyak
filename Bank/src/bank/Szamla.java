package bank;

public class Szamla {
	private int szamlaszam;
	private int egyenleg;
	
	private static double penzfelvetelKoltsege=0.05;
	public Szamla() {
		
	}
	public Szamla(int szamlaszam,int egyenleg) {
		super();
		this.szamlaszam=szamlaszam;
		this.egyenleg=egyenleg;
	}
	public Szamla(int szamlaszam) {
		this(szamlaszam,0);
	}
	
	
	public int getSzamlaszam() {
		return szamlaszam;
	}
	public void setSzamlaszam(int szamlaszam) {
		this.szamlaszam = szamlaszam;
	}
	public int getEgyenleg() {
		return egyenleg;
	}
	public void setEgyenleg(int egyenleg) {
		this.egyenleg = egyenleg;
	}
	public static double getPenzfelvetelKoltsege() {
		return penzfelvetelKoltsege;
	}
	public void betesz(int berak) {
		if (berak>=0) {
			this.egyenleg+=berak;
		}
		else {
			System.out.println("Csak pozitiv számot adhatmeg!");
		}
	}
	public boolean kivesz(int kivesz_) {
		boolean ok =false;
		int szamol=0;
		if (kivesz_>0) {
			szamol=getEgyenleg()-(int)(kivesz_+(kivesz_*getPenzfelvetelKoltsege()));
			if (szamol>=0) {
				setEgyenleg(szamol);
				ok=true;
			}
			else {
				ok=false;
			}
		}
		else {
			System.out.println("Csak pozitiv számot adhatmeg!");
		}
		return ok;
	}
	@Override
	/*public String toString() {
		return "Szamla [szamlaszam=" + szamlaszam + ", egyenleg=" + egyenleg + "]";
	}*/
	public String toString() {
		return "Szamla [szamlaszam="+getSzamlaszam()+", egyenleg="+getEgyenleg()+"]";
	}
}
