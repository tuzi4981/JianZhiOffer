package package1;

import java.util.ArrayList;
import java.util.Arrays;
/**
 * ����ĳ��������ǰ���������������Ľ�������ؽ����ö�������
 * ���������ǰ���������������Ľ���ж������ظ������֡�
 * ��������ǰ���������{1,2,4,7,3,5,6,8}�������������{4,7,2,1,5,3,8,6}�����ؽ������������ء�
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
