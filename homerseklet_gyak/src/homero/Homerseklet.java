package homero;


public class Homerseklet {
	public enum homermertekegyseg{ CELSIUS, KELVIN}
	
	private homermertekegyseg mertekegyseg;
	private double homerseklet;
	
	public Homerseklet() {
		
	}
	
	public Homerseklet(homermertekegyseg mertekegyseg, double homerseklet) {
		super();
		this.mertekegyseg = mertekegyseg;
		this.homerseklet = homerseklet;
	}

	public Homerseklet(double homerseklet) {
		super();
		this.homerseklet = homerseklet;
		this.mertekegyseg=homermertekegyseg.CELSIUS;
	}

	public homermertekegyseg getMertekegyseg() {
		return mertekegyseg;
	}

	public void setMertekegyseg(homermertekegyseg mertekegyseg) {
		this.mertekegyseg = mertekegyseg;
	}

	public double getHomerseklet() {
		return homerseklet;
	}

	public void setHomerseklet(double homerseklet) {
		this.homerseklet = homerseklet;
	}

	@Override
	public String toString() {
		return "Homerseklet [mertekegyseg=" + mertekegyseg + ", homerseklet=" + homerseklet + "]";
	}
	
	public  Homerseklet konvHomerseklet(double homer, homermertekegyseg mertekegyseg_) {
		double CK=273.15,eredmeny=0.0;
		if (mertekegyseg_==mertekegyseg.CELSIUS) {
			eredmeny=homer+CK;
			mertekegyseg_=mertekegyseg.KELVIN;
		}
		else if(mertekegyseg_==mertekegyseg.KELVIN) {
			eredmeny=homer-CK;
			mertekegyseg_=mertekegyseg.CELSIUS;

		}
		Homerseklet k= new Homerseklet(mertekegyseg_,eredmeny);
		return k;
	}
	
}
