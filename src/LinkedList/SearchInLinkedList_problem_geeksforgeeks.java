package LinkedList;

public class SearchInLinkedList_problem_geeksforgeeks {

	public static boolean SearchInLinkedList(Node head, int key) {
		Node temp = head;
		while(temp != null) {
			if(temp.data == key) {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}
	
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		
		l.addFirst(1);
		l.addLast(2);
		l.insertAt(3, 2);
		l.addLast(4);
		l.display();

		System.out.println(SearchInLinkedList(l.head, 3));
		System.out.println(SearchInLinkedList(l.head, 6));
		
	}

}
