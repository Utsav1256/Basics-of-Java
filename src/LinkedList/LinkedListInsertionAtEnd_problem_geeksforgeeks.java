package LinkedList;

public class LinkedListInsertionAtEnd_problem_geeksforgeeks {
	
	static Node insertAtEnd(Node head, int x) {
        // code here
        if(head == null) {
            Node newNode = new Node(x);
            head = newNode;
            return head;
        }
        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        Node newNode = new Node(x);
        temp.next = newNode;
        
        return head;
    }

	
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
		
		ll.head = insertAtEnd(ll.head, 66);
		ll.display();
	}

}
