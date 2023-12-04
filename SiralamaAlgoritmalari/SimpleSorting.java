package SiralamaAlgoritmalari;

import java.util.Arrays;

public class SimpleSorting {

    int dizi[];

    public SimpleSorting(int d[]) {
        dizi = d;
    }

    public void sorting() {
        int temp = 0;
        boolean swap = true;
        for (int i = 0; i < dizi.length && swap == true; i++) {
            swap = false;
            for (int j = 0; j < (dizi.length - 1) - i; j++) {
                if (dizi[j] > dizi[j + 1]) {
                    temp = dizi[j];
                    dizi[j] = dizi[j + 1];
                    dizi[j + 1] = temp;
                    swap = true;
                }
            }
        }
    }

    public void insertionSorting() {
        int j = 0;
        for (int i = 0; i < dizi.length; i++) {
            int t = dizi[i];
            for (j = i; j > 0 && dizi[j - 1] > t; j--) {
                dizi[j] = dizi[j - 1];
            }
            dizi[j] = t;
        }
    }

    public void selectionSorting(){
        int min = 0;
        int temp ;

        for(int i = 0; i < dizi.length ; i++){
            min = i;
            for(int j = i+1 ; j < dizi.length ; j++){
                if(dizi[min] > dizi[j]){
                    min = j;
                }
            }

                temp = dizi[min];
                dizi[min] = dizi[i];
                dizi[i] = temp;
            
        }

    }

    public void yazdir() {
        System.out.println(Arrays.toString(dizi));
    }
}
