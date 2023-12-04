import java.util.Scanner;

public class odev1 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
            
        int[] dizi = new int[10];

        for(int i=0;i<10;i++){
            System.out.println("bir sayi giriniz.");
            dizi[i] = scanner.nextInt();
        }

        for(int i=0;i<10;i++){
            for(int j=i+1;j<10;j++){
                if(dizi[i]>dizi[j]){
                    int gecici = dizi[i];
                    dizi[i] = dizi[j];
                    dizi[j] = gecici;
                }
            }
        }

        for(int i=0;i<10;i++){
            System.out.println(dizi[i]);
        }




    }

}