package package2;
/**
 * 题目描述
 * 输入一颗二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 * @author xiebo
 * 思路：采用前序遍历的思想，前序遍历该二叉排序树，用List存放每次路径所经过的节点，
 * 当遍历到叶子节点时，如果满足条件，就把这条路径加入到path中，否则直接回溯并且删除list中当前节点。
 */
import java.util.ArrayList;

public class question24 {
	public static ArrayList<ArrayList<Integer>> path = new ArrayList<ArrayList<Integer>>();
	public static ArrayList<Integer> list = new ArrayList<Integer>();
	public static ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
		if(null == root){
			return path;
		}
		target = target - root.val;
		list.add(root.val);
		if(root.left == null && root.right == null){
			//已经遍历到了叶子节点
			if(0 == target){
				//如果该条路径满足节点值之和为目标值，则添加该条路径到path中。
				path.add(new ArrayList<Integer>(list));
			}
		}else{
			//还没有遍历到叶子节点,那么就需要判断当前路径值总和有没有超过目标值，如果已经超过了，则直接回溯。
			if(target <= 0){

			}else{
				if(root.left != null){
					FindPath(root.left, target);
				}
				if(root.right != null){
					FindPath(root.right, target);
				}
			}
		}
		//回溯的时候删除当前节点
		list.remove(list.size()-1);
		target = target+root.val;
		return path;
	}
	public static void main(String[] args) {
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(5);
		root.right = new TreeNode(12);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(7);
		FindPath(root, 22);
	}
}
