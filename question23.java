package package2;

import java.util.Arrays;

/**
 * ��Ŀ����
 * ����һ���������飬�жϸ������ǲ���ĳ�����������ĺ�������Ľ����
 * ����������Yes,�������No���������������������������ֶ�������ͬ��
 * @author xiebo
 * ˼·�����ݺ�����������һ��Ԫ��Ϊ���ڵ㣬��������������Ը��ڵ��ֵ�ܰ�����ֳ������֣�
 *       ����һ���ֶ��ȸ��ڵ�С����һ���ֶ��ȸ��ڵ������ֻҪ�������������ʾ��Ǻ��������Ľ����
 */
public class question23 {
	public static boolean VerifySquenceOfBST(int [] sequence) {
		if(sequence.length == 0) return false;
		return subVerifySquenceOfBST(sequence);
		
	}
	private static boolean subVerifySquenceOfBST(int[] sequence) {
		if(sequence.length == 0 || sequence.length == 1) return true;
		int midElem = sequence[sequence.length-1];
		int index = 0;
		for(int i = 0; i < sequence.length; i++){
			if(sequence[i] > midElem){
				index = i;
				break;
			}
			if(i == sequence.length-1){
				index = i;
			}
		}
		for(int i = index; i < sequence.length-1; i++){
			//��index�±꿪ʼ�������Ƿ�����Ԫ�ض�С��midElem
			if(sequence[i] < midElem){
				return false;
			}
		}
		//�ݹ���ж���������������
		return (subVerifySquenceOfBST(Arrays.copyOfRange(sequence, 0, index)) && subVerifySquenceOfBST(Arrays.copyOfRange(sequence, index, sequence.length-1)));
	}
	public static void main(String[] args) {
		int []sequence = {4,6,7,5};
		boolean verifySquenceOfBST = VerifySquenceOfBST(sequence);
		System.out.println(verifySquenceOfBST);
	}
}
