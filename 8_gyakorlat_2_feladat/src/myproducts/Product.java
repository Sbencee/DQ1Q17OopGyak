package myproducts;

public abstract class Product {
	private String name;
	private int netPrice;
	private int taxRate;
	
	public Product(String name, int netPrice, int taxRate) {
		super();
		this.name = name;
		this.netPrice = netPrice;
		this.taxRate = taxRate;
	}
	
	

	@Override
	public String toString() {
		return "Product [name=" + name + ", netPrice=" + netPrice + ", taxRate=" + taxRate + ", getVarPrice()="
				+ getVarPrice() + "]";
	}



	public abstract int getVarPrice(); /*{
		return (netPrice * taxRate) / 100;
	}*/
	
	public void raisePrice(int rate) {
		netPrice += netPrice * rate / 100;
	}
	
	public static int comparePrice(Product p1, Product p2) {
		if(p1.netPrice > p2.netPrice)
			return 1;
		else if (p1.netPrice < p2.netPrice)
			return -1;
		else
			return 0;
	}

	
	// GETTER, SETTER
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNetPrice() {
		return netPrice;
	}

	public void setNetPrice(int netPrice) {
		this.netPrice = netPrice;
	}

	public int getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(int taxRate) {
		this.taxRate = taxRate;
	}
	
	
}
