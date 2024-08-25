package Tree;

public class BinaryTreeClient {
 
	static void preorderTraversal(Node root) {
		if(root == null) {
			return;
		}
		
		System.out.print(root.data + " ");
		preorderTraversal(root.left);
		preorderTraversal(root.right);
	}
	
	public static void main(String[] args) {
		BinaryTree b = new BinaryTree();
		
		b.root = new Node(10);
		preorderTraversal(b.root);
		System.out.println();
		b.root.left = new Node(20);
		preorderTraversal(b.root);
		System.out.println();
		b.root.right = new Node(30);
		preorderTraversal(b.root);
		System.out.println();
		b.root.left.left = new Node(40);
		preorderTraversal(b.root);
		System.out.println();
		b.root.left.right = new Node(50);
		preorderTraversal(b.root);
		System.out.println();
		b.root.right.right = new Node(60);
		preorderTraversal(b.root);
		System.out.println();
		
/* 
output:
10 
10 20 
10 20 30 
10 20 40 30 
10 20 40 50 30 
10 20 40 50 30 60 
*/

	}

}
