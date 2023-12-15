package Sorting;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

//		Scanner scanner = new Scanner(System.in);
//		System.out.print("bir sayi gir");
//		int n = scanner.nextInt();
//		int dizi[] = new int[n];
//
//		for (int i = 0; i < n; i++) {
//			System.out.print("sayi giriniz : ");
//			dizi[i] = scanner.nextInt();
//		}
// bubble sort
//		int dizi[] = { 3, 2, 7, 8, 1, 5 };
//
//		for (int i = 0; i < dizi.length; i++) {
//			for (int j = 0; j < dizi.length - i - 1; j++) {
//				if (dizi[j] > dizi[j + 1]) {
//					int gecici = dizi[j];
//					dizi[j] = dizi[j + 1];
//					dizi[j + 1] = gecici;
//				}
//			}
//		}
//		
//		System.out.println(Arrays.toString(dizi));
//
// insertion sort
//		for (int i = 1; i < n; i++) {
//			for (int j = i; j > 0; j--) {
//				if (dizi[j] < dizi[j - 1]) {
//					int gecici = dizi[j];
//					dizi[j] = dizi[j - 1];
//					dizi[j - 1] = gecici;
//				}
//			}
//		}
// selection sort
//		for (int i = 0; i < n - 1; i++) {
//			int min = i;
//
//			for (int j = i; j < n; j++) {
//
//				if (dizi[min] > dizi[j]) {
//					min = j;
//				}
//			}
//
//			int gecici = dizi[min];
//			dizi[min] = dizi[i];
//			dizi[i] = gecici;
//		}
// insertion sort gibi shell sort
//		for (int gap = n / 2; gap > 0; gap /= 2) {
//			for (int i = gap; i < n; i+= gap) {
//				for (int j = i; j > 0; j-=gap) {
//					if (dizi[j] < dizi[j - gap]) {
//						int gecici = dizi[j];
//						dizi[j] = dizi[j - gap];
//						dizi[j - gap] = gecici;
//					}
//				}
//			}
//		}
// merge sort
//		int dizi[] = { 3, 7, 1, 8, 2, 4 };
//		System.out.println(Arrays.toString(dizi));
//		mergeSort(dizi, 0, dizi.length - 1);
//		System.out.println(Arrays.toString(dizi));

//		System.out.println(Arrays.toString(dizi));

//	private static void mergeSort(int dizi[], int l, int r) {
//		if (l < r) {
//			int m = (l + r) / 2;
//			mergeSort(dizi, l, m);
//			mergeSort(dizi, m + 1, r);
//			merge(dizi, l, m, r);
//		}
//	}
//
//	private static void merge(int dizi[], int l, int m, int r) {
//		int i = l;
//		int j = m + 1;
//
//		int geciciDizi[] = new int[r - l + 1];
//		int k = 0;
//
//		while (i <= m && j <= r) {
//			if (dizi[i] < dizi[j]) {
//				geciciDizi[k] = dizi[i];
//				i++;
//			} else {
//				geciciDizi[k] = dizi[j];
//				j++;
//			}
//			k++;
//		}
//
//		while (i <= m) {
//			geciciDizi[k] = dizi[i];
//			i++;
//			k++;
//		}
//		
//		while (j <= r) {
//			geciciDizi[k] = dizi[j];
//			j++;
//			k++;
//		}
//		
//		for(i = 0; i < geciciDizi.length ; i++) {
//			dizi[l++] = geciciDizi[i];
//		}
// quick sort
//		System.out.println(Arrays.toString(dizi));
//		quicksort(dizi, 0, dizi.length - 1);
//		System.out.println(Arrays.toString(dizi));
//
//	}
//
//	private static void quicksort(int[] dizi, int l, int r) {
//
//		if(l < r) {
//			int pi = partition(dizi, l, r);
//			quicksort(dizi, l, pi - 1);
//			quicksort(dizi, pi + 1, r);
//		}
//	}
//
//	private static int partition(int[] dizi, int l, int r) {
//		int pi = r;
//		int i = l;
//		int j = r - 1;
//		
//		do {
//			while(dizi[i] < dizi[pi] && i < r) {
//				i++;
//			}
//			
//			while(dizi[j] > dizi[pi] && j > 0) {
//				j--;
//			}
//			
//			if( i < j) {
//				swap(dizi, i, j);
//			}
//			
//		} while (i < j);
//		swap(dizi, i, pi);
//		
//		return i;
//		
//	}
//	
//	public static void swap(int dizi[], int i, int j) {
//		int gecici = dizi[i];
//		dizi[i] = dizi[j];
//		dizi[j] = gecici;
//	}

	}

}
