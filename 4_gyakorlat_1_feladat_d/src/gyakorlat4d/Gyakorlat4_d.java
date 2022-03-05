package gyakorlat4d;

import java.util.Scanner;

public class Gyakorlat4_d {
/*package gyakorlat4d;

public class Gyakorlat4_d {*/

	
	public static void main(String[] args) {
		int adoMertek=16;
		Alkalmazott dolgozo= new Alkalmazott();//p�ld�ny l�trehoz�sa. Az Alkalmazott osztaly kulon allomanyban van.
		dolgozo.setNev("Nagy Tam�s");
		dolgozo.setFiz(123500);
		System.out.println(dolgozo.getNev()+"\t "+dolgozo.getFiz());
		//dolgozo.fizVizsgalat(100000, 150000);
		System.out.println("A fizet�s megadott hat�rok k�z� esik?: "+(dolgozo.fizVizsgalat(100000, 150000)? "igen":"nem"));
		System.out.println("A fizetend� "+adoMertek+"% ad� �rt�ke: "+dolgozo.ado(adoMertek));
		Alkalmazott dolgozo2= new Alkalmazott();//c.feladat
		dolgozo2.setNev("Horv�t Tam�s");
		dolgozo2.setFiz(456210);
		System.out.println(dolgozo2.getNev()+"\t "+dolgozo2.getFiz());
		System.out.println("Az elso dolgozo "+dolgozo.getNev()+" fizetese "+(dolgozo2.fizOsszehasonlit(dolgozo.getFiz(),dolgozo2.getFiz())? "nagyobb":"kisebb")+" mint a m�sodik dolgozo "+dolgozo2.getNev()+" fizetese.");
		
		//d.feladat
		Alkalmazott AlkalmazottTomb[] = new Alkalmazott[5];
		for (int i = 0; i < AlkalmazottTomb.length; i++) {
			AlkalmazottTomb[i] = new Alkalmazott();
			AlkalmazottTomb[i].setNev(nevBeker(i));
			AlkalmazottTomb[i].setFiz(fizBeker(i));
		}
		kiir(AlkalmazottTomb);
		System.out.println("A legmagasabb a fizet�se "+AlkalmazottTomb[maxFiz(AlkalmazottTomb)].getNev()+" dolgoz�nak van.");
		System.out.println(fizDbIntervallum(AlkalmazottTomb, 10000, 50000)+"db Alkalmazott fizet�se esett a megadott intervallumba.");
		System.out.println("Az Alkalmazottak �tlagfizet�se: "+atlagFiz(AlkalmazottTomb));
		System.out.println("Az Alkalmazottak �ltal befizetett ad� �ssz�rt�k�t: "+osszAdo(AlkalmazottTomb, adoMertek));
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
	static void kiir(Alkalmazott[] AlkalmazottTomb_) {
		for (int i = 0; i < AlkalmazottTomb_.length; i++) {
			System.out.println(AlkalmazottTomb_[i].getNev()+"\t "+AlkalmazottTomb_[i].getFiz());
		}
	}
	static int maxFiz(Alkalmazott[] AlkalmazottTomb_) {
		int max=0,i_=0;
		for (int i = 0; i < AlkalmazottTomb_.length; i++) {
			if (AlkalmazottTomb_[i].getFiz()>max) {
				max=AlkalmazottTomb_[i].getFiz();
				i_=i;
			}
		}
		return i_;
	}
	static int fizDbIntervallum(Alkalmazott[] AlkalmazottTomb_,int alsoFiz,int felsoFiz) {
		int db=0;
		for (int i = 0; i < AlkalmazottTomb_.length; i++) {
			if (AlkalmazottTomb_[i].getFiz()>=alsoFiz && AlkalmazottTomb_[i].getFiz()<=felsoFiz) {
				db++;
			}
		}
		return db;
	}
	static double atlagFiz(Alkalmazott[] AlkalmazottTomb_) {
		double fizAtlag=0.0;
		int i_=0;
		for (int i = 0; i < AlkalmazottTomb_.length; i++) {
		fizAtlag+=AlkalmazottTomb_[i].getFiz();
		i_++;
		}
		fizAtlag/=i_;
		return fizAtlag;
	}
	static double osszAdo(Alkalmazott[] AlkalmazottTomb_,int adoMertek_) {
		double adoOssz=0.0;
		for (int i = 0; i < AlkalmazottTomb_.length; i++) {
			adoOssz+=AlkalmazottTomb_[i].ado(adoMertek_);
		}	
		return adoOssz;
	}
}
