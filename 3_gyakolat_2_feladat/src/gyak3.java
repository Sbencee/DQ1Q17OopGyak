import java.util.Iterator;
import java.util.Random;
import java.lang.Math;
public class gyak3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tomb=new int[10];
		veletlen(tomb);
		tombelemKiiras(tomb);
		System.out.println("A legynagyobb szám for ciklussal: "+legParoszamfor(tomb));
		System.out.println("A legynagyobb szám foreach ciklussal: "+legParoszamforeach(tomb));
		System.out.println((int)negyzetszam(tomb)+" db négyzetszám van a tömbelemek között.");
		System.out.println("A tömbelemek mértani átlaga: "+mertaniatlag(tomb));
	
	}
	static void veletlen(int[] tomb_) {
		//Random rand= new Random();
		
		for (int i = 0; i < tomb_.length; i++) {
			int rand = (int)(Math.random()*50)+1;
			tomb_[i]=rand;
			//System.out.println((i+1)+". "+tomb_[i]);
		}
	}
	static void tombelemKiiras(int[] tomb_) {
		int db=1;
		for (int i : tomb_) {
			System.out.println(db+". "+i);
			db++;
		}
	}
	static int legParoszamfor(int[] tomb_) {
		int max=-100;
		for (int i = 0; i < tomb_.length; i++) {
			if (tomb_[i]%2==0) {
				if (tomb_[i]>max) {
					max=tomb_[i];
				} 
			}
		}
		return max;
	}
	static int legParoszamforeach(int[] tomb_) {
		int max=-100;
		for (int i : tomb_) {
			if (i%2==0) {
				if (i>max) {
					max=i;
				}
			}
		}
		return max;
	}
	static double negyzetszam(int[] tomb_) {
		double negyzet=0.0;
		int db=0;
		for (int i = 0; i < tomb_.length; i++) {
		negyzet=Math.sqrt((double)tomb_[i]);
		if (negyzet*negyzet==tomb_[i]) {
			db++;
			//System.out.print(negyzet*negyzet+" ");
			//System.out.println(negyzet);
			}
		}
		return db;
	}
	static double mertaniatlag(int[] tomb_) {
		int osszeg=0;
		for (int i = 0; i < tomb_.length; i++) {
			osszeg+=tomb_[i];
		}
		//System.out.println(osszeg);
		return (double)Math.pow(osszeg, tomb_.length);
	}
}
