package Tree;

public class BinaryTreeClient {
 
	
	public static void main(String[] args) {
		BinaryTree b = new BinaryTree();
		
		b.root = new Node(10);
		b.root.left = new Node(20);
		b.root.right = new Node(30);
		b.root.left.left = new Node(40);
		b.root.left.right = new Node(50);
		b.root.right.right = new Node(60);
		
		System.out.println("Preorder Traversal :)");
		b.preorderTraversal(b.root);
		System.out.println();
		System.out.println("Inorder Traversal ;)");
		b.inorderTrapersal(b.root);
		System.out.println();
		System.out.println("Postorder Traversal :]");
		b.postorderTraversal(b.root);
		System.out.println();
		
/* 
output:

Preorder Traversal :)
10 20 40 50 30 60 
Inorder Traversal ;)
40 20 50 10 30 60 
Postorder Traversal :]
40 50 20 60 30 10 

*/

	}

}
