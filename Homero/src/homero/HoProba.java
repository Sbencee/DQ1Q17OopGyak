package homero;

import homero.Homerseklet.mertekegyseg;

public class HoProba {

	public static void main(String[] args) {
		int felso=100,also=0;
		Homerseklet[] tombhomerseklet= new Homerseklet[4];
		tombhomerseklet[0]=new Homerseklet( 15,mertekegyseg.CELSIUS);
		tombhomerseklet[1]=new Homerseklet( 300,mertekegyseg.KELVIN);
		tombhomerseklet[2]=new Homerseklet( Math.random()*((felso-also)+1)+also,mertekegyseg.CELSIUS);
		tombhomerseklet[3]=new Homerseklet(Math.random()*((felso-also)+1)+also, mertekegyseg.CELSIUS);;
		System.out.println("A tömb elemeinek listázása:");
		kiir(tombhomerseklet);
		System.out.println();
		System.out.println("Konverzió:");
		Homerseklet konvertal=new Homerseklet();
		konvertal=konvertal.konvHomerseklet(tombhomerseklet[0].getTarolmertegyseg(), tombhomerseklet[0].getHomerseklet());
		System.out.println("\t"+tombhomerseklet[0].getHomerseklet()+" "+tombhomerseklet[0].getTarolmertegyseg()+" : "+konvertal.getHomerseklet()+" "+konvertal.getTarolmertegyseg());
		konvertal=konvertal.konvHomerseklet(tombhomerseklet[1].getTarolmertegyseg(), tombhomerseklet[1].getHomerseklet());
		System.out.println("\t"+tombhomerseklet[1].getHomerseklet()+" "+tombhomerseklet[1].getTarolmertegyseg()+" : "+konvertal.getHomerseklet()+" "+konvertal.getTarolmertegyseg());
		System.out.println();
		System.out.println("Számítás:");
		System.out.println("\tAz átlaghõmérséklet: "+atlaghomerseklet(tombhomerseklet)+" "+mertekegyseg.KELVIN);
		
	}
	public static void kiir(Homerseklet[] tombhomerseklet) {
		for (Homerseklet homerseklet : tombhomerseklet) {
			System.out.println("\t"+homerseklet.toString());
		}
	}
	public static double atlaghomerseklet(Homerseklet[] tombhomerseklet) {
		Homerseklet atlaghomer= new Homerseklet();
		double atlag=0.0;
		for (int i = 0; i < tombhomerseklet.length; i++) {
			if (tombhomerseklet[i].getTarolmertegyseg()==mertekegyseg.CELSIUS) {
			atlag=atlaghomer.konvHomerseklet(tombhomerseklet[i].getTarolmertegyseg(), tombhomerseklet[i].getHomerseklet()).getHomerseklet();
			// konvHomerseklet fuggveny visszater homerseklet tipussal amibol getHomersekletel metodussal kapjuk vissza Homersekletet  
			}
		}
		return atlag;
	}
}
