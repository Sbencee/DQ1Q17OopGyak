package Gyako5_2;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		//int teglalap[]= new int[10];
		Teglalap[] teglalap= new Teglalap[10];
		Teglalap[] teglalap_= new Teglalap[1];
		String osszes="";
		feltolt(teglalap,osszes);
		System.out.println("A legkisebb ter�let� t�glalap adata hossz�s�g: "+teglalap[teruletSzamitas(teglalap)].getHosszusag()+" Sz�less�g: "+teglalap[teruletSzamitas(teglalap)].getSzelesseg());
		ujTeglalap(teglalap_);
		System.out.println("\n A beolvasott t�glalap ter�let�n�l nagyobb: "+nagyobb(teglalap_,teglalap)+" db tal�lhat�");
		index(teglalap_,teglalap);
	}
	static int veletlenFeltolt(int also_,int felso_) {
		return ((int)(Math.random()*(felso_-also_)))+also_;
	}
	static void feltolt(Teglalap[] teglalap_,String osszes_) {
		for (int i = 0; i < teglalap_.length; i++) {
			teglalap_[i]=new Teglalap(veletlenFeltolt(2,10),veletlenFeltolt(2, 10));
			//teglalap_[i].display(i);
			osszes_+=teglalap_[i].toString();
		}
		System.out.println(osszes_);
	}
	static int teruletSzamitas(Teglalap[] teglalap_) {
		int terulet=0;
		int legkisseb=0;
		int i_=0;
		for (int i = 0; i < teglalap_.length; i++) {
		terulet=teglalap_[i].getHosszusag()*teglalap_[i].getSzelesseg();
		if(i==0) {
			legkisseb=terulet;
			i_=i;
		}
		else if(legkisseb>terulet) {
			legkisseb=terulet;
			i_=i;
		}
		}
		return i_;
	}
	static int oldalBeker() {
		boolean ok=false;
	    int oldal = 0;
	    Scanner sc = new Scanner(System.in);
	    do{
	    	try {
	    		System.out.print("\nK�rem a t�glalap oldal�t: ");
	    		oldal = sc.nextInt();
	    		if (oldal>0){
	    			ok = true;
	    		}
	    		else {
	    			ok=false;
	    			System.out.println("\nHib�s adat!");
	    		}
	    	} catch (Exception e) {
		   		System.out.println("\nHib�s input! Sz�mot adjon meg!");
		   		sc.nextLine();
	    		}
	   }while(!ok);
	    sc.nextLine();
	   return oldal;
	}
	static void ujTeglalap(Teglalap[] teglalap_) {
		teglalap_[0]= new Teglalap(oldalBeker(),oldalBeker());	
	}
	static int nagyobb(Teglalap[] teglalap_,Teglalap[] teglalap) {
		int legnagyobb=0;
		int ujterulet_=0;
		int regiterulet=0;
		int db=0;
		ujterulet_= teglalap_[0].getHosszusag()*teglalap_[0].getSzelesseg();
		for (int i = 0; i < teglalap.length; i++) {
			regiterulet=teglalap[i].getHosszusag()*teglalap[i].getSzelesseg();
			if(regiterulet>ujterulet_) {
				db++;
			}
		}
		return db;
	}
	static void index(Teglalap[] teglalap_,Teglalap[] teglalap) {
		int egyezes=-1;
		for (int i = 0; i < teglalap.length; i++) {
			if (teglalap[i].getHosszusag()==teglalap_[0].getHosszusag() && teglalap[i].getSzelesseg()==teglalap_[0].getSzelesseg()) {
				egyezes=i;
				break;//i=9;
			}
		}
		if (egyezes==-1) {
			System.out.println("\n nincs egyez�");
		}
		else {
			System.out.println("Az els� olyan t�glalapnak az indexe, amelynek az oldalai megegyeznek: "+egyezes);
		}
	}

}
