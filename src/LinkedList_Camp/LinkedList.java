package LinkedList_Camp;

public class LinkedList {

	Node<Integer> head; // property
	
	public Node<Integer> createLinkedList() { //
		Node<Integer> n1; // this will create a reference variable of type Node -> as it is going to store the reference of the next Node.
		n1 = new Node<>(10); // this will create the object of class Node in the memory and assign the memory location (address) of the object to n1.
		
		Node<Integer> n2 = new Node<>(20);
		Node<Integer> n3 = new Node<>(30);
		Node<Integer> n4 = new Node<>(40);
		Node<Integer> n5 = new Node<>(50);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		
		System.out.println("Node n1" + ", address " + n1 + ", data" + n1.data + ", next " + n1.next);
		System.out.println("Node n2" + ", address " + n2 + ", data" + n2.data + ", next " + n2.next);
		System.out.println("Node n3" + ", address " + n3 +", data" + n3.data + ", next " + n3.next);
		System.out.println("Node n4" + ", address " + n4 + ", data" + n4.data + ", next " + n4.next);
		System.out.println("Node n5" + ", address " + n5 + ", data" + n5.data + ", next " + n5.next);

		/*
		 * 
		 * Node n1, address LinkedList_Camp.Node@30dae81, data10, next LinkedList_Camp.Node@1b2c6ec2
		   Node n2, address LinkedList_Camp.Node@1b2c6ec2, data20, next LinkedList_Camp.Node@4d405ef7
		   Node n3, address LinkedList_Camp.Node@4d405ef7, data30, next LinkedList_Camp.Node@6193b845
		   Node n4, address LinkedList_Camp.Node@6193b845, data40, next LinkedList_Camp.Node@2e817b38
    	   Node n5, address LinkedList_Camp.Node@2e817b38, data50, next null
		 * 
		 */
		return n1;
	}
	
	
}
