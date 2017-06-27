package package2;

import java.util.Stack;

/**
 * 题目描述
 * 输入两个整数序列，第一个序列表示栈的压入顺序，
 * 请判断第二个序列是否为该栈的弹出顺序。假设压入栈的所有数字均不相等。
 * 例如序列1,2,3,4,5是某栈的压入顺序，序列4，5,3,2,1是该压栈序列对应的一个弹出序列，
 * 但4,3,5,1,2就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）
 * @author bo 
 *
 */
public class question21 {
	public static boolean IsPopOrder(int [] pushA,int [] popA) {
		Stack<Integer> tmpStack = new Stack<Integer>();//辅助栈
		int index_pushA = 0;//index_pushA指向当前未入栈的第一个元素
		for(int i = 0; i < popA.length ;i++){
			//判断当前出栈的元素是不是栈顶元素,如果是，直接出栈
			if(!tmpStack.isEmpty() && popA[i] == tmpStack.peek()){
				tmpStack.pop();
				continue;
			}
			//如果不是栈顶元素，则去未入栈的元素中找，一直找到底，如果没找到，说明不可能是弹出序列
			int j;
			boolean flag = false;
			for(j = index_pushA; j < pushA.length; j++){
				tmpStack.push(pushA[j]);
				index_pushA++;
				if(pushA[j] == popA[i]){
					flag = true;
					tmpStack.pop();
					break;
				}
			}
			if(flag == false){
				//说明没有找到,则直接返回false
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		int []pushA = {1,2,3,4,5};
		int []popA = {4,5,3,2,1};
		boolean isPopOrder = IsPopOrder(pushA, popA);
		System.out.println(isPopOrder);
	}
}
