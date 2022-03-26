package mypersons.Employee;

import mypersons.Person.Felnot;

public class Alkalmazott extends Felnot {
	
		private  int fizetes;
		private static int nyugdijkorhatar=65;
		
		public Alkalmazott(String nev,int kor,String munkahely,int fizetes) {
			super(nev,kor,munkahely);
			this.fizetes = fizetes;
		}
		
		public int getFizetes() {
			return fizetes;
		}
		public void setFizetes(int fizetes) {
			this.fizetes = fizetes;
		}
		public static int getNyugdijkorhatar() {
			return nyugdijkorhatar;
		}
		public static void setNyugdijkorhatar(int nyugdijkorhatar) {
			Alkalmazott.nyugdijkorhatar = nyugdijkorhatar;
		}

		@Override
		public String toString() {
			return "Alkalmazott [Fizetes:" + getFizetes() + ", Munkahely:"
					+ getMunkahely() + ", Nev:" + getNev() + ", Kor:" + getKor() + "]";
		}
		
		
}
