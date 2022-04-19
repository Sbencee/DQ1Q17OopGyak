package szgep.teszt;

import szgep.Merevlemez;

public class Taroloteszt extends Merevlemez {

	public Taroloteszt(String tipus, double kapacitas, double foglaltTerulet) {
		super(tipus, kapacitas, foglaltTerulet);
		
	}

	public static void main(String[] args) {
		int a=300,b=20;
		Taroloteszt[] merevlemeztomb= new Taroloteszt[5];
		for (int i = 0; i < merevlemeztomb.length; i++) {
			merevlemeztomb[i]=new Taroloteszt("A"+i, a+i, b+i);
		}
		System.out.println("Legnagyobb kapacitas: "+legnagyobb(merevlemeztomb).toString());
		System.out.println( szabadNagyobb(merevlemeztomb)+" db HDD szabad terulete nagyobb.");
		kiir(merevlemeztomb);
	}
	
	public static Taroloteszt legnagyobb(Taroloteszt[] merevlemeztomb) {
		double nagyobb=0 ;
		int j=0;
		for (int i = 0; i < merevlemeztomb.length; i++) {
			if (merevlemeztomb[i].getKapacitas()>nagyobb) {
				nagyobb=merevlemeztomb[i].getKapacitas();
				j=i;
			}
		}
		return merevlemeztomb[j];
	}
	public static int szabadNagyobb(Taroloteszt[] merevlemeztomb) {
		int db=0;
		for (int i = 0; i < merevlemeztomb.length; i++) {
			if (merevlemeztomb[i].szabadterulet()>merevlemeztomb[i].getFoglaltTerulet()) {
				db++;
			}
		}
		return db;
	}
	public static void kiir(Taroloteszt[] merevlemeztomb) {
		for (int i = 0; i < merevlemeztomb.length; i++) {
			System.out.println(merevlemeztomb[i].toString());
		}
	}
}
