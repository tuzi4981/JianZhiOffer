package package1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 输入一个链表，从尾到头打印链表每个节点的值。
 * @author xiebo
 * 思路：遍历原有链表，用头插法生成一个新的单链表，这个单链表的顺序就和原来的相反。
 */

class ListNode {
	int val;
	ListNode next = null;

	ListNode(int val) {
		this.val = val;
	}
}

public class question3 {
	public static void main(String[] args) {
		ListNode listNode = null;
		listNode = createNewList();
		ArrayList<Integer> printListFromTailToHead = printListFromTailToHead(listNode);
		if(printListFromTailToHead != null)
		{	
			for (Integer integer : printListFromTailToHead) {
				System.out.println(integer);
			}
		}
	}
	public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		if(listNode == null) return result;
		ListNode head2 = new ListNode(listNode.val);
		while(listNode.next != null){
			listNode = listNode.next;
			ListNode newNode = new ListNode(listNode.val);
			newNode.next = head2;
			head2 = newNode;
		}
		while(head2 != null){
			result.add(head2.val);
			head2 = head2.next;
		}
		return result;
	}
	
	/*----------------测试用---------------------------*/
	public static ListNode createNewList(){
		ListNode listNode = new ListNode(1);
		ListNode head = listNode;
		for(int i = 2; i < 10; i++){
			ListNode node = new ListNode(i);
			listNode.next = node;
			listNode = node;
		}
		return head;
	}
	public static void printList(ListNode listNode){
		while(listNode != null){
			System.out.println(listNode.val);
			listNode = listNode.next;
		}
	}
	/*-------------------------------------------*/
}
