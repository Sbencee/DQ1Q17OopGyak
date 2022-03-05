package Gyakorlat4c;

import java.util.Scanner;

public class gyak4_c {

	
	public static void main(String[] args) {
		int adoMertek=16;
		alkalmazott dolgozo= new alkalmazott();//példány létrehozása. Az alkalmazott osztaly kulon allomanyban van.
		dolgozo.setNev("Nagy Tamás");
		dolgozo.setFiz(123500);
		System.out.println(dolgozo.getNev()+"\t "+dolgozo.getFiz());
		//dolgozo.fizVizsgalat(100000, 150000);
		System.out.println("A fizetés megadott határok közé esik?: "+(dolgozo.fizVizsgalat(100000, 150000)? "igen":"nem"));
		System.out.println("A fizetendõ "+adoMertek+"% adó értéke: "+dolgozo.ado(adoMertek));
		alkalmazott dolgozo2= new alkalmazott();//c.feladat
		dolgozo2.setNev("Horvát Tamás");
		dolgozo2.setFiz(456210);
		System.out.println(dolgozo2.getNev()+"\t "+dolgozo2.getFiz());
		System.out.println("Az elso dolgozo "+dolgozo.getNev()+" fizetese "+(dolgozo2.fizOsszehasonlit(dolgozo.getFiz(),dolgozo2.getFiz())? "nagyobb":"kisebb")+" mint a második dolgozo "+dolgozo2.getNev()+" fizetese.");
		
		//d.feladat
		alkalmazott alkalmazottTomb[] = new alkalmazott[5];
		for (int i = 0; i < alkalmazottTomb.length; i++) {
			alkalmazottTomb[i] = new alkalmazott();
			alkalmazottTomb[i].setNev(nevBeker(i));
			alkalmazottTomb[i].setFiz(fizBeker(i));
		}
		kiir(alkalmazottTomb);
		System.out.println("A legmagasabb a fizetése "+alkalmazottTomb[maxFiz(alkalmazottTomb)].getNev()+" dolgozónak van.");
		System.out.println(fizDbIntervallum(alkalmazottTomb, 10000, 50000)+"db alkalmazott fizetése esett a megadott intervallumba.");
		System.out.println("Az alkalmazottak átlagfizetése: "+atlagFiz(alkalmazottTomb));
		System.out.println("Az alkalmazottak által befizetett adó összértékét: "+osszAdo(alkalmazottTomb, adoMertek));
	}
	
	static String nevBeker(int i_) {
		String bekerNev="";
		Scanner sc = new Scanner(System.in);
		System.out.print("\nKérem a(z) "+(i_+1)+". dolgozó nevét: ");
		bekerNev= sc.nextLine();
		return bekerNev;
	}
	static int fizBeker(int i_) {
	boolean ok=false;
    int fizetes = 0;
    Scanner sc = new Scanner(System.in);
    do{
    	try {
    		System.out.print("\nKérem a(z) "+(i_+1)+". munkavállaló fizetésének az összegét: ");
    		fizetes = sc.nextInt();
    		if (fizetes>0){
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
