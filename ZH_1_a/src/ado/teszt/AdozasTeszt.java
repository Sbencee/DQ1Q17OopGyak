package ado.teszt;

import java.util.Iterator;
import java.util.Scanner;

import ado.CsaladiAdokedvezmeny;

public class AdozasTeszt extends CsaladiAdokedvezmeny{
	public AdozasTeszt(String tipusa, int gyerekszam) {
		super(tipusa, gyerekszam);
	}

	public static void main(String[] args) {
		int a=1,b=0;
		CsaladiAdokedvezmeny[] adotomb= new AdozasTeszt[5];
		for (int i = 0; i < adotomb.length; i++) {
			adotomb[i]=new AdozasTeszt("A"+i, bekerInt("Kerem adja meg a gyerek számát:"));
			System.out.println(adotomb[i].toString());
		}
		
		
		
		System.out.println("A legmagasabb kiszamitott adókedvezmeny: "+legmagasabbAdokedvezmeny(adotomb));
		System.out.println(adokedvezmenyIgenybevetele(adotomb)+" esetben vesznek igénybe családi adokedvezmenyt.");
	}
	public static int bekerInt(String s) {
		boolean ok=false;
		int gyerekszamTarol=0;
		
			do {
				Scanner sc = new Scanner(System.in);
			try {
				System.out.print(s);
				gyerekszamTarol= sc.nextInt();
				if (gyerekszamTarol>0) {
					ok=true;
				}
				else {
					ok=false;
					System.out.println("\nHibás adat!");
					}
				} catch (Exception e) {
					System.out.println("\nHibás input! Számot adjon meg!");
					sc.hasNextLine();
				}
			} while (!ok);
			
		return gyerekszamTarol;
	}
	public static CsaladiAdokedvezmeny legmagasabbAdokedvezmeny(CsaladiAdokedvezmeny[] adotomb){
		int legmagasabb=0,j=0;
		for (int i = 0; i < adotomb.length; i++) {
			if (adotomb[i].adokedvezmeny()>legmagasabb) {
				legmagasabb=adotomb[i].adokedvezmeny();
				j=i;
			}
		}
		return adotomb[j];
	}
	public static int adokedvezmenyIgenybevetele(CsaladiAdokedvezmeny[] adotomb) {
		int db=0;
		for (int i = 0; i < adotomb.length; i++) {
			if (adotomb[i].getGyerekszam()>=3) {
				db++;
			}
		}
		return db;
	}

}
