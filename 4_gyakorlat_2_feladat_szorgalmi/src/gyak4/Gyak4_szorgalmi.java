package gyak4;

import java.util.Scanner;

public class Gyak4_szorgalmi {

	public static void main(String[] args) {
		Szemely ember= new Szemely();
		ember.setNev(nevBeolvas());
		ember.setSuly(sulyBeolvas());
		ember.setMagassag(magassagBeolvas());
		System.out.println(ember.toString());
		
	}
	static String nevBeolvas() {
		String nevsulyTarol="";
		Scanner sc = new Scanner(System.in);
		System.out.print("Kerem adjon meg egy nevet: ");
		nevsulyTarol=sc.nextLine();
		return nevsulyTarol;
	}
	static int sulyBeolvas() {
		boolean ok=false;
	    int sulyTarol = 0;
	    Scanner sc = new Scanner(System.in);
	    do{
	    	try {
	    		System.out.print("\nKérem a személy súlyát: ");
	    		sulyTarol = sc.nextInt();
	    		if (sulyTarol>0){
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
	   return sulyTarol;
	}
	static double magassagBeolvas() {
		boolean ok=false;
	    double magassagTarol = 0;
	    Scanner sc = new Scanner(System.in);
	    do{
	    	try {
	    		System.out.print("\nKérem a személy magasságát (pl: 1,92 ): ");
	    		magassagTarol = sc.nextDouble();
	    		if (magassagTarol>0){
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
	   return magassagTarol;
	}
}
