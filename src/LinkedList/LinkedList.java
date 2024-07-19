package LinkedList;

public class LinkedList {
	class Node {
		int data;
		Node next;
		
		Node(int data) {
			this.data = data;
		}
	}
	
	Node head;
	
	public void display() {
		
		System.out.println("----------");
		Node temp = this.head;
		
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
		System.out.println("----------");
		
	}
	
	public void addFirst(int data) {
		Node newNode = new Node(data);
		newNode.next = this.head;
		this.head = newNode;
	}
	
	public void addLast(int data) {
		if(this.head == null) {
			addFirst(data);
			return;
		}
		Node temp = this.head;
		
//		unique property of last node -> temp.next == null.

		while(temp.next != null) {
			temp = temp.next;
		}
		Node newNode = new Node(data);
		temp.next = newNode;
		
	}
	
	public void insertAt(int data, int index) {
//		Linked list also follows 0 based indexing like an Array.
		if(index < 0) {
			return;
		}
		
		if(index == 0) {
			addFirst(data);
			return;
		}
		
		Node temp = this.head;
		for(int i = 0; i < index - 1; i++) {
			temp = temp.next;
		}
//		Node forward = temp.next; -> no need
		
		Node newNode = new Node(data);
		newNode.next = temp.next;
		temp.next = newNode;
	}

	public void removeFirst() {
		
		if(this.head == null) {
			return;
		}
		this.head = this.head.next;
//		after that previous node will not reachable although the connection is there
//		and we know in LinkedList we can't move backwards -> the previous head exists but not reachable.
//		And we know a concept,
//		if there is a node and if it is not reachable, then the garbage collector will automatically remove the unreachable node. 
	}
	public void removeLast() {
		Node temp = this.head;
		
//		unique property of second last node -> temp.next.next == null.
		while(temp.next.next != null) {
			temp = temp.next;
		}
		temp.next = null;
//		And we know a concept,
//		if there is a node and if it is not reachable, then the garbage collector will automatically remove the unreachable node. 
	
	}
	
	public void removeAt(int index) {
		
		if(index < 0) {
			return;
		}
		
		if(index == 0) {
			removeFirst();
			return;
		}
		
		Node temp = this.head;
		for(int i = 0; i < index -1; i++) {
			temp =  temp.next;
		}
		temp.next = temp.next.next;
//		And we know a concept,
//		if there is a node and if it is not reachable, then the garbage collector will automatically remove the unreachable node. 
		
	}
}


