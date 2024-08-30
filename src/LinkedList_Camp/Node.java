package LinkedList_Camp;

public class Node<T> {
	T data;
	Node<T> next;
	
	Node(T data) {
		this.data =  data;
//		this.next = null; -> no need to write this bcz default value of the Node type will be `null`
	}
	
	
}
