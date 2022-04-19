package szgep;

public abstract class Adathordozo {
	private String tipus;
	private double kapacitas;
	
	public Adathordozo(String tipus, double kapacitas) {
		super();
		this.tipus = tipus;
		this.kapacitas = kapacitas;
	}

	public String getTipus() {
		return tipus;
	}

	public void setTipus(String tipus) {
		this.tipus = tipus;
	}

	public double getKapacitas() {
		return kapacitas;
	}

	public void setKapacitas(double kapacitas) {
		this.kapacitas = kapacitas;
	}

	@Override
	public String toString() {
		return "Adathordozo [tipus=" + tipus + ", kapacitas=" + kapacitas + "]";
	}
	 abstract double szabadterulet();
	
}
