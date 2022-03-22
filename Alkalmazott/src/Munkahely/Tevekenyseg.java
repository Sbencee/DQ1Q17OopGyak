package Munkahely;
import java.util.Scanner;

public class Tevekenyseg {

	public static void main(String[] args) {
		Alkalmazott munkasA = new Alkalmazott("Bj�rn Borg", 50, 310000);
		Alkalmazott munkasB = new Alkalmazott("N�v�nyi Norbert", 55, 250000);
		Alkalmazott [] tombmunkas=new Alkalmazott[alkalmazottDb()];
		Alkalmazott.nyugdijkorhatar=65;
		tombAlkalmazottFeltolt(tombmunkas);
		employeeDisplay(tombmunkas);
		System.out.println("Az �j nyugd�jkorhat�r : "+(Alkalmazott.nyugdijkorhatar=72)+"�v");
		employeeDisplay(tombmunkas);
		closeToRetirement(tombmunkas);
		atlagNyugdijEvnelTobb(tombmunkas);
		sortEmployeeArrayInc(tombmunkas);//Az alkalmazottak t�mbj�nek a nyugd�jig h�tral�v� �vek alapj�n n�vekv� rendez�se
		System.out.println("Az alkalmazottak t�mbj�nek a nyugd�jig h�tral�v� �vek alapj�n n�vekv� rendez�se");
		employeeDisplay(tombmunkas);//Az alkalmazottak t�mbj�nek kiirat�sa
		sortEmployeeArrayIDec(tombmunkas);//Az alkalmazottak t�mbj�nek a nyugd�jig h�tral�v� �vek alapj�n cs�kken� rendez�se
		System.out.println("Az alkalmazottak t�mbj�nek a nyugd�jig h�tral�v� �vek alapj�n cs�kken� rendez�se");
		employeeDisplay(tombmunkas);//Az alkalmazottak t�mbj�nek kiirat�sa
	}
	static int alkalmazottDb(){
	    int hossz=0;
	    boolean ok=false;
	    Scanner input=new Scanner(System.in);
	    do{
	        System.out.print("K�rem az alkalmazottak sz�m�t : ");
	        try{
	            hossz=input.nextInt();
	            if(hossz>0)
	                ok=true;
	            else{
	                ok=false;
	                System.out.println("Hib�s input! Null�n�l nagyobb sz�mot k�rek.");
	            }
	        }
	        catch(Exception e){
	            System.out.println("Hib�s input! Sz�mot k�rek.");
	            ok=false;
	            input.nextLine();
	        }
	    }while(!ok);
	    input.nextLine();
	    return hossz;
	}
	static void tombAlkalmazottFeltolt(Alkalmazott [] tombmunkas) {
		for (int i = 0; i < tombmunkas.length; i++) {
			tombmunkas[i]=new Alkalmazott(nameIsRead(), agePayment("K�rem a dolgoz� �letkor�t : "), agePayment("K�rem a dolgoz� fizet�s�t : "));
			
		}
	}
	static String nameIsRead(){
        Scanner input=new Scanner(System.in);
        System.out.print("K�rem az alkalmazott nev�t:  ");
        String alkalmazottNev=input.nextLine();
        return alkalmazottNev;
    }
	static int agePayment(String s){
	    int hossz=0;
	    boolean ok=false;
	    Scanner input=new Scanner(System.in);
	    do{
	        System.out.print(s);
	        try{
	            hossz=input.nextInt();
	            if(hossz>0)
	                ok=true;
	            else{
	                ok=false;
	                System.out.println("Hib�s input! Null�n�l nagyobb sz�mot k�rek.");
	            }
	        }
	        catch(Exception e){
	            System.out.println("Hib�s input! Sz�mot k�rek.");
	            ok=false;
	            input.nextLine();
	        }
	    }while(!ok);
	    input.nextLine();
	    return hossz;
	}
	static void employeeDisplay(Alkalmazott [] tombmunkas) {
		for (int i = 0; i < tombmunkas.length; i++) {
			System.out.println(tombmunkas[i].toString());
			
		}
	}
	static void closeToRetirement(Alkalmazott [] tombmunkas) { //5 �vn�l kevesebb van m�g h�tra nyugd�jig
		System.out.println("Alkalmazottak adatait, akiknek 5 �vn�l kevesebb van m�g h�tra nyugd�jig: ");
		for (int i = 0; i < tombmunkas.length; i++) {
			if(tombmunkas[i].nyugdij()<5)
				System.out.print(tombmunkas[i].toString());
		}
		System.out.println();
	}
	static int atlagNyugdijEv(Alkalmazott [] tombmunkas) { //a t�mb �tlag nyugd�j�ve
		int atlagEv=0;
		for (int i = 0; i < tombmunkas.length; i++) {
			atlagEv += tombmunkas[i].nyugdij();
		}
		return atlagEv/tombmunkas.length;
	}
	static void atlagNyugdijEvnelTobb(Alkalmazott [] tombmunkas) { //az �tlagn�l t�bb �ve van m�g h�tra a nyugd�jig
		int atlagNyEv=0;
		atlagNyEv=atlagNyugdijEv(tombmunkas);
		for (int i = 0; i < tombmunkas.length; i++) {
			if(tombmunkas[i].nyugdij()>atlagNyEv) {
				tombmunkas[i].toString();
			}
		}			
	}
	private static void sortEmployeeArrayInc(Alkalmazott [] tombmunkas) {
		for(int i=0; i<tombmunkas.length; i++) {
		int minIndex = i;
			for(int j=i+1; j<tombmunkas.length; j++) {
				if (tombmunkas[j].nyugdij() < tombmunkas[minIndex].nyugdij()) {
					minIndex = j;
				}
			} //Helycsere, ha sz�ks�ges
			if (minIndex != i) {
				Alkalmazott tmp = tombmunkas[i];
				tombmunkas[i] = tombmunkas[minIndex];
				tombmunkas[minIndex] = tmp;
			}
		}
	}
	private static void sortEmployeeArrayIDec(Alkalmazott [] tombmunkas) {
		for(int i=0; i<tombmunkas.length; i++) {
		int minIndex = i;
			for(int j=i+1; j<tombmunkas.length; j++) {
				if (tombmunkas[j].nyugdij() >
						tombmunkas[minIndex].nyugdij()) {
					minIndex = j;
				}
			} //Helycsere, ha sz�ks�ges
			if (minIndex != i) {
				Alkalmazott tmp = tombmunkas[i];
				tombmunkas[i] = tombmunkas[minIndex];
				tombmunkas[minIndex] = tmp;
			}
		}
	}

}
