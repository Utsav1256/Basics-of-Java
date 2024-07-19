package LinkedList;

public class LinkedListClient {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		
		ll.addFirst(102);
		ll.display();
		ll.addFirst(103);
		ll.display();
		ll.addFirst(105);
		ll.display();
		ll.addLast(106);
		ll.display();
		ll.insertAt(250, 2);
		ll.display();
		ll.insertAt(180, 3);
		ll.display();
		ll.insertAt(10, 0);
		ll.display();
		ll.insertAt(360, 7);
		ll.display();
	}

}
