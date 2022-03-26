package myPackage.first;

public class Szam {
	private	final static double tures=0.001d;
	private double parameter;
	
	public Szam() {
		
	}
	
	public Szam(int parameter) {
		super();
		this.parameter = parameter;
	}

	public double getParameter() {
		return parameter;
	}

	public void setParameter(int parameter) {
		this.parameter = parameter;
	}

	public static double getTures() {
		return tures;
	}

	@Override
	public String toString() {
		return "Szam [parameter=" + parameter + "]";
	}
	
	
	}
