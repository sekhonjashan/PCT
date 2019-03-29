package Lab;

import java.awt.HeadlessException;
import java.util.Scanner;


public class CheckAVL {

	public class Node{
		int key;
		Node left;
		Node right;
		public Node(int key) {
			this.key = key;
			left = right = null;
		}
	}
	

	public Node insertNode(Node node,int key) {
		if (node == null) 
			return (new Node(key));
		else {
			if (key <= node.key) {
				node.left = insertNode(node.left, key);
			}else {
				node.right = insertNode(node.right, key);
			}
		}
		
		return node;
		
	}
	
	public void preOrder(Node node) {
		if(node==null) {
			return;
		}
		System.out.print(node.key + " ");
		preOrder(node.left);
		preOrder(node.right);
	}
	
	
	public boolean isAVL(Node node) {
		
		if (node == null) {
			return true;
		}
		else {
			int lh = hieght(node.left);
			System.out.println(lh);
			int rh = hieght(node.right);
			System.out.println(rh);
			if( lh - rh == 0) {
				return true;
			}else {
				return false;
			}
		}
	}

	 
		private int hieght(Node node) {

			if(node == null) {
				return 0;
			}
			else {
				
				return 1 + Math.max(hieght(node.left),hieght(node.right));
			}
			
			
	}

	//4 2 6 3 5 7 1 -1	 
	//7 5 8 3 12 23 9 27 55 33 2 -1
	public static void main(String[] args) {
		
		CheckAVL tree = new CheckAVL();
		Node root = null;
		Scanner sc = new Scanner(System.in);
		
		root = tree.insertNode(root, sc.nextInt());
		
		while(true) {
			int key = sc.nextInt();
			if(key !=-1) {
				tree.insertNode(root, key);	
			}else {
				break;
			}
		}
		
		if(tree.isAVL(root) == true){
			tree.preOrder(root);
		}else {
			System.out.println("NOT");
		}
		
	}

}
