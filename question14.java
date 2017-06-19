/*
题目描述
输入一个链表，输出该链表中倒数第k个结点。
author : bo
*/

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Solution {
    public ListNode FindKthToTail(ListNode head,int k) {
       if(head == null) return null;
        if(k == 0) return null;
		ListNode first,second;
		first = head;
		second = head;
		int count = 1;
		while(head.next != null){
			first = first.next;
			if(count >= k){
				second = second.next;
			}
			count++;
			head = head.next;
		}
		if(count < k) return null;
		return second;
    }
}