import java.util.*;
public class BTree {

	static Scanner sc = null;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		Node root = createTree();
		System.out.println("InOrder Traversal");
		inOrderTraversal(root);
		System.out.println("\nPreOrder Traversal");
		preOrderTraversal(root);
		System.out.println("\nPostOrder Traversal");
		postOrderTraversal(root);

	} 
	static Node createTree() {
		Node root = null;
		System.out.print("Enter data: ");
		int data = sc.nextInt();
		if(data == -1)
		{
			return null;
		}
		root = new Node(data);
		System.out.println("Enter data in left of" + data);
		root.left = createTree();
		System.out.println("Enter data in right of" + data);
		root.right = createTree();
		return root;
	}

	static void inOrderTraversal(Node node)
	{
		if(node == null)
		{
			return;
	
		}
		inOrderTraversal(node.left);
		System.out.print(node.data);
		inOrderTraversal(node.right);
	}

	static void preOrderTraversal(Node node)
	{
		if(node == null)
		{
			return;
		}
		System.out.print(node.data);
		preOrderTraversal(node.left);
		preOrderTraversal(node.right);
	}

	static void postOrderTraversal(Node node)
	{
		if(node == null)
		{
			return;
		}
		postOrderTraversal(node.left);
		postOrderTraversal(node.right);
		System.out.print(node.data);

	}
}
 class Node{
		Node left, right;
		int data;
		Node(int data)
		{
			this.data = data;
		}
	}