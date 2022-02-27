import java.util.Random;
import java.util.Scanner;

public class lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lottoTomb= new int[7];
		//lottoTipus();
		sorsolas(lottoTipus(), lottoTomb);
	}
	static int lottoTipus() {
		int lotto_tipus=0; 
		boolean ok=false;
		Scanner sc= new Scanner(System.in);
		do {
			System.out.print("Kerem adjon meg egy lotto tipust(5,6,7): ");
			try {
				lotto_tipus= sc.nextInt();
				if (lotto_tipus>=5 && lotto_tipus<=7) {
					ok=true;
				} else {
					ok=false;
					System.out.println("Hibás input!");
				}
			} catch (Exception e) {
				ok=false;
				System.out.println("Hibás input!Számot adjon meg(5,6,7)!");
				sc.nextLine();
			}
		} while (!ok);
		return lotto_tipus;
	}
	static void sorsolas(int lotto_tipus_,int[] lottoTomb_) {
		int min=1, max=0,lottoszam=0;
		switch (lotto_tipus_) {
		case 5:max=90;
			
			break;
		case 6:max=45;
			
			break;
		case 7:max=35;
	
			break;
		}
		for (int i = 0; i < lotto_tipus_; i++) {
			Random rand= new Random();
			lottoszam= rand.nextInt((max-min)+1)+min;
			lottoTomb_[i]=lottoszam;
			for (int j = 0; j < i; j++) {
				if (lottoTomb_[j]==lottoszam) {
					i--;
				} 
			}
		}
		rendez(lotto_tipus_, lottoTomb_);
		kilistaz(lotto_tipus_, lottoTomb_);
	}
	static void kilistaz(int lotto_tipus_,int[] lottoTomb_) {
		for (int i = 0; i < lotto_tipus_; i++) {
			System.out.println((i+1)+". "+lottoTomb_[i]);
		}
	}
	static void rendez(int lotto_tipus_,int[] lottoTomb_) {
		int csere=0;
		for (int i = 0; i < lotto_tipus_; i++) {
			for (int j = 0; j < lotto_tipus_; j++) {
				if (lottoTomb_[i]<lottoTomb_[j]) {
					csere=lottoTomb_[i];
					lottoTomb_[i]=lottoTomb_[j];
					lottoTomb_[j]=csere;
				}
			}
		}
	}
}
