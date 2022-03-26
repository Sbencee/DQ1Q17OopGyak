package myPackage.second;

import myPackage.first.Szam;

public class Szamok {

	public static void main(String[] args) {
	
		final double veletlen=veletlenGenerator();
		System.out.println("A szam:"+veletlen);
		Szam szamTar=new Szam();
		System.out.println("A "+ciklus(veletlen, szamTar)+". gener�lt sz�m egyezik meg a legel�sz�r l�trehozott "+veletlen+" Sz�mmal");
	}
	
	static double veletlenGenerator() {
		return Math.random();
	}
	static int ciklus(double veletlen_,Szam szamTar_) {
		boolean ok=false;
		int db=0;
		do {
			double genaralt=0.0;
			db++;
			genaralt=veletlenGenerator();
			if (genaralt<=veletlen_+szamTar_.getTures() && genaralt>=veletlen_-szamTar_.getTures()) {
			//ciklusban letrehozott veletlenszam osszehasonlitasa a Szammal + turessel mindk�t ir�nyba	
				System.out.println(db+". "+genaralt+" "+veletlen_);
				ok=true;
			}
			else {
				System.out.println(db+". "+genaralt+" "+veletlen_);
			}
		} while (!ok);
		return db;
	}
	
}
