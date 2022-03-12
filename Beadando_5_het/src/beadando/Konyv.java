package beadando;

public class Konyv {
    private String cim;
    private String szerzo;
    private int megjelenesi_ev;
    private int ar;
    
    public Konyv() {
    }
    public Konyv(String szerzo_, String cim_, int megjelnesi_ev_,int ar_) {//konstruktor
    	this.setSzerzo(szerzo_);
    	this.setCim(cim_);
    	this.setMegjelenesi_ev(megjelnesi_ev_);
    	this.setAr(ar_);
    }
    public Konyv(String szerzo_,int ar_,String cim_,int megjelnesi_ev_) {
    	this.setSzerzo(szerzo_);
    	this.setCim(cim_);
    	this.setAr(ar_);
    	this.setMegjelenesi_ev(megjelnesi_ev_);
    	
    }
    
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
    public String displayInfo() {
		return "DisplayInfo -> toString : "+getCim()+", "+getSzerzo()+", "+getMegjelenesi_ev()+", "+getAr();
	}
    @Override
    public String toString(){
       //return getCim()+", "+getSzerzo()+", "+getMegjelenesi_ev()+", "+getAr();
    	return displayInfo();
    }
}