package DiziUygulamasi;

import java.util.Arrays;

public class Dizi {

    int[] dizi;
    int elemanSayisi;

    public Dizi(int boyut) {
        dizi = new int[boyut];
        elemanSayisi = 0;
    }

    public void ekle(int a) {
        if (elemanSayisi >= dizi.length) {
            System.out.println("dizi dolu");
        } else {
            dizi[elemanSayisi++] = a;
        }
    }

    public int arama(int a) {
        for (int i = 0; i < elemanSayisi; i++) {
            if (dizi[i] == a) {
                System.out.println("bulundu");
                return i;
            }
        }
        System.out.println("bulunamadiiii!!");
        return -1;
    }

    public void sil(int a) {

        int indis = this.arama(a);

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