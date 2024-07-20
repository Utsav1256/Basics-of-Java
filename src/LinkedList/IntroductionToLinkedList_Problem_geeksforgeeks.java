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
		if(arr.length == 0) {
			return null;
		}
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
/*
 The need for static in your code arises from how static and non-static members work in Java. Here's a detailed explanation:

Static vs Non-Static Members
Static Members:

Belong to the class itself, not to any specific instance.
Can be accessed without creating an instance of the class.
Useful for methods or variables that should be shared across all instances of the class.
Non-Static Members:

Belong to an instance of the class.
Each instance of the class has its own copy of non-static members.
Can only be accessed through an instance of the class.
Your Original Code and Issues
Node Class:

Initially, the Node class is an inner class, which is non-static by default.
Non-static inner classes have an implicit reference to an instance of the enclosing class (IntroductionToLinkedList_Problem_geeksforgeeks).
This implicit reference makes it impossible to use the Node class in a static context without an instance of the enclosing class.
Static Methods:

The main method is static, which means it belongs to the class and not to any instance.
Static methods (like main) can only directly call other static methods or access static variables.
If you try to access a non-static method or class from a static context, you will get a compilation error because the non-static members require an instance to be accessed.
Making the Node Class Static
By making the Node class static, you remove the implicit reference to the instance of the enclosing class. This allows you to create instances of the Node class without needing an instance of IntroductionToLinkedList_Problem_geeksforgeeks.

Detailed Example with and without Static

Without Static---
public class Example {
    class InnerClass {
        int value;
        InnerClass(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        // This will cause an error because InnerClass is not static
        InnerClass obj = new InnerClass(10); // Error: non-static variable this cannot be referenced from a static context
    }
}

With Static---
public class Example {
    static class InnerClass {
        int value;
        InnerClass(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        // This works because InnerClass is static
        InnerClass obj = new InnerClass(10); // No error
    }
}

Applying to Your Code
Static Node Class:

By making the Node class static, you can create nodes within static methods like constructLL and main without issues.
Static Methods:

If constructLL and display are static, they can be called directly from main without creating an instance of IntroductionToLinkedList_Problem_geeksforgeeks.
 * */
