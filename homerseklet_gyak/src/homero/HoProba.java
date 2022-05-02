package homero;

import homero.Homerseklet.homermertekegyseg;

public class HoProba {

	public static void main(String[] args) {
		int also=0,felso=100;
		Homerseklet[] homertomb=new Homerseklet[4];
		homertomb[0]= new Homerseklet(homermertekegyseg.CELSIUS, 15);
		homertomb[1]= new Homerseklet(homermertekegyseg.KELVIN, 300);
		homertomb[2]= new Homerseklet(homermertekegyseg.CELSIUS, Math.random()*(felso-also+1)+also);
		homertomb[3]= new Homerseklet(homermertekegyseg.CELSIUS, Math.random()*(felso-also+1)+also);
		
		Kiir(homertomb);
		System.out.println();
		System.out.println("Konverzió:");
		KonverzioCtoK(homertomb);
		KonverzioKtoC(homertomb);
		System.out.println();
		System.out.println("Számítás:");
		System.out.println("Az átlaghõmérséklet: "+atlagHomer(homertomb)+" "+homermertekegyseg.KELVIN);
	}
	public static void Kiir(Homerseklet[] homertomb) {
		for (Homerseklet homerseklet : homertomb) {
			System.out.println(homerseklet.toString());
		}
	}
	public static void KonverzioCtoK(Homerseklet[] homertomb) {
		boolean ok=false;
		Homerseklet konverz= new Homerseklet();
		for (int i = 0; i < homertomb.length; i++) {
			if (homertomb[i].getMertekegyseg()==homermertekegyseg.CELSIUS && !ok) {
				ok=true;
				System.out.println(homertomb[i].getHomerseklet()+" "+homertomb[i].getMertekegyseg()+" : "+konverz.konvHomerseklet(homertomb[i].getHomerseklet(),homertomb[i].getMertekegyseg()).getHomerseklet()+" "+konverz.konvHomerseklet(homertomb[i].getHomerseklet(),homertomb[i].getMertekegyseg()).getMertekegyseg());
			}
		}
	}
	public static void KonverzioKtoC(Homerseklet[] homertomb) {
		int szamol=0;
		Homerseklet konverz= new Homerseklet();
		for (int i = 0; i < homertomb.length; i++) {
			if (homertomb[i].getMertekegyseg()==homermertekegyseg.KELVIN) {
				szamol++;
				if (szamol==1) {
					System.out.println(homertomb[i].getHomerseklet()+" "+homertomb[i].getMertekegyseg()+" : "+konverz.konvHomerseklet(homertomb[i].getHomerseklet(),homertomb[i].getMertekegyseg()).getHomerseklet()+" "+konverz.konvHomerseklet(homertomb[i].getHomerseklet(),homertomb[i].getMertekegyseg()).getMertekegyseg());
				}
			}
		}
	}
	
	public static double atlagHomer(Homerseklet[] homertomb) {
		double avg=0;
		Homerseklet k= new Homerseklet();
		for (int i = 0; i < homertomb.length; i++) {
			if (homertomb[i].getMertekegyseg()==homermertekegyseg.CELSIUS) {
				avg+=k.konvHomerseklet(homertomb[i].getHomerseklet(),homertomb[i].getMertekegyseg()).getHomerseklet();
			}
			else {
				avg+=homertomb[i].getHomerseklet();
			}
		}
		return avg/homertomb.length;
	}
}
