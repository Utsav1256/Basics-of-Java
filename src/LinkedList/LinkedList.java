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
}


