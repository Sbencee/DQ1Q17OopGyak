package bank;

public class Bank {
	private Szamla[] bazisSzamla = new Szamla[1];
	public void bankiNap() {
		bazisSzamla[0]= new Szamla(1,500);
		System.out.println(bazisSzamla[0].toString());
		bazisSzamla[0].betesz(600);
		System.out.println(bazisSzamla[0].toString());
	//	bazisSzamla[0].kivesz(500);
		System.out.println(bazisSzamla[0].kivesz(500) ? "A p�nzfelv�tel siker�lt, �j egyenleg: " + bazisSzamla[0].getEgyenleg(): "Nincs fedezet" + bazisSzamla[0].getEgyenleg());
		System.out.println(bazisSzamla[0].kivesz(1000) ?  bazisSzamla[0].toString() : "A p�nzfelv�tel sikertelen! Sz�mla adata:"+bazisSzamla[0].toString());
		
	}
	

}
