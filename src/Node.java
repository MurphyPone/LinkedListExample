public class Node {
	private Card card;
	private Node next;
	
	Node(Card o) { //constructor
		card = o;	//sets the node's object
		next = null;	//set's it's next pointer to null
	}
	
	public void setNext(Node n) {
		next = n;
	}
	
	public Node getNext(Node n) {
		return next;
	}
	
	public Card getCard() {
		return card;
	}
	
	
}


class Card {
	private int suit;
	private int rank; 
	
	Card(int s, int r) {
		suit = s;
		rank = r;
	}
}
