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
		
		while(temp.next != null) {
			temp = temp.next;
		}
		Node newNode = new Node(data);
		temp.next = newNode;
		
	}
	
	public void insertAt(int data, int index) {
//		Linked list also follows 0 based indexing like an Array.
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
}


