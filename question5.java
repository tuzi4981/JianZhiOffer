package package1;
/**
 * ������ջ��ʵ��һ�����У���ɶ��е�Push��Pop������ �����е�Ԫ��Ϊint���͡�
 */
import java.util.Stack;

public class question5 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
        if(stack1.capacity() == stack1.size()){
        	//ջ1������ջ1������push��ջ2�У������и�ǰ����ջ2�ǿյ�
        	if(stack2.isEmpty()){
        		//��ջ1������push��ջ2��
        		while(stack1.size() > 0){
        			stack2.push(stack1.pop());
        		}
        		stack1.push(node);
        	}else{
        		//ջ2��Ϊ�գ���ʱ�Ͳ�������ջ1��׷��������
        		System.out.println("stack1 is full!");
        	}
        }else{
        	//ջ1������ֱ��push
        	stack1.push(node);
        }
    }
    
    public int pop() {
    	if(stack2.size() > 0){
    		return stack2.pop();
    	}else{
    		//ջ2Ϊ��ʱ�������ʱջ1��Ϊ�գ���ջ1�е�������ջ1��ջ��˳��Push��ջ2�С����ջ1Ϊ�գ��򷵻�-1
    		if(stack1.size() > 0){
    			while(stack1.size() > 0){
    				stack2.push(stack1.pop());
    			}
    			return stack2.pop();
    		}else{
    			return -1;
    		}
    	}
    }
}
