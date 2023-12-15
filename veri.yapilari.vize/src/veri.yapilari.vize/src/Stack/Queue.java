package Stack;

import java.util.Arrays;

public class Queue {
	
	int dizi[];
	int es;
	
	public Queue(int size) {
		dizi = new int[size];
		es = 0;
	}
	
	public void push(int x) {
		if( es == dizi.length) {
			System.out.println("kuyruk dolu");
		} else {
			dizi[es++] = x;
		}
	}
	
	public int pop() {
		
		int r = dizi[0];
		
		for( int i = 0 ; i < es ; i++) {
			dizi[i] = dizi[i+1];
		}
		
		return r;
	}
	
	public void yazdir() {
		System.out.println(Arrays.toString(dizi));
	}
	
	
	
	
	
}
