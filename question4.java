package package1;

import java.util.ArrayList;
import java.util.Arrays;
/**
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 * @author bo
 *
 */
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}

public class question4 {
	public static TreeNode reConstructBinaryTree(int [] pre,int [] in) {
		if(pre.length > 0){
			TreeNode node = new TreeNode(pre[0]);
			int i;
			for(i = 0; i < in.length; ++i){
				if(in[i] == node.val){
					break;
				}
			}
			node.left = reConstructBinaryTree(Arrays.copyOfRange(pre, 1, i+1), Arrays.copyOfRange(in, 0, i));
			node.right = reConstructBinaryTree(Arrays.copyOfRange(pre, i+1, pre.length), Arrays.copyOfRange(in, i+1, in.length));
			return node;
		}else{
			return null;
		}
	}
	public static void main(String[] args) {
		int a[] = {1,2,4,5,3,6,7};
		int b[] = {4,2,5,1,6,3,7};
		TreeNode node = reConstructBinaryTree(a, b);
		System.out.println(node.val + " " + node.left.val + " " +node.left.left.val);
	}
}
