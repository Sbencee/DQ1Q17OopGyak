package mypersons.Person.test;
import java.util.Scanner;

import mypersons.Employee.Alkalmazott;
import mypersons.Person.Felnot;
import mypersons.Person.Gyermek;
import mypersons.Person.Szemely;

public class Run {

	public static void main(String[] args) {
		Szemely[] szemelyek= new Szemely[tombElemszam()];
		for (int i = 0; i < szemelyek.length; i++) {
			szemelyek[i]=szemelyBeolvas();
			if (szemelyek[i] instanceof Gyermek) {
				System.out.println(szemelyek[i].toString());
			}
			else if (szemelyek[i] instanceof Felnot) {
				System.out.println(szemelyek[i].toString());
			}
			else if(szemelyek[i] instanceof Alkalmazott) {
				System.out.println(szemelyek[i].toString());
			}
		}
		novekvoRendez(szemelyek);
	}
	public static Szemely szemelyBeolvas() {
		boolean ok=false;
	    int eletkor = 0;
	    String nev="";
	    Scanner sc = new Scanner(System.in);
	    System.out.print("\nKérem adjon meg egy nevet:");
		nev = sc.nextLine();
		do{
	    	try {
	    		System.out.print("\nKérem adjon meg egy életkort: ");
	    		eletkor = sc.nextInt();
	    		if (eletkor>0){
	    			ok = true;
	    		}
	    		else {
	    			ok=false;
	    			System.out.println("\nHibás adat!");
			   }
	    		} catch (Exception e) {
		   		System.out.println("\nHibás input! Számot adjon meg!");
		   		sc.nextLine();//
		   	}
	    	}while(!ok);
	   sc.nextLine();
	   Szemely sz;
	   if (eletkor<18) {
		  System.out.println("Iskola: ");
		  String iskola = sc.nextLine();
		  sz= new Gyermek(nev, eletkor, iskola);		
	}
	   else {
		   System.out.println("Munkahely: ");
		   String munkahely= sc.nextLine();
		   if(munkahely.isEmpty()) {
			   sz= new Felnot(nev, eletkor, munkahely);
		   }
		   else {
			  System.out.println("Fizetes: ");
			  int fizetes= sc.nextInt();
			  sz= new Alkalmazott(nev, eletkor, munkahely, fizetes);
		   }
	   }
	  return sz;
	}
	static int tombElemszam() {
		boolean ok=false;
		 int ertek = 0;
		 Scanner sc = new Scanner(System.in);
			do{
		    	try {
		    		System.out.print("\nKérem adja meg a tömb méretét: ");
		    		ertek = sc.nextInt();
		    		if (ertek>0){
		    			ok = true;
		    		}
		    		else {
		    			ok=false;
		    			System.out.println("\nHibás adat!");
				   }
		    		} catch (Exception e) {
			   		System.out.println("\nHibás input! Számot adjon meg!");
			   		sc.nextLine();//
			   	}
		    	}while(!ok);
			return ertek;
	}
	static void novekvoRendez(Szemely[] szemelyek_) {
		Szemely csere;
		for (int i = 0; i < szemelyek_.length; i++) {
			for (int j = i; j < szemelyek_.length; j++) {
				if (szemelyek_[j].getKor()<szemelyek_[i].getKor()) {
					csere=szemelyek_[j];
					szemelyek_[j]=szemelyek_[i];
					szemelyek_[i]=csere;
				}
			}
		}
		for (int i = 0; i < szemelyek_.length; i++) {
			System.out.println(szemelyek_[i].toString());
		}
	}
}
