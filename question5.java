package package1;
/**
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 */
import java.util.Stack;

public class question5 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
        if(stack1.capacity() == stack1.size()){
        	//栈1满，将栈1的数据push到栈2中，但是有个前提是栈2是空的
        	if(stack2.isEmpty()){
        		//将栈1的数据push到栈2中
        		while(stack1.size() > 0){
        			stack2.push(stack1.pop());
        		}
        		stack1.push(node);
        	}else{
        		//栈2不为空，此时就不能再往栈1中追加数据了
        		System.out.println("stack1 is full!");
        	}
        }else{
        	//栈1不满，直接push
        	stack1.push(node);
        }
    }
    
    public int pop() {
    	if(stack2.size() > 0){
    		return stack2.pop();
    	}else{
    		//栈2为空时，如果此时栈1不为空，则将栈1中的数据以栈1出栈的顺序Push到栈2中。如果栈1为空，则返回-1
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
