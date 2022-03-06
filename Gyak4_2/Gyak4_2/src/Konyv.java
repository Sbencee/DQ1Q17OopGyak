/**
 *
 * @author SR
 * 
 * A Könyv osztály adattagjai: cím, szerző, megjelenés éve, ára.
 */
public class Konyv {
    static String cim;
    static String szerzo;
    static int megjelenesi_ev;
    static int ar;
    
    public void setCim(String cim_){
        this.cim=cim_;
    }
    public String getCim(){
        return this.cim;
    }
    public void setSzerzo(String szerzo_){
        this.szerzo=szerzo_;
    }
    public String getSzerzo(){
        return this.szerzo;
    }
    public void setMegjelenesi_ev(int megjelenesi_ev_){
        this.megjelenesi_ev=megjelenesi_ev_;
    }
    public int getMegjelenesi_ev(){
        return this.megjelenesi_ev;
    }
    public void setAr(int ar_){
        this.ar=ar_;
    }
    public int getAr(){
        return this.ar;
    }
    public int arNovel(int szazalek){
        int novelt=0;
        return novelt=getAr()+((getAr()*szazalek)/100);
    }
    @Override
    public String toString(){
        return getCim()+", "+getSzerzo()+", "+getMegjelenesi_ev()+", "+getAr();
    }
}
