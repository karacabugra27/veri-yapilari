package CiftYönlüBagliListe;

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
			head.prev = eleman;
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
			eleman.prev = tail;
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
			head.prev = eleman;
			head = eleman;
		} else {
			Node temp = head;
			int i = 0;

			while (temp != null) {
				temp = temp.next;
				i++;
			}

			if (indis == i) {
				tail.next = eleman;
				eleman.prev = tail;
				tail = eleman;
			} else {

				temp = head;
				i = 0;

				while (i < indis) {
					temp = temp.next;
					i++;
				}

				temp.prev.next = eleman;
				temp.prev = eleman.prev;

				eleman.next = temp;
				temp.prev = eleman;

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
			tail = tail.prev;
			tail.next = null;
		}
	}

	void aradanSil(int indis) {
		if ( head != null) {
			if (head.next == null && indis == 0 ) {
				head = null;
				tail = null;
			} else if ( head.next != null && indis == 0 ) {
				head = head.next;
				head.prev = null;
			} else {
				int i = 0;
				Node temp = head;
				while( temp != null) {
					i++;
					temp = temp.next;
				}
				
				if ( indis == i-1 ) {
					tail = tail.prev;
					tail.next = null;
				} else {
					temp = head;
					i = 0;
					while( i < indis ) {
						i++;
						temp = temp.next;
					}
					
					temp.next.prev = temp.prev;
					temp.prev.next = temp.next;
				}
				
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
