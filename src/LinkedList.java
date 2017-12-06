public class LinkedList {
	private Node head;
	private Node tail;
	
	LinkedList(Card c) {	//constructor
		Node card = new Node(c);
		head = card;
		tail = card;
	}
	
	//inserts at head, not append to end
	void add(Card c) {
		Node card = new Node(c);
		card.setNext(head);
		head = new Node(c);
	}
	
	void addToEnd(Card c) {
		Node card = new Node(c);
		tail.setNext(card);
		tail = card;
	}
	
	
}
