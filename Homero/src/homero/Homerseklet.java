package homero;

public class Homerseklet {
	public enum mertekegyseg{CELSIUS, KELVIN};
	
	private mertekegyseg tarolmertegyseg;
	private double homerseklet;
	
	public Homerseklet() {
		
	}
	
	public Homerseklet( double homerseklet,mertekegyseg tarolmertegyseg) {
		super();
		this.tarolmertegyseg = tarolmertegyseg;
		this.homerseklet = homerseklet;
	}
	public Homerseklet(int homerseklet) {
		super();
		this.homerseklet = homerseklet;
		tarolmertegyseg=mertekegyseg.CELSIUS;
	}
	@Override
	public String toString() {
		return "Homerseklet [ertek=" + homerseklet + ", mertekegyseg=" + tarolmertegyseg + "]";
	}
	public mertekegyseg getTarolmertegyseg() {
		return tarolmertegyseg;
	}
	public void setTarolmertegyseg(mertekegyseg tarolmertegyseg) {
		this.tarolmertegyseg = tarolmertegyseg;
	}
	public double getHomerseklet() {
		return homerseklet;
	}
	public void setHomerseklet(double homerseklet) {
		this.homerseklet = homerseklet;
	}
	public static Homerseklet konvHomerseklet( mertekegyseg mertekegyseg_,double homerseklet) {
		double absnullC = 273.15,homersekleteredmeny=0;
		
		if (mertekegyseg_==mertekegyseg.CELSIUS) {
			homersekleteredmeny=homerseklet+absnullC;
			mertekegyseg_=mertekegyseg.KELVIN;
		}
		else if (mertekegyseg_== mertekegyseg.KELVIN) {
			homersekleteredmeny=homerseklet-absnullC;
			mertekegyseg_=mertekegyseg.CELSIUS;
		}
		Homerseklet home= new Homerseklet(homersekleteredmeny,mertekegyseg_);
		return home;
	}
}
