package ado;

public abstract class Adokedvezmeny {
	private String tipusa;

	public Adokedvezmeny(String tipusa) {
		super();
		this.tipusa = tipusa;
	}

	public String getTipusa() {
		return tipusa;
	}

	public void setTipusa(String tipusa) {
		this.tipusa = tipusa;
	}
	
	 abstract int adokedvezmeny();
}
