
import java.util.Arrays;

public class Dizi {

    int[] dizi;
    int elemanSayisi;

    public Dizi(int boyut) { // constructor bloğu oluşturuldu. boyut isteniyor. eleman sayisi 0 eşitlendi.
        dizi = new int[boyut];
        elemanSayisi = 0;
    }

    public void ekle(int a) {
        /*
         * if (elemanSayisi >= dizi.length) { //eleman sayısı dizinin sınırından
         * fazlaysa dolu uyarisi yapar.
         * System.out.println("dizi dolu");
         * } else { //diziye ekleyip eleman sayisini arttırır.
         * dizi[elemanSayisi++] = a;
         * }
         */
        int i = 0;
        if (elemanSayisi >= dizi.length) {
            System.out.println("dizi dolu");
        } else {
            for (i = (elemanSayisi - 1); i >= 0 && dizi[i] > a; i--) { // i sıfırdan büyük olduğu ve dizinin i. indeksi
                                                                       // eklenecek sayıdan büyük olduğu durumda indeksi
                                                                       // bir azaltır.
                dizi[i + 1] = dizi[i]; // dizinin i+1. elemanına dizinin i. elemanını atama yapar. 
            }

            dizi[i + 1] = a; // döngü boyunca eklenecek olan değer bir geriye doğru hareket eder.
            elemanSayisi++; // ekleme yapıldığı için eleman sayısını bir arttırırız.

        }
    }

    public int arama(int a) {
        for (int i = 0; i < elemanSayisi; i++) { // eleman sayisi kadar gezer.
            if (dizi[i] == a) { // aradigimiz dizinin elemanina eşitse bulur.
                return i; // indexini dönerir.
            }
        }
        System.out.println("bulunamadiiii!!");
        return -1;
    }

    public void sil(int a) {

        int indis = this.arama(a); // indexini indise atıyor.

        if (indis == -1) {
            System.out.println("aradiginiz sayi yok ");
        } else {

            for (int i = indis; i < elemanSayisi - 1; i++) {
                dizi[i] = dizi[i + 1];
            }

            dizi[--elemanSayisi] = 0;

        }

    }

    public void guncelle(int eski, int yeni) {

        int indis = this.arama(eski);

        if (indis == -1) {
            System.out.println("güncellemek istediginiz sayi yok ");
        } else {

            dizi[indis] = yeni;
        }

    }

    public void yazdir() {
        System.out.println(Arrays.toString(dizi));
    }

}