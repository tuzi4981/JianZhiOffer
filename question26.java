package question26_30;
/**
 * 题目描述
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
 * 要求不能创建任何新的结点，只能调整树中结点指针的指向。
 * @author xiebo
 * 思路：中序遍历的变形，用一个节点保存每次中序遍历的前一个节点。
 */
class TreeNode {
	int val = 0;
	TreeNode left = null;
	TreeNode right = null;
	public TreeNode(int val) {
		this.val = val;
	}
}
public class question26 {
	public static TreeNode preNode = null;
	public static TreeNode Convert(TreeNode pRootOfTree) {
		if(pRootOfTree == null) return null;
		ConvertSub(pRootOfTree);
		while(pRootOfTree.left != null){
			pRootOfTree = pRootOfTree.left;
		}
		return pRootOfTree;
	}
	public static void ConvertSub(TreeNode node){
		if (node == null) return ;
		ConvertSub(node.left);
		if(preNode == null){
			preNode = node;
		}else{
			node.left = preNode;
			preNode.right = node;
			preNode = node;
		}
		ConvertSub(node.right);
	}
	public static void printTreeNode(TreeNode root){
		while(root != null){
			System.out.print(root.val + " ");
			root = root.right;
		}
	}
	public static void main(String[] args) {
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(6);
		root.right = new TreeNode(14);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(8);
		root.right.left = new TreeNode(12);
		root.right.right = new TreeNode(16);
		TreeNode convert = Convert(root);
		printTreeNode(convert);
	}
}
