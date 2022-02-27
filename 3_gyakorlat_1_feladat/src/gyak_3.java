import java.util.Scanner;

public class gyak_3 {

	public static void main(String[] args) {
		//szamBeolvas();
		//karakterBeolvas();
		 Kalkulator();
	}
	static int szamBeolvas(char c_) {
		int tarol=0;
		boolean ok=false;
		Scanner sc= new Scanner(System.in);
		do {
			System.out.print("Kerem adja meg egy számot: ");
			try {
				tarol=sc.nextInt();//bekérunk
				ok=true;
				sc.nextLine();
				if (tarol==0 && c_=='/') {
					System.out.println("Nullával való osztás értelmetlen!");
					ok=false;
					sc.nextLine();
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Hibás input! Számot adjon meg!");
				ok=false;
				sc.nextLine();
			}
		} while (!ok);
		return tarol;
	}
	static char karakterBeolvas() {
	char karakterTarol=' ';
	boolean ok=false;
	Scanner sc = new Scanner(System.in);
	do {
		System.out.print("Kerem adjon meg operatort(+,-,/,*): ");
		karakterTarol=(char)sc.next().charAt(0); //char op = (char)input.next().charAt(0);
		if (karakterTarol == '+' || karakterTarol == '-' || karakterTarol == '/' || karakterTarol == '*') {
			ok=true;
		} else {
				ok=false;
				System.out.println("Hibás input(+,-,/,*)!");
		}
	} while (!ok);
	return karakterTarol;
	}
	static void Kalkulator() {
		int operandus1=0,operandus2=0;
		char c=' ';
		boolean ok=false;
		Scanner sc = new Scanner(System.in);
		do {
		operandus1=szamBeolvas(c);
		c=karakterBeolvas();
		operandus2=szamBeolvas(c);
		switch (c) {
		case '+':operandus1=operandus1+operandus2;
			
			break;
		case '-':operandus1=operandus1-operandus2;
		
			break;
		case '*':operandus1=operandus1*operandus2;
		
			break;
		case '/':operandus1=operandus1/operandus2;
		
			break;
		}
		System.out.println("Eredmény: "+operandus1);
		System.out.print("Akar-e új mûveletet megadni?(I/N): ");
		c=(char)sc.next().charAt(0);
		if (c=='I' || c=='i') {
			ok=false;
		} else {
			ok=true;
		}
		sc.nextLine();
		} while (!ok);
	}
}
