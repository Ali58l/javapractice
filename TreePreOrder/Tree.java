//import TreeNode;

public class Tree{
	private TreeNode root;
	
	public TreeNode getRoot(){
		return root;
	}
	
	public static void main(String[] args){
		Tree tree = new Tree();
		tree.createSampleTree(); 
		tree.printPreOrder();
	}
	
	public void createSampleTree(){
		root = new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3, new TreeNode(6), new TreeNode(7)));
	}
	
	public void printPreOrder(){
		printPreOrder(root);
	}
	
	public void printPreOrder(TreeNode root){
		if (root == null)
			return;
		System.out.print(root.getData() + " " );
		printPreOrder(root.getLeft());		
		printPreOrder(root.getRight());		
	}

}
