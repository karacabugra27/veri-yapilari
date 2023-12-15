package TekYönlüBagliListe;

public class Main {

	public static void main(String[] args) {

		BagliListe list = new BagliListe();
		list.basaEkle(5);
		list.basaEkle(3);
		list.basaEkle(1);
		list.sonaEkle(7);
		list.sonaEkle(9);
		
		list.arayaEkle(1, 0);
		list.arayaEkle(11, 5);
		list.arayaEkle(4, 3);
		list.arayaEkle(6, 5);
		
		list.bastanSil();
		list.bastanSil();
		list.sondanSil();
		list.sondanSil();
		list.sonaEkle(5);
		list.sondanSil();
		
		list.aradanSil(0);
		list.aradanSil(3);
		list.aradanSil(1);
		
		
		
		list.yazdir();
		
	}

}
