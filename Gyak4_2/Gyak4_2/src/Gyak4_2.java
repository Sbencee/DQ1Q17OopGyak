import java.util.Scanner;
/**
 *
 * @author SR
 */
public class Gyak4_2 {

    public static void main(String[] args) {
        int aremeles=10;    //Az áremelés százalékos aránya
        Konyv konyvek = new Konyv();
        konyvek.setCim(cimBeolvas());
        konyvek.setSzerzo(szerzoBeolvas());
        konyvek.setMegjelenesi_ev(evBeolvas());
        konyvek.setAr(arBeolvas());
        System.out.println("A könyv árának "+aremeles+"% emelés esetén az ár : "+konyvek.arNovel(aremeles));
        System.out.println(konyvek.toString());
    }
    static String cimBeolvas(){
        String cim_="";
        Scanner input=new Scanner(System.in);
        System.out.print("\nKérem a könyv címét : ");
        cim_=input.nextLine();
        return cim_;
    }
    static String szerzoBeolvas(){
        String szerzo_="";
        Scanner input=new Scanner(System.in);
        System.out.print("\nKérem a szerzo nevét : ");
        szerzo_=input.nextLine();
        return szerzo_;
    }
    static int evBeolvas(){
    int ev_=0;
    boolean ok=false;
    Scanner input=new Scanner(System.in);
    do{
        System.out.print("\nKérem a könyv kiadásának évét : ");
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
}
