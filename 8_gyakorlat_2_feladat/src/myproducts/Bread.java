package myproducts;

public class Bread extends Product {
	private double amount;

	public Bread(String name, int netPrice, int taxRate, double amount) {
		super(name, netPrice, taxRate);
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public double getUnitPrice() {
		return getVarPrice() / amount;
	}

	@Override
	public String toString() {
		return "Bread [amount=" + amount + ", getUnitPrice()=" + getUnitPrice() + ", getVatPrice()=" + getVarPrice()
				+ ", getName()=" + getName() + ", getNetPrice()=" + getNetPrice() + ", getTaxRate()=" + getTaxRate()
				+ "]";
	}
	
	public static int compareUnitPrice(Bread b1, Bread b2) {
		if(b1.getUnitPrice() > b2.getUnitPrice())
			return 1;
		else if(b1.getUnitPrice() < b2.getUnitPrice())
			return -1;
		else
			return 0;
	}

	@Override
	public int getVarPrice() {
		return (getNetPrice() * getTaxRate()) / 100;
	}
}
