import java.util.Scanner;
public class gyak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Beker();
			}
	static void Beker() {
		boolean ok=false;
        int sorok = 0;
        Scanner sc = new Scanner(System.in);
                   do{
                	   try {
						
                		   
                		   System.out.print("\nK�rem a kiirand� sorok sz�m�t (1-9) : ");
                		   sorok = sc.nextInt();
                		   if (sorok<1 || sorok>9){
                			   ok=false;
                			   System.out.println("Hib�s sc!");
                		   }
                		   else {
                			   ok = true;
                		   }
                	   	} catch (Exception e) {
   						// TODO: handle exception
                	   		System.out.println("\nHib�s input! Sz�mot adjon meg!");
                	   		sc.nextLine();//
                	   	}
                   }while(!ok);
                   for(int i=1; i<=sorok; i++){
                       for(int j=1;j<=i; j++){
                           System.out.print(i);
                       }
                       System.out.println();
                   }
                   
	}
}