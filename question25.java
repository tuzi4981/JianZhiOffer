package package2;
/**
 * ��Ŀ����
 * ����һ����������ÿ���ڵ����нڵ�ֵ���Լ�����ָ�룬һ��ָ����һ���ڵ㣬��һ������ָ��ָ������һ���ڵ㣩��
 * ���ؽ��Ϊ���ƺ��������head����ע�⣬���������벻Ҫ���ز����еĽڵ����ã�������������ֱ�ӷ��ؿգ�
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
		RandomListNode point;//����һ������������ָ��
		point = pHead;
		//�ȸ���ÿ���ڵ㣬���ڳ�ʼ�ڵ�ĺ���
		while(point != null){
			RandomListNode tmpNode = new RandomListNode(point.label);
			tmpNode.next = point.next;
			point.next = tmpNode;
			
			point = tmpNode.next;
		}
		//�ٸ���ÿ���ڵ��randomָ��
		point = pHead;
//		int count = 1;
		while(point != null){
			//��������λ����randomָ�벻Ϊ�յĽڵ�
			if(point.random != null){
				point.next.random = point.random.next;
			}
			point = point.next.next;
//			count++;
		}
		//���ɾ����ʼ�ڵ�
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
