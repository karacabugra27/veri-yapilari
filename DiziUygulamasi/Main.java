package DiziUygulamasi;

public class Main {

    public static void main(String[] args) {
        
        Dizi d = new Dizi(10);

        d.yazdir();

        d.ekle(10);
        d.ekle(5);
        d.ekle(7);
        d.ekle(20);
        d.ekle(13);
        d.ekle(44);
        d.ekle(77);
        d.ekle(251);
        d.ekle(99);
        d.ekle(67);

        d.yazdir();

        System.out.println(d.arama(15));
        System.out.println(d.arama(13));

        d.yazdir();
        d.sil(20);
        d.yazdir();

        d.guncelle(44, 43);
        d.yazdir();



    }
    
}
