package beadando;
import java.util.Scanner;
public class run {

	public static void main(String[] args) {
		int aremeles=10;    //Az áremelés százalékos aránya
        //Konyv konyvek = new Konyv("hgjhj","fdsfs",1596,45);
        /*konyvek.setCim(cimBeolvas());
        konyvek.setSzerzo(szerzoBeolvas());
        konyvek.setMegjelenesi_ev(evBeolvas());
        konyvek.setAr(arBeolvas());*/
        java.time.LocalDate currentDate = java.time.LocalDate.now(); // mai d�tum
        int year = currentDate.getYear(); //mai d�tumb�l az �v
        Konyv konyvek = new Konyv(szerzoBeolvas(), cimBeolvas(),evBeolvas(),arBeolvas());//P�ld�nyosit�s(k�nyvek) �s konstruktor hiv�sa
        System.out.println(konyvek.toString());
        System.out.println("A k�nyv �r�nak "+aremeles+"% emel�s eset�n az �ra : "+konyvek.arNovel(aremeles));
        Konyv konyvek_=new Konyv(szerzoBeolvas(),2500,cimBeolvas(),year);//P�ld�nyosit�s(k�nyvek_) �s konstruktor hiv�sa
        System.out.println("\n"+konyvek_.toString());
        System.out.println("A comparePublicationDate �rt�ke:"+comparePublicationDate(konyvek.getMegjelenesi_ev(),konyvek_.getMegjelenesi_ev()));
	}
	 static String cimBeolvas(){
	        String cim_="";
	        Scanner input=new Scanner(System.in);
	        System.out.print("\nK�rem a k�nyv cim�t : ");
	        cim_=input.nextLine();
	        return cim_;
	    }
	    static String szerzoBeolvas(){
	        String szerzo_="";
	        Scanner input=new Scanner(System.in);
	        System.out.print("\nK�rem a szerz� nev�t : ");
	        szerzo_=input.nextLine();
	        return szerzo_;
	    }
	    static int evBeolvas(){
	    int ev_=0;
	    boolean ok=false;
	    Scanner input=new Scanner(System.in);
	    do{
	        System.out.print("\nK�rem a k�ny kiad�s�nak �v�t: ");
	        try{
	            ev_=input.nextInt();
	            if(ev_>0)
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
	    return ev_;
	    }
	    static int arBeolvas(){
	    int ar_=0;
	    boolean ok=false;
	    Scanner input=new Scanner(System.in);
	    do{
	        System.out.print("\nK�rem a k�nyv �r�t : ");
	        try{
	            ar_=input.nextInt();
	            if(ar_>0)
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
	    return ar_;
	    }
	    static int comparePublicationDate(int datum1,int datum2) {
	    	int osszehasonlit=0;
	    	//System.out.println(datum1+" "+datum2);
	    	if (datum1>datum2) {
				osszehasonlit=1;
			}
	    	else if (datum1<datum2) {
				osszehasonlit=2;
			}
	    	else {
				osszehasonlit=0;
			}
	    	return osszehasonlit;
	    }

}
