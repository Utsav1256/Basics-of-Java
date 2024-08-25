package Tree;

public class BinaryTree {
	public Node root;
	
	public void preorderTraversal(Node root) {
		if(root == null) {
			return;
		}
		
		System.out.print(root.data + " ");
		preorderTraversal(root.left);
		preorderTraversal(root.right);
	}
	
	public void inorderTrapersal(Node root) {
		if(root == null) {
			return;
		}
		
		inorderTrapersal(root.left);
		System.out.print(root.data + " ");
		inorderTrapersal(root.right);
	}
	
	public void postorderTraversal(Node root) {
		if(root == null) {
			return;
		}
		
		postorderTraversal(root.left);
		postorderTraversal(root.right);
		System.out.print(root.data + " ");
	}
}
