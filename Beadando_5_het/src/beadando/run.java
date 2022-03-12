package beadando;
import java.util.Scanner;
public class run {

	public static void main(String[] args) {
		int aremeles=10;    //Az Ã¡remelÃ©s szÃ¡zalÃ©kos arÃ¡nya
        //Konyv konyvek = new Konyv("hgjhj","fdsfs",1596,45);
        /*konyvek.setCim(cimBeolvas());
        konyvek.setSzerzo(szerzoBeolvas());
        konyvek.setMegjelenesi_ev(evBeolvas());
        konyvek.setAr(arBeolvas());*/
        java.time.LocalDate currentDate = java.time.LocalDate.now(); // mai dátum
        int year = currentDate.getYear(); //mai dátumból az év
        Konyv konyvek = new Konyv(szerzoBeolvas(), cimBeolvas(),evBeolvas(),arBeolvas());//Példányositás(könyvek) és konstruktor hivása
        System.out.println(konyvek.toString());
        System.out.println("A könyv árának "+aremeles+"% emelés esetén az ára : "+konyvek.arNovel(aremeles));
        Konyv konyvek_=new Konyv(szerzoBeolvas(),2500,cimBeolvas(),year);//Példányositás(könyvek_) és konstruktor hivása
        System.out.println("\n"+konyvek_.toString());
        System.out.println("A comparePublicationDate értéke:"+comparePublicationDate(konyvek.getMegjelenesi_ev(),konyvek_.getMegjelenesi_ev()));
	}
	 static String cimBeolvas(){
	        String cim_="";
	        Scanner input=new Scanner(System.in);
	        System.out.print("\nKérem a könyv cimét : ");
	        cim_=input.nextLine();
	        return cim_;
	    }
	    static String szerzoBeolvas(){
	        String szerzo_="";
	        Scanner input=new Scanner(System.in);
	        System.out.print("\nKérem a szerzõ nevét : ");
	        szerzo_=input.nextLine();
	        return szerzo_;
	    }
	    static int evBeolvas(){
	    int ev_=0;
	    boolean ok=false;
	    Scanner input=new Scanner(System.in);
	    do{
	        System.out.print("\nKérem a köny kiadásának évét: ");
	        try{
	            ev_=input.nextInt();
	            if(ev_>0)
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
	    return ev_;
	    }
	    static int arBeolvas(){
	    int ar_=0;
	    boolean ok=false;
	    Scanner input=new Scanner(System.in);
	    do{
	        System.out.print("\nKérem a könyv árát : ");
	        try{
	            ar_=input.nextInt();
	            if(ar_>0)
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
