package bankartyaRun;

import java.time.LocalDate;
import java.util.Arrays;

import bankartya.CreditCard;
import bankartya.Card;
import bankartya.Card.kibocsajtobank;


public class CardTest {

	public static void main(String[] args) {
		int penzfelvetOsszegek[] = { 280000, 80000, 50000, 100000 };
		CreditCard[] cardtomb= new CreditCard[4];
		//String tulajdonosneve, LocalDate ervenyesseg, kibocsatoBank bankNev, int egyenleg
		cardtomb[0]= new CreditCard("Kiss Tam�s",LocalDate.of(2022, 5, 30), Card.kibocsajtobank.OTP, 150000, 100000);
		cardtomb[1]= new CreditCard("Nagy Levente",LocalDate.of(2022, 7, 31), Card.kibocsajtobank.ERSTE, 100000, 0);
		cardtomb[2]= new CreditCard("Szab� L�szl�",LocalDate.of(2019, 3, 31), Card.kibocsajtobank.OTP, 200000, 100000);
		cardtomb[3]= new CreditCard("Kov�cs Edit",LocalDate.of(2022, 8, 31), Card.kibocsajtobank.CIB, 250000 , 0);
		Kiir(cardtomb);
		penzfelvetmuvelet(cardtomb, penzfelvetOsszegek);
		System.out.println();
		System.out.println(szamolBank(cardtomb)+" db "+Card.kibocsajtobank.CIB+"-bankos k�rtya tal�lhat�");
		rendezdatum(cardtomb);
	}
	public static void Kiir(CreditCard[] cardtomb) {
		for (int i = 0; i < cardtomb.length; i++) {
			System.out.println(cardtomb[i].toString());
		}
	}
	public static void penzfelvetmuvelet(CreditCard[] cardtomb,int[] osszegfelvesz_) {
		boolean ok=false;
		for (int i = 0; i < cardtomb.length; i++) {
			ok= cardtomb[i].penzfelvet(osszegfelvesz_[i]);
			System.out.println((i+1)+". P�nzfelv�t: "+osszegfelvesz_[i]+" "+ok+" �j egyenleg: "+cardtomb[i].getEgyenleg()+" Hitelkeret: "+cardtomb[i].getHitelkeret());
		}
		
	}
	public static int szamolBank(CreditCard[] cardtomb) {
		int db=0;
		for (int i = 0; i < cardtomb.length; i++) {
			if (cardtomb[i].getBanknev()==kibocsajtobank.CIB) {
				db++;
			}
		}
		return db;
	}
	public static void rendezdatum(CreditCard[] cardtomb) {
		int rendez=0;
		LocalDate[] datum= new LocalDate[cardtomb.length];
		for (int i = 0; i < cardtomb.length; i++) {
			datum[i]= cardtomb[i].getErvenyesseg();
		}
		Arrays.sort(datum);
		System.out.println(Arrays.toString(datum));
	}
}
