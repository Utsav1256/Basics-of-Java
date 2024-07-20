package LinkedList;


// https://www.geeksforgeeks.org/problems/introduction-to-linked-list/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=introduction-to-linked-list
public class IntroductionToLinkedList_Problem_geeksforgeeks {

	static class Node { 
	    int data; 
	    Node next; 

	    Node() { data = 0; }
	    Node(int d) { data = d; }  //constructor to create a new node
	} 
	
	public static void display(Node head) {
		
		System.out.println("----------");
		Node temp = head;
		
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
		System.out.println("----------");
		
	}
	public static Node constructLL(int arr[]) {
        // code here
        Node newNode = new Node(arr[0]);
        Node head = newNode;
        
        Node temp = head;
        for(int i = 1; i < arr.length; i++) {
            Node newNode1 = new Node(arr[i]);
            temp.next = newNode1;
            temp = temp.next;
        }
        return head;
    }
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		Node head = constructLL(arr);
		display(head);
	}

}
