import java.util.Scanner;

public class gyak3_1_String {
	
	public static void main(String[] args) {
		System.out.print(" = "+stringBeolvas());
	}
	static int stringBeolvas() {
		Scanner sc= new Scanner(System.in);
		System.out.print("Kerem adja meg az adatokat: ");
		String inString = sc.nextLine(); 
		String[] strArray = inString.split(" ");
		int operandus1 = Integer.parseInt(strArray[0]);
		char operator = strArray[1].charAt(0);
		int operandus2 = Integer.parseInt(strArray[2]);
		return calc(operandus1, operandus2, operator);
	}
	static int calc(int operandus1_, int operandus2_, char operator_) {
		int eredmeny=0;
		switch (operator_) {
		case '+':
			eredmeny=operandus1_+operandus2_;
			break;
		case '-':
			eredmeny=operandus1_-operandus2_;
			break;
		case '*':
			eredmeny=operandus1_*operandus2_;
			break;
		case '/':
			eredmeny=operandus1_/operandus2_;
			break;
		}
		return eredmeny;
	}
}
