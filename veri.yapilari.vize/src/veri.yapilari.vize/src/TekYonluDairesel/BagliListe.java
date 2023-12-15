package TekYonluDairesel;

public class BagliListe {
	Node head = null;
	Node tail = null;

	void basaEkle(int x) {
		Node eleman = new Node(x);

		if (head == null) {
			head = eleman;
			tail = eleman;
			tail.next = head;
		} else {
			eleman.next = head;
			head = eleman;
			tail.next = head;
		}
	}

	void sonaEkle(int x) {
		Node eleman = new Node(x);

		if (head == null) {
			head = eleman;
			tail = eleman;
			tail.next = head;
		} else {
			tail.next = eleman;
			tail = eleman;
			tail.next = head;
		}
	}

	void arayaEkle(int x, int indis) {
		Node eleman = new Node(x);

		if (head == null) {
			head = eleman;
			tail = eleman;
			tail.next = head;
		} else if (indis == 0) {
			eleman.next = head;
			head = eleman;
			tail.next = head;
		} else {
			Node temp = head;
			Node temp2 = head;
			int i = 0;

			while (temp != tail) {
				temp = temp.next;
				i++;
			}

			if (i + 1 == indis) {
				tail.next = eleman;
				tail = eleman;
				tail.next = head;
			} else {
				i = 0;
				temp = head;

				while (i < indis) {
					i++;
					temp2 = temp;
					temp = temp.next;
				}
				temp2.next = eleman;
				eleman.next = temp;
			}
		}
	}

	void bastanSil() {
		if (head != null) {
			head = head.next;
			tail.next = head;
		}
	}

	void sondanSil() {
		if (head != null) {
			Node temp = head;

			while (temp.next != tail) {
				temp = temp.next;
			}
			tail = temp;
			temp.next = head;
		}
	}

	void aradanSil(int indis) {
		if (head != null && indis == 0) {
			head = head.next;
			tail.next = head;
		} else {
			Node temp = head;
			Node temp2 = head;
			int i = 0;

			while (temp.next != tail) {
				i++;
				temp = temp.next;
			}
			
			
			if (i + 1 == indis ) {
				tail = temp;
				temp.next = head;
			} else {
				temp = head;
				i = 0;
				
				while( i < indis) {
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
		while (temp != tail) {
			System.out.print(temp.data + "-");
			temp = temp.next;
		}
		System.out.print(temp.data + "->tail");
	}

}
