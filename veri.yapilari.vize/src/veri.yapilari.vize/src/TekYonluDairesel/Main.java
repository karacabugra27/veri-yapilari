package TekYonluDairesel;

public class Main {

	public static void main(String[] args) {
		BagliListe list = new BagliListe();
		
		list.basaEkle(5);
		list.basaEkle(2);
		list.basaEkle(4);
		
		list.sonaEkle(8);
		list.sonaEkle(13);
		list.sonaEkle(12);
		
		list.arayaEkle(1, 0);
		list.arayaEkle(44, 4);
		
		list.bastanSil();
		
		list.sondanSil();
		
		list.aradanSil(0);
		list.aradanSil(4);
		list.aradanSil(2);
		
		list.yazdir();

	}

}
