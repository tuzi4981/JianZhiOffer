/*
题目描述
输入一个链表，反转链表后，输出链表的所有元素。
author : bo
*/
/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode ReverseList(ListNode head) {
        if(head == null) return null;
		ListNode newHead = new ListNode(head.val);
		newHead.next = null;
		while(head.next != null){
			head = head.next;
			ListNode newNode = new ListNode(head.val);
			newNode.next = newHead;
			newHead = newNode;
		}
		return newHead;
    }
}