package mypersons.test.PersonTest;

import java.util.Scanner;

import mypersons.Person.Felnot;
import mypersons.Person.Gyermek;
import mypersons.Person.Szemely;

public class Emberek {

	public static void main(String[] args) {
		Szemely[] szemelyek= new Szemely[3];
		for (int i = 0; i < szemelyek.length; i++) {
			szemelyek[i]=szemelyBeolvas();
			//System.out.println(szemelyek[i]);
			if (szemelyek[i] instanceof Gyermek) {
				System.out.println(szemelyek[i].toString());
			}
			else	if (szemelyek[i] instanceof Felnot) {
				System.out.println(szemelyek[i].toString());
			}
		}
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
		   sz=new Felnot(nev, eletkor, munkahely);
	}
	  return sz;
	}
}
