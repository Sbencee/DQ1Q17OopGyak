package myproducts;



public  class Book extends Product{
	private String title;
	private String author;
	private final int yearOfPublication;
	private int price;
	private int pages;
	private String productName;
	private String style;
	
	/*public Book() {
		this("", "", 0, 0, "", "");
		
	}*/

	public Book(String author, String title, int price, int pages, String productName, String style,String name, int netPrice, int taxRate) {
		super( name,netPrice,taxRate);
		this.author = author;
		this.title = title;
			java.time.LocalDate currentDate = java.time.LocalDate.now();
			int year = currentDate.getYear();
		this.yearOfPublication=year;
		if(price<0)
			this.price = 0;
		else
			this.price = price;
		if(pages<0)
			this.pages = 0;
		else
			this.pages = pages;
		this.productName = productName;
		this.style = style;
	}
	

	public Book(String author, String title, String productName, String stytle,String name, int netPrice, int taxRate) {
		super( name,  netPrice,  taxRate);
		this.author = author;
		this.title = title;
		this.price = 2500;
		this.pages = 100;
			java.time.LocalDate currentDate = java.time.LocalDate.now();
			int year = currentDate.getYear();
		this.yearOfPublication=year;
		this.productName = "book";
		this.style = "guide";
	}

	public Book(String author, String title, String stytle,String name, int netPrice, int taxRate) {
		super( name,  netPrice,  taxRate);
		this.yearOfPublication = 0;
		this.author = author;
		this.title = title;
		this.style = style;
	}
	
	public Book(String author, String title, int price, int pages, String stytle,String name, int netPrice, int taxRate) {
		super( name,  netPrice,  taxRate);
		this.yearOfPublication = 0;
		this.author = author;
		this.title = title;
		if(price<0)
			this.price = 0;
		else
			this.price = price;
		if(pages<0)
			this.pages = 0;
		else
			this.pages = pages;
		this.style = style;
	}
/*	public void increasePrice(int percentage) {
		if (percentage > 0) {
			price += Math.round(price * (float) percentage / 100);
		}
	}*/
	
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	@Override
	public String toString() { 
		return "szerzõ: "+ author + ", cím: " + title + ", kiadás éve: " + yearOfPublication + ", Price: " + price + " Ft" + ", Pages: " + pages + ", ProductName: "+ productName +", Style: "+ style;
	}

/*	public String displayInfo() {
		return author + ": " + title + ", " + yearOfPublication + ". Price: " + price + " Ft";
	}
*/
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYearOfPublication() {
		return yearOfPublication;
	}

/*	public void setYearOfPublication(int yearOfPublication) {

		if (yearOfPublication >= 1950 && yearOfPublication <= 2021)
			this.yearOfPublication = yearOfPublication;
		else
			this.yearOfPublication = 2021;
	}
*/
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if (price >= 1000)
			this.price = price;
		else
			this.price = 1000;
	}

	public int getPages() {
		return pages;
	}


	public void setPages(int pages) {
		if(pages>0)
			this.pages = pages;
		else
			System.out.println("Hibás input!");
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public static int comparePublicationDate(Book bookA, Book bookB) {
		if (bookA.getYearOfPublication() > bookB.getYearOfPublication()) {
			return 1;
		} if (bookB.getYearOfPublication() > bookA.getYearOfPublication()) {
			return 2;
		} else
			return 0;
	}
	
	public static Book getLonger(Book bookA, Book bookB) {
		if ( bookA.getPages()> bookB.getPages()) {
			return bookA;
		} if (bookA.getPages()< bookB.getPages()) {
			return bookB;
		} else
			return bookA;
	}
	
	public boolean hasEvenPages() {
		boolean even=false;
		if(getPages()%2==0)
			even=true;
		return even;
	}
	
	public static void listBookArray(Book[] arrayBook) {
		for (int i = 0; i < arrayBook.length; i++) {
			System.out.println(arrayBook[i].toString());
		}
		
	}
	
	public static Book getLongestBook(Book[] arrayBook) {
		int page=0, index=0;
		for (int i = 0; i < arrayBook.length; i++) {
			if(arrayBook[i].getPages()>page) {
				page=arrayBook[i].getPages();
				index=i;
			}
		}
		return arrayBook[index];
	}

	public static Book getLongestEvenPagesBook(Book[] arrayBook) {
		int page=-1, index=0;
		for (int i = 0; i < arrayBook.length; i++) {
			if(arrayBook[i].hasEvenPages()==true) {	
				if(arrayBook[i].getPages()>page && arrayBook[i].getPages()%2==0) {
					index=i;
					page=arrayBook[i].getPages();
				}
			}
		}
		if(page >= 0)
			return arrayBook[index];
		else
			return null;
	}
	
	public static void authorStatistics(Book[] arrayBook) {
		int authorPiece=0;
		for (int i = 0; i < arrayBook.length; i++) {
			System.out.print(arrayBook[i].getAuthor());
			for (int j = 0; j < arrayBook.length; j++) {
				if(arrayBook[i].getAuthor().equals(arrayBook[j].getAuthor())){
					authorPiece++;
				}
			}
			System.out.println(" "+authorPiece+"db");
			authorPiece=0;
		}
	}

	@Override
	public int getVarPrice() {
		return (getNetPrice() * getTaxRate()) / 100;
	}
	public int getGrossPricePage() {
		return (((getNetPrice()*getTaxRate()/100)+getNetPrice())/getPages());
	}
	
}
