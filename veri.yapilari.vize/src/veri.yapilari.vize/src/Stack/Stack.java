package Stack;

import java.util.Arrays;

public class Stack {
	int dizi[];
	int es;

	public Stack(int size) {
		dizi = new int[size];
		es = 0;
	}

	public void push(int x) {
		if( es == dizi.length ) {
			System.out.println("stack dolu");
		} else {
			dizi[es++] = x;
		}
	}
	
	public int pop() {
		int r = dizi[es-1];
		
		dizi[--es] = 0;
		
		return r;
	}

	void yazdir() {
		System.out.println(Arrays.toString(dizi));
	}

}
