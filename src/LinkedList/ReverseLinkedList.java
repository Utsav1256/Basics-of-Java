package LinkedList;
//https://leetcode.com/problems/reverse-linked-list/description/
public class ReverseLinkedList {

	
	class Node {
		int data;
		Node next;
		
		Node(int data) {
			this.data = data;
		}
		
	}
	Node head;
	
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
		
		Node newNode = new Node(data);
		newNode.next = temp.next;
		temp.next = newNode;
	}
	public void display() {
		Node temp = this.head;
		
		System.out.println("-----");
		while(temp != null) {
			System.out.print(temp.data + " ");			
			temp = temp.next;
		}
		System.out.println();
		System.out.println("-----");
		
	}
	public void reverseLinkedList() {
		Node previous = null;
		Node current = this.head;
		
		while(current != null) {
			Node next = current.next;
			
			current.next = previous;
			previous = current;
			current = next;
		}
		
		this.head = previous;
		
	}
	
	public static void main(String[] args) {
		
		ReverseLinkedList ll = new ReverseLinkedList();
		
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
		System.out.println("---After Reversing----");
		ll.reverseLinkedList();
		ll.display();
		
		
		
	}

}
