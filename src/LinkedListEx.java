
public class LinkedListEx {
	public static void main(String[] args) {
		Card[] cards = null; 
		
		for(int i = 0; i < 10; i++) 
			cards[i] = new Card(i, 10-i);
			
		LinkedList myList = new LinkedList(new Card(10, 99));
		myList.add(new Card(1,1));
		System.out.println(myList);
	}
}
