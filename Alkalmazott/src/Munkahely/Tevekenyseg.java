package Munkahely;
import java.util.Scanner;

public class Tevekenyseg {

	public static void main(String[] args) {
		Alkalmazott munkasA = new Alkalmazott("Björn Borg", 50, 310000);
		Alkalmazott munkasB = new Alkalmazott("Növényi Norbert", 55, 250000);
		Alkalmazott [] tombmunkas=new Alkalmazott[alkalmazottDb()];
		Alkalmazott.nyugdijkorhatar=65;
		tombAlkalmazottFeltolt(tombmunkas);
		employeeDisplay(tombmunkas);
		System.out.println("Az új nyugdíjkorhatár : "+(Alkalmazott.nyugdijkorhatar=72)+"év");
		employeeDisplay(tombmunkas);
		closeToRetirement(tombmunkas);
		atlagNyugdijEvnelTobb(tombmunkas);
		sortEmployeeArrayInc(tombmunkas);//Az alkalmazottak tömbjének a nyugdíjig hátralévõ évek alapján növekvõ rendezése
		System.out.println("Az alkalmazottak tömbjének a nyugdíjig hátralévõ évek alapján növekvõ rendezése");
		employeeDisplay(tombmunkas);//Az alkalmazottak tömbjének kiiratása
		sortEmployeeArrayIDec(tombmunkas);//Az alkalmazottak tömbjének a nyugdíjig hátralévõ évek alapján csökkenõ rendezése
		System.out.println("Az alkalmazottak tömbjének a nyugdíjig hátralévõ évek alapján csökkenõ rendezése");
		employeeDisplay(tombmunkas);//Az alkalmazottak tömbjének kiiratása
	}
	static int alkalmazottDb(){
	    int hossz=0;
	    boolean ok=false;
	    Scanner input=new Scanner(System.in);
	    do{
	        System.out.print("Kérem az alkalmazottak számát : ");
	        try{
	            hossz=input.nextInt();
	            if(hossz>0)
	                ok=true;
	            else{
	                ok=false;
	                System.out.println("Hibás input! Nullánál nagyobb számot kérek.");
	            }
	        }
	        catch(Exception e){
	            System.out.println("Hibás input! Számot kérek.");
	            ok=false;
	            input.nextLine();
	        }
	    }while(!ok);
	    input.nextLine();
	    return hossz;
	}
	static void tombAlkalmazottFeltolt(Alkalmazott [] tombmunkas) {
		for (int i = 0; i < tombmunkas.length; i++) {
			tombmunkas[i]=new Alkalmazott(nameIsRead(), agePayment("Kérem a dolgozó életkorát : "), agePayment("Kérem a dolgozó fizetését : "));
			
		}
	}
	static String nameIsRead(){
        Scanner input=new Scanner(System.in);
        System.out.print("Kérem az alkalmazott nevét:  ");
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
	                System.out.println("Hibás input! Nullánál nagyobb számot kérek.");
	            }
	        }
	        catch(Exception e){
	            System.out.println("Hibás input! Számot kérek.");
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
	static void closeToRetirement(Alkalmazott [] tombmunkas) { //5 évnél kevesebb van még hátra nyugdíjig
		System.out.println("Alkalmazottak adatait, akiknek 5 évnél kevesebb van még hátra nyugdíjig: ");
		for (int i = 0; i < tombmunkas.length; i++) {
			if(tombmunkas[i].nyugdij()<5)
				System.out.print(tombmunkas[i].toString());
		}
		System.out.println();
	}
	static int atlagNyugdijEv(Alkalmazott [] tombmunkas) { //a tömb átlag nyugdíjéve
		int atlagEv=0;
		for (int i = 0; i < tombmunkas.length; i++) {
			atlagEv += tombmunkas[i].nyugdij();
		}
		return atlagEv/tombmunkas.length;
	}
	static void atlagNyugdijEvnelTobb(Alkalmazott [] tombmunkas) { //az átlagnál több éve van még hátra a nyugdíjig
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
			} //Helycsere, ha szükséges
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
			} //Helycsere, ha szükséges
			if (minIndex != i) {
				Alkalmazott tmp = tombmunkas[i];
				tombmunkas[i] = tombmunkas[minIndex];
				tombmunkas[minIndex] = tmp;
			}
		}
	}

}
