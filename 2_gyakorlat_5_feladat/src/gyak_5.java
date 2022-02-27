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
			System.out.print("\nKerem adja meg az "+(dbsor+1)+". személy nevét: ");
			nev=sc.nextLine();
			do {
				try {
					System.out.print("\nKérem adja meg az email cimek számát(0-3): ");
					dbEmail=sc.nextInt();
					if (dbEmail>=0 && dbEmail<=3) {
						ok=true;
						sc.nextLine();// A nextInt() az Enter karaktert nem olvassa be (az input bufferben hagyja), 
									//ezért akövetkezõ olvasásielet elõtt ezt ki kell olvasni az input bufferbõl a 
									//nextLine() hívással
					} else {
						ok=false;
						System.out.println("\nHibás input! Értékhatár 0-3!");
					}
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("\nHibás input! Számot adjon meg!");
					sc.nextLine();//Angol szöveg
					ok=false;
				}
			} while (!ok);
			user_[dbsor]= new String[dbEmail];
			int dbOszlop=0;
			while(dbOszlop<dbEmail) {
				System.out.printf("Kérem a(z) "+(dbOszlop+1)+". email cimet: ");
				email=sc.nextLine();
				user_[dbsor][dbOszlop]=email;
				dbOszlop++;
			}
			dbsor++;
		} while (dbsor<row_);
		
	}
	static void toCount(String[][] user_) {//megszámol
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
		System.out.print("\n"+dbszamol+" embernek volt 1-nél több email cime.");
	}
}
