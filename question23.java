package package2;

import java.util.Arrays;

/**
 * 题目描述
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 * @author xiebo
 * 思路：根据后序遍历的最后一个元素为根节点，后序遍历的数组以根节点的值能把数组分成两部分，
 *       其中一部分都比根节点小，另一部分都比根节点大，所以只要符合这样的性质就是后续遍历的结果。
 */
public class question23 {
	public static boolean VerifySquenceOfBST(int [] sequence) {
		if(sequence.length == 0) return false;
		return subVerifySquenceOfBST(sequence);
		
	}
	private static boolean subVerifySquenceOfBST(int[] sequence) {
		if(sequence.length == 0 || sequence.length == 1) return true;
		int midElem = sequence[sequence.length-1];
		int index = 0;
		for(int i = 0; i < sequence.length; i++){
			if(sequence[i] > midElem){
				index = i;
				break;
			}
			if(i == sequence.length-1){
				index = i;
			}
		}
		for(int i = index; i < sequence.length-1; i++){
			//从index下标开始往后检查是否所有元素都小于midElem
			if(sequence[i] < midElem){
				return false;
			}
		}
		//递归地判断左子树和右子树
		return (subVerifySquenceOfBST(Arrays.copyOfRange(sequence, 0, index)) && subVerifySquenceOfBST(Arrays.copyOfRange(sequence, index, sequence.length-1)));
	}
	public static void main(String[] args) {
		int []sequence = {4,6,7,5};
		boolean verifySquenceOfBST = VerifySquenceOfBST(sequence);
		System.out.println(verifySquenceOfBST);
	}
}
