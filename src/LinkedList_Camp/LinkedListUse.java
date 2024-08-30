package LinkedList_Camp;

public class LinkedListUse {
	
	
	public static void main(String[] args) {
		Node<Integer> n1 = new Node<>(10);
		System.out.println(n1); // -> LinkedList_Camp.Node@b1bc7ed
		
		System.out.println(n1.data); // -> 10
		System.out.println(n1.next); // -> Null
		
		LinkedList l1 = new LinkedList();
		
		l1.head = l1.createLinkedList();
		l1.printLinkedList(l1.head); //-> 10 20 30 40 50
	
	}

}
