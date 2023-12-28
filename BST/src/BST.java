
public class BST {

	Node root;

	public BST() {
		root = null;
	}

	public void add(int a) {
		root = addRecursive(root, a);
	}

	private Node addRecursive(Node current, int a) {
		if (current == null) {
			current = new Node(a);
			return current;
		} else if (current.data > a) {
			current.lc = addRecursive(current.lc, a);
		} else if (current.data < a) {
			current.rc = addRecursive(current.rc, a);
		}
		return current;
	}

	public Node search(int s) {
		return searchRecursive(root, s);
	}

	private Node searchRecursive(Node current, int s) {
		if (current == null || current.data == s) {
			return null;
		} else if (current.data > s) {
			current.lc = searchRecursive(current.lc, s);
		} else if (current.data < s) {
			current.rc = searchRecursive(current.rc, s);
		}
		return current;
	}

	public void preOrder() {
		preOrderRecursive(root);
	}

	private void preOrderRecursive(Node current) {
		if (current != null) {
			System.out.println(current.data + " ");
			preOrderRecursive(current.lc);
			preOrderRecursive(current.rc);
		}
	}

	public void inOrder() {
		inOrderRecursive(root);
	}

	private void inOrderRecursive(Node current) {
		if (current != null) {
			inOrderRecursive(current.lc);
			System.out.println(current.data + " ");
			inOrderRecursive(current.rc);
		}
	}

	public void postOrder() {
		postOrderRecursive(root);
	}

	private void postOrderRecursive(Node current) {
		postOrderRecursive(current.lc);
		postOrderRecursive(current.rc);
		System.out.println(current.data + " ");
	}

	public void delete(int a) {
		root = deleteRecursive(root, a);
	}

	private Node deleteRecursive(Node current, int a) {
		if (current != null) {
			return current;
		} else if (current.data > a) {
			current.lc = addRecursive(current.lc, a);
		} else if (current.data < a) {
			current.rc = addRecursive(current.rc, a);
		} else {
			if (current.lc == null) {
				return current.rc;
			}
			if (current.rc == null) {
				return current.lc;
			}
			int leftMax = findMax(current.lc); // solun en büyüğünü buluyor
			current.data = leftMax; // current.data'ya solun en büyüğünü atıyor.
			current.lc = deleteRecursive(current.lc, leftMax); //current'ın soluna onun altındaki en büyüğünü atıyor.
		}
		return current;

	}
	
	public int findMax(Node current ) {
		int max = current.data;
		
		while(current.rc != null) {
			max = current.rc.data;
			current = current.rc;
		}
		return max;
	}

}



















