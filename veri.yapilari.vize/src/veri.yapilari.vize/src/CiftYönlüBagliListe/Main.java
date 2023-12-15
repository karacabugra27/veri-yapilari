package CiftYönlüBagliListe;

public class Main {

	public static void main(String[] args) {

		BagliListe list = new BagliListe();
		
		list.basaEkle(5);
		list.basaEkle(3);
		
		list.sonaEkle(7);
		list.sonaEkle(9);
		
		list.arayaEkle(1, 0);
		list.arayaEkle(11, 5);
		list.arayaEkle(6, 3);
		list.arayaEkle(44, 4);

		
		
	
		
		list.yazdir();
	}

}
