package running;

import java.util.HashSet;
import java.util.Scanner;

import myproducts.*;

public class ProductTest {

	public static void main(String[] args) {
		// A)
		//Product p1 = new Product("toll", 3500, 27);
		Bread b1 = new Bread("rozskeny�r", 350, 10, 0.5);

		//System.out.println(p1);
		System.out.println(b1);
		//System.out.println(Product.comparePrice(p1, b1));
		
		// B)
		Product p2 = new Bread("magvas", 250, 10, 1);
		
		System.out.println(p2);
		System.out.println(Product.comparePrice(p2, b1));
		System.out.println(Bread.compareUnitPrice((Bread)p2, b1));
		
		//Book aruKonyv= new Book("Pet�fi", "Any�m", 120, 5, "K�nyv", "Gyerek", "fjklds", 1000, 27);
		//Book aru= new Book(stringBeker("K�rem a szerz� nev�t: "), stringBeker("K�rem a k�nvy cim�t: "),intBeker("K�rem a k�nyv �r�t: "), intBeker("K�rem az oldalsz�mott: "),stringBeker("K�rem a term�k nev�t: "), stringBeker("K�rem a k�nvy stilus�t: "), stringBeker("K�rem az �ru mev�t: "), intBeker("K�rem a keny�r �r�t: "), intBeker("K�rem az �FA �r�t: "));
			Book[] aru= new Book[intBeker("K�rem az �ruk mennyis�g�t: ")];
			tombFeltolt(aru);
			System.out.println();
			egysegarnovekvo(aru);
			System.out.println("Egys�g�r szerint n�vekv� sorrend: ");
			listaz(aru);
			System.out.println("Lapk�lts�g: ");
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
    			System.out.println("\nHib�s adat! Null�n�l nagyobbat!");
		   }
    		} catch (Exception e) {
	   		System.out.println("\nHib�s input! Sz�mot adjon meg!");
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
			aru[i]= new Book(stringBeker("K�rem a szerz� nev�t: "), stringBeker("K�rem a k�nvy cim�t: "),intBeker("K�rem a k�nyv �r�t: "), intBeker("K�rem az oldalsz�mott: "),stringBeker("K�rem a term�k nev�t: "), stringBeker("K�rem a k�nvy stilus�t: "), stringBeker("K�rem az �ru mev�t: "), intBeker("K�rem a keny�r �r�t: "), intBeker("K�rem az �FA �r�t: "));
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
