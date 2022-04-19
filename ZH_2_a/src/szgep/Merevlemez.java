package szgep;

public class Merevlemez extends Adathordozo{
	private double foglaltTerulet;

	public Merevlemez(String tipus, double kapacitas, double foglaltTerulet) {
		super(tipus, kapacitas);
		this.foglaltTerulet = foglaltTerulet;
	}

	public double getFoglaltTerulet() {
		return foglaltTerulet;
	}

	public void setFoglaltTerulet(double foglaltTerulet) {
		this.foglaltTerulet = foglaltTerulet;
	}
	
	
	@Override
	public String toString() {
		return "Merevlemez [FoglaltTerulet=" + getFoglaltTerulet()
				+ ", szabadterulet()=" + szabadterulet() + ", getTipus()=" + getTipus() + ", getKapacitas()="
				+ getKapacitas() + "]";
	}

	@Override
	public	double szabadterulet() {
		return getKapacitas()-getFoglaltTerulet();
	}
	public boolean osszehasonlit(Merevlemez lemez) {
		boolean ok=false;
		if (szabadterulet()>lemez.szabadterulet()) {
			ok=true;
		}
		return ok;
	}
	public static Merevlemez legnagyobbKapacitas(Merevlemez hdd1,Merevlemez hdd2) {
		if (hdd1.getKapacitas()>hdd2.getKapacitas()) {
			return hdd1;
		}
		else if(hdd2.getKapacitas()>hdd1.getKapacitas()) {
			return hdd2;
		}
		else {
			return null;	
		}
	}
	
	
}
