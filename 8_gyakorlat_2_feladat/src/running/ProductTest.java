package running;

import java.util.HashSet;
import java.util.Scanner;

import myproducts.*;

public class ProductTest {

	public static void main(String[] args) {
		// A)
		//Product p1 = new Product("toll", 3500, 27);
		Bread b1 = new Bread("rozskenyér", 350, 10, 0.5);

		//System.out.println(p1);
		System.out.println(b1);
		//System.out.println(Product.comparePrice(p1, b1));
		
		// B)
		Product p2 = new Bread("magvas", 250, 10, 1);
		
		System.out.println(p2);
		System.out.println(Product.comparePrice(p2, b1));
		System.out.println(Bread.compareUnitPrice((Bread)p2, b1));
		
		//Book aruKonyv= new Book("Petõfi", "Anyám", 120, 5, "Könyv", "Gyerek", "fjklds", 1000, 27);
		//Book aru= new Book(stringBeker("Kérem a szerzõ nevét: "), stringBeker("Kérem a könvy cimét: "),intBeker("Kérem a könyv árát: "), intBeker("Kérem az oldalszámott: "),stringBeker("Kérem a termék nevét: "), stringBeker("Kérem a könvy stilusát: "), stringBeker("Kérem az áru mevét: "), intBeker("Kérem a kenyér árát: "), intBeker("Kérem az ÁFA árát: "));
			Book[] aru= new Book[intBeker("Kérem az áruk mennyiségét: ")];
			tombFeltolt(aru);
			System.out.println();
			egysegarnovekvo(aru);
			System.out.println("Egységár szerint növekvõ sorrend: ");
			listaz(aru);
			System.out.println("Lapköltség: ");
			konyvaraOldal(aru);
	}
	static String stringBeker(String s) {
		String bekerNev="";
		Scanner sc = new Scanner(System.in);
		System.out.print(s);
		bekerNev= sc.nextLine();
		return bekerNev;
	}
	static int intBeker(String s) {
	boolean ok=false;
    int fizetes = 0;
    Scanner sc = new Scanner(System.in);
    do{
    	try {
    		System.out.print(s);
    		fizetes = sc.nextInt();
    		if (fizetes>0){
    			ok = true;
    		}
    		else {
    			ok=false;
    			System.out.println("\nHibás adat! Nullánál nagyobbat!");
		   }
    		} catch (Exception e) {
	   		System.out.println("\nHibás input! Számot adjon meg!");
	   		sc.nextLine();//
	   	}
    	}while(!ok);
   sc.nextLine();
   return fizetes;
	}
	static void egysegarnovekvo(Book[] aru) {
		Book ment;
		for (int i = 0; i < aru.length; i++) {
			for (int j = i+1; j < aru.length; j++) {
				if (aru[i].getPrice()>aru[j].getPrice()) {
					ment=aru[i];
					aru[i]=aru[j];
					aru[j]=ment;
				}
			}
		}
	}
	static void listaz(Book[] aru) {
		for (int i = 0; i < aru.length; i++) {
			System.out.println(aru[i].toString());
		}
	}
	static void tombFeltolt(Book[] aru) {
		for (int i = 0; i < aru.length; i++) {
			aru[i]= new Book(stringBeker("Kérem a szerzõ nevét: "), stringBeker("Kérem a könvy cimét: "),intBeker("Kérem a könyv árát: "), intBeker("Kérem az oldalszámott: "),stringBeker("Kérem a termék nevét: "), stringBeker("Kérem a könvy stilusát: "), stringBeker("Kérem az áru mevét: "), intBeker("Kérem a kenyér árát: "), intBeker("Kérem az ÁFA árát: "));
		}
	}
	static void konyvaraOldal(Book[] aru) {
		int aroldal=0;
		HashSet<Book> aroldal20 = new HashSet<Book>();
		for (int i = 0; i < aru.length; i++) {
			aroldal=aru[i].getPrice()/aru[i].getPages();
			if (aroldal>20) {
				aroldal20.add(aru[i]);
				//System.out.println(aru[i].toString());
			}
		}
		System.out.println(aroldal20.toString());
	}
}
