package package2;
/**
 * ��Ŀ����
 * ����һ�Ŷ�������һ����������ӡ���������н��ֵ�ĺ�Ϊ��������������·����
 * ·������Ϊ�����ĸ���㿪ʼ����һֱ��Ҷ����������Ľ���γ�һ��·����
 * @author xiebo
 * ˼·������ǰ�������˼�룬ǰ������ö�������������List���ÿ��·���������Ľڵ㣬
 * ��������Ҷ�ӽڵ�ʱ����������������Ͱ�����·�����뵽path�У�����ֱ�ӻ��ݲ���ɾ��list�е�ǰ�ڵ㡣
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
			//�Ѿ���������Ҷ�ӽڵ�
			if(0 == target){
				//�������·������ڵ�ֵ֮��ΪĿ��ֵ������Ӹ���·����path�С�
				path.add(new ArrayList<Integer>(list));
			}
		}else{
			//��û�б�����Ҷ�ӽڵ�,��ô����Ҫ�жϵ�ǰ·��ֵ�ܺ���û�г���Ŀ��ֵ������Ѿ������ˣ���ֱ�ӻ��ݡ�
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
		//���ݵ�ʱ��ɾ����ǰ�ڵ�
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
