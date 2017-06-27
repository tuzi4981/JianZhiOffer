package package2;
/**
 * 题目描述
 * 输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针指向任意一个节点），
 * 返回结果为复制后复杂链表的head。（注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
 * @author xiebo
 *
 */
class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
public class question25 {
	public static RandomListNode Clone(RandomListNode pHead)
    {
		RandomListNode point;//定义一个用来遍历的指针
		point = pHead;
		//先复制每个节点，放在初始节点的后面
		while(point != null){
			RandomListNode tmpNode = new RandomListNode(point.label);
			tmpNode.next = point.next;
			point.next = tmpNode;
			
			point = tmpNode.next;
		}
		//再复制每个节点的random指针
		point = pHead;
//		int count = 1;
		while(point != null){
			//操作奇数位置上random指针不为空的节点
			if(point.random != null){
				point.next.random = point.random.next;
			}
			point = point.next.next;
//			count++;
		}
		//最后删除初始节点
		RandomListNode head = pHead.next;
		point = head;
		while(point.next != null){
			point.next = point.next.next;
			point = point.next;
		}
        return head;
    }
	public static void printList(RandomListNode head){
		System.out.println();
		while(head != null){
			System.out.print(head.label + " ");
			head = head.next;
		}
	}
	public static void main(String[] args) {
		RandomListNode pHead = new RandomListNode(1);
		pHead.next = new RandomListNode(2);
		pHead.next.next = new RandomListNode(3);
		pHead.next.next.next = new RandomListNode(4);
		pHead.next.next.next.next = new RandomListNode(5);
		pHead.random = pHead.next.next;
		pHead.next.random = pHead.next.next.next.next;
		pHead.next.next.next.random = pHead.next;
		RandomListNode clone = Clone(pHead);
		
		while(clone != null){
			System.out.print(clone.label + " ");
			clone = clone.next;
		}
	}
}
