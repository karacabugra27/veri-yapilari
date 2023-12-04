package TekYönlüBagliListe;

public class BagliListe {

	Node head = null;
	Node tail = null;

	void basaEkle(int x) {
		Node eleman = new Node(x);

		if (head == null) {
			head = eleman;
			tail = eleman;
		} else {
			eleman.next = head;
			head = eleman;
		}
	}

	void sonaEkle(int x) {
		Node eleman = new Node(x);

		if (head == null) {
			head = eleman;
			tail = eleman;
		} else {
			tail.next = eleman;
			tail = eleman;
		}
	}

	void arayaEkle(int x, int indis) {
		Node eleman = new Node(x);

		if (head == null && indis == 0) {
			head = eleman;
			tail = eleman;
		} else if (head != null && indis == 0) {
			eleman.next = head;
			head = eleman;
		} else {
			Node temp = head;
			Node temp2 = head;
			int i = 0;

			while (temp.next != null) {
				i++;
				temp = temp.next;
			}

			if (indis == i) {
				tail.next = eleman;
				tail = eleman;
			} else {
				temp = head;
				temp2 = head;
				i = 0;

				while (i != indis) {

					temp2 = temp;
					temp = temp.next;
					i++;
				}

				temp2.next = eleman;
				eleman.next = temp;

			}

		}

	}

	void bastanSil() {

		if (head == null) {
			System.out.println("liste boş");
		} else {
			head = head.next;
		}
	}

	void sondanSil() {
		if (head == null) {
			System.out.println("liste boş");
		} else {
			Node temp = head;
			Node temp2 = head;

			while (temp.next != null) {
				temp2 = temp;
				temp = temp.next;
			}
			tail = temp2;
			temp2.next = null;
		}
	}

	void aradanSil(int indis) {
		if (head == null && indis == 0) {
			System.out.println("liste bos");
		} else if (head != null && indis == 0) {
			head = head.next;
		} else {
			Node temp = head;
			Node temp2 = head;
			int i = 0;

			while (temp.next != null) {
				temp2 = temp;
				temp = temp.next;
				i++;
			}

			if (indis == i) {
				tail = temp2;
				temp2.next = null;
			} else {
				temp = head;
				temp2 = head;
				i = 0;
				
				while(i < indis) {
					temp2 = temp;
					temp = temp.next;
					i++;
				}
				
				temp2.next = temp.next;
				
			}
		}
	}

	void yazdir() {
		Node temp = head;

		System.out.print("head-->");
		while (temp != null) {
			System.out.print(temp.data + "-");
			temp = temp.next;
		}
		System.out.print("->tail");
	}
}
