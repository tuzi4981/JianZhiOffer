/*
题目描述
输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
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
    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1 == null && list2 == null) return null;
		ListNode list3 = null;
		ListNode head = null;
		ListNode listIt1 = list1;
		ListNode listIt2 = list2;
		while(listIt1 != null && listIt2 != null){
			ListNode node;
			if(listIt1.val < listIt2.val){
				node = new ListNode(listIt1.val);
				listIt1 = listIt1.next;
			}else{
				node = new ListNode(listIt2.val);
				listIt2 = listIt2.next;
			}
			if(list3 == null){
				list3 = node;
				head = list3;
			}else{
				list3.next = node;
				list3 = node;
			}
		}
		ListNode lastIt;
		if(listIt1 != null){
			lastIt = listIt1;
		}else{
			lastIt = listIt2;
		}
		while(lastIt != null){
			ListNode node = new ListNode(lastIt.val);
			if(list3 == null){
				list3 = node;
				head = list3;
			}else{
				list3.next = node;
				list3 = node;
				
			}
            lastIt = lastIt.next;
		}
		return head;
    }
}