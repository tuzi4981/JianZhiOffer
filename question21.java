package package2;

import java.util.Stack;

/**
 * ��Ŀ����
 * ���������������У���һ�����б�ʾջ��ѹ��˳��
 * ���жϵڶ��������Ƿ�Ϊ��ջ�ĵ���˳�򡣼���ѹ��ջ���������־�����ȡ�
 * ��������1,2,3,4,5��ĳջ��ѹ��˳������4��5,3,2,1�Ǹ�ѹջ���ж�Ӧ��һ���������У�
 * ��4,3,5,1,2�Ͳ������Ǹ�ѹջ���еĵ������С���ע�⣺���������еĳ�������ȵģ�
 * @author bo 
 *
 */
public class question21 {
	public static boolean IsPopOrder(int [] pushA,int [] popA) {
		Stack<Integer> tmpStack = new Stack<Integer>();//����ջ
		int index_pushA = 0;//index_pushAָ��ǰδ��ջ�ĵ�һ��Ԫ��
		for(int i = 0; i < popA.length ;i++){
			//�жϵ�ǰ��ջ��Ԫ���ǲ���ջ��Ԫ��,����ǣ�ֱ�ӳ�ջ
			if(!tmpStack.isEmpty() && popA[i] == tmpStack.peek()){
				tmpStack.pop();
				continue;
			}
			//�������ջ��Ԫ�أ���ȥδ��ջ��Ԫ�����ң�һֱ�ҵ��ף����û�ҵ���˵���������ǵ�������
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
				//˵��û���ҵ�,��ֱ�ӷ���false
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
