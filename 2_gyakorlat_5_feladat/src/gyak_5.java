import java.util.Scanner;
public class gyak_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=5;//sor
		String[][] user= new String[row][];//felhasznalo
		data_reading(user, row);
		toCount(user);
	}
	static void data_reading(String[][] user_,int row_) {//adatbeolvas
		boolean ok=false;
		int dbsor=0;
		String nev="";
		int dbEmail=0;
		String email="";
		Scanner sc= new Scanner(System.in);
		do {
			System.out.print("\nKerem adja meg az "+(dbsor+1)+". szem�ly nev�t: ");
			nev=sc.nextLine();
			do {
				try {
					System.out.print("\nK�rem adja meg az email cimek sz�m�t(0-3): ");
					dbEmail=sc.nextInt();
					if (dbEmail>=0 && dbEmail<=3) {
						ok=true;
						sc.nextLine();// A nextInt() az Enter karaktert nem olvassa be (az input bufferben hagyja), 
									//ez�rt ak�vetkez� olvas�sielet el�tt ezt ki kell olvasni az input bufferb�l a 
									//nextLine() h�v�ssal
					} else {
						ok=false;
						System.out.println("\nHib�s input! �rt�khat�r 0-3!");
					}
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("\nHib�s input! Sz�mot adjon meg!");
					sc.nextLine();//Angol sz�veg
					ok=false;
				}
			} while (!ok);
			user_[dbsor]= new String[dbEmail];
			int dbOszlop=0;
			while(dbOszlop<dbEmail) {
				System.out.printf("K�rem a(z) "+(dbOszlop+1)+". email cimet: ");
				email=sc.nextLine();
				user_[dbsor][dbOszlop]=email;
				dbOszlop++;
			}
			dbsor++;
		} while (dbsor<row_);
		
	}
	static void toCount(String[][] user_) {//megsz�mol
		int dbszamol=0;
		for (int i = 0; i < user_.length; i++) {
			System.out.print((i+1)+".\t");
			for (int j = 0; j < user_[i].length; j++) {
				System.out.print(user_[i][j]+", ");
			}
			System.out.println("");
			if (user_[i].length>1) {
				dbszamol++;
			}
		}
		System.out.print("\n"+dbszamol+" embernek volt 1-n�l t�bb email cime.");
	}
}
