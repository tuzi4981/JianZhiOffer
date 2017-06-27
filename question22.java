package package2;
import java.util.ArrayList;
import java.util.LinkedList;

class TreeNode {
	int val = 0;
	TreeNode left = null;
	TreeNode right = null;

	public TreeNode(int val) {
		this.val = val;
	}

}

public class question22 {
	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
		LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
		ArrayList<Integer> result = new ArrayList<Integer>();
		if(root == null) return result;
		queue.offer(root);
		while(!queue.isEmpty()){
			TreeNode node = queue.poll();
			result.add(node.val);
			if(node.left != null)
				queue.offer(node.left);
			if(node.right != null)
				queue.offer(node.right);
		}
		return result;
	}
	
}
