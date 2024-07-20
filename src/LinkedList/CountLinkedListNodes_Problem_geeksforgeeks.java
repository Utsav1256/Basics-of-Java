package LinkedList;

public class CountLinkedListNodes_Problem_geeksforgeeks {

	public static int countNodes(Node head){
		Node temp = head;
		int count = 0;
		while(temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}
	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.addFirst(100);
		l1.addFirst(200);
		l1.addFirst(300);
		l1.addFirst(400);
		l1.addFirst(500);
		l1.addLast(600);
		l1.display();
		
		int count = countNodes(l1.head);
		System.out.println(count);
		
		
	}

}
