package Gyakorlat4c;

import java.util.Scanner;

public class gyak4_c {

	
	public static void main(String[] args) {
		int adoMertek=16;
		alkalmazott dolgozo= new alkalmazott();//p�ld�ny l�trehoz�sa. Az alkalmazott osztaly kulon allomanyban van.
		dolgozo.setNev("Nagy Tam�s");
		dolgozo.setFiz(123500);
		System.out.println(dolgozo.getNev()+"\t "+dolgozo.getFiz());
		//dolgozo.fizVizsgalat(100000, 150000);
		System.out.println("A fizet�s megadott hat�rok k�z� esik?: "+(dolgozo.fizVizsgalat(100000, 150000)? "igen":"nem"));
		System.out.println("A fizetend� "+adoMertek+"% ad� �rt�ke: "+dolgozo.ado(adoMertek));
		alkalmazott dolgozo2= new alkalmazott();//c.feladat
		dolgozo2.setNev("Horv�t Tam�s");
		dolgozo2.setFiz(456210);
		System.out.println(dolgozo2.getNev()+"\t "+dolgozo2.getFiz());
		System.out.println("Az elso dolgozo "+dolgozo.getNev()+" fizetese "+(dolgozo2.fizOsszehasonlit(dolgozo.getFiz(),dolgozo2.getFiz())? "nagyobb":"kisebb")+" mint a m�sodik dolgozo "+dolgozo2.getNev()+" fizetese.");
		
		//d.feladat
		alkalmazott alkalmazottTomb[] = new alkalmazott[5];
		for (int i = 0; i < alkalmazottTomb.length; i++) {
			alkalmazottTomb[i] = new alkalmazott();
			alkalmazottTomb[i].setNev(nevBeker(i));
			alkalmazottTomb[i].setFiz(fizBeker(i));
		}
		kiir(alkalmazottTomb);
		System.out.println("A legmagasabb a fizet�se "+alkalmazottTomb[maxFiz(alkalmazottTomb)].getNev()+" dolgoz�nak van.");
		System.out.println(fizDbIntervallum(alkalmazottTomb, 10000, 50000)+"db alkalmazott fizet�se esett a megadott intervallumba.");
		System.out.println("Az alkalmazottak �tlagfizet�se: "+atlagFiz(alkalmazottTomb));
		System.out.println("Az alkalmazottak �ltal befizetett ad� �ssz�rt�k�t: "+osszAdo(alkalmazottTomb, adoMertek));
	}
	
	static String nevBeker(int i_) {
		String bekerNev="";
		Scanner sc = new Scanner(System.in);
		System.out.print("\nK�rem a(z) "+(i_+1)+". dolgoz� nev�t: ");
		bekerNev= sc.nextLine();
		return bekerNev;
	}
	static int fizBeker(int i_) {
	boolean ok=false;
    int fizetes = 0;
    Scanner sc = new Scanner(System.in);
    do{
    	try {
    		System.out.print("\nK�rem a(z) "+(i_+1)+". munkav�llal� fizet�s�nek az �sszeg�t: ");
    		fizetes = sc.nextInt();
    		if (fizetes>0){
    			ok = true;
    		}
    		else {
    			ok=false;
    			System.out.println("\nHib�s adat!");
		   }
    		} catch (Exception e) {
	   		System.out.println("\nHib�s input! Sz�mot adjon meg!");
	   		sc.nextLine();//
	   	}
    	}while(!ok);
   return fizetes;
	}
	static void kiir(alkalmazott[] alkalmazottTomb_) {
		for (int i = 0; i < alkalmazottTomb_.length; i++) {
			System.out.println(alkalmazottTomb_[i].getNev()+"\t "+alkalmazottTomb_[i].getFiz());
		}
	}
	static int maxFiz(alkalmazott[] alkalmazottTomb_) {
		int max=0,i_=0;
		for (int i = 0; i < alkalmazottTomb_.length; i++) {
			if (alkalmazottTomb_[i].getFiz()>max) {
				max=alkalmazottTomb_[i].getFiz();
				i_=i;
			}
		}
		return i_;
	}
	static int fizDbIntervallum(alkalmazott[] alkalmazottTomb_,int alsoFiz,int felsoFiz) {
		int db=0;
		for (int i = 0; i < alkalmazottTomb_.length; i++) {
			if (alkalmazottTomb_[i].getFiz()>=alsoFiz && alkalmazottTomb_[i].getFiz()<=felsoFiz) {
				db++;
			}
		}
		return db;
	}
	static double atlagFiz(alkalmazott[] alkalmazottTomb_) {
		double fizAtlag=0.0;
		int i_=0;
		for (int i = 0; i < alkalmazottTomb_.length; i++) {
		fizAtlag+=alkalmazottTomb_[i].getFiz();
		i_++;
		}
		fizAtlag/=i_;
		return fizAtlag;
	}
	static double osszAdo(alkalmazott[] alkalmazottTomb_,int adoMertek_) {
		double adoOssz=0.0;
		for (int i = 0; i < alkalmazottTomb_.length; i++) {
			adoOssz+=alkalmazottTomb_[i].ado(adoMertek_);
		}	
		return adoOssz;
	}
}
