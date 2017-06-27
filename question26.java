package question26_30;
/**
 * ��Ŀ����
 * ����һ�ö��������������ö���������ת����һ�������˫������
 * Ҫ���ܴ����κ��µĽ�㣬ֻ�ܵ������н��ָ���ָ��
 * @author xiebo
 * ˼·����������ı��Σ���һ���ڵ㱣��ÿ�����������ǰһ���ڵ㡣
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
