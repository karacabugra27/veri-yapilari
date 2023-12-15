package Stack;

public class Main {

	public static void main(String[] args) {

		Stack queue = new Stack(6);
		
		queue.push(1);
		queue.push(2);
		queue.push(3);
		queue.push(4);
		queue.push(5);

		queue.pop();
		
		queue.yazdir();
	}

}
