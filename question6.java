package package1;
/**
 * ��һ�������ʼ�����ɸ�Ԫ�ذᵽ�����ĩβ�����ǳ�֮Ϊ�������ת��
 * ����һ���ǵݼ�����������һ����ת�������ת�������СԪ�ء�
 * ��������{3,4,5,1,2}Ϊ{1,2,3,4,5}��һ����ת�����������СֵΪ1��
 * NOTE������������Ԫ�ض�����0���������СΪ0���뷵��0��
 * @author bo
 *
 */
public class question6 {
	public static void main(String[] args) {
		int []array = {7,8,9,10,1,2,3,4,5};
		int minNumberInRotateArray = minNumberInRotateArray(array);
		System.out.println(minNumberInRotateArray);
	}
	public static int minNumberInRotateArray(int [] array) {
		if(array.length == 0) return -1;
		int low = 0;
		int high = array.length-1;
		int mid = (low + high)/2;
		//����˼�����ö��ַ����ң�����Ҫ����һЩ�߽�����Ͳ����ϸ���������
		while(low < high){
			if(array[mid] > array[high]){
				low = mid + 1;
			}else if(array[mid] < array[high]){
				high = mid;
			}else if(array[mid] == array[high]){
				high = high - 1;
			}
			mid = (low + high)/2;
		}
		return array[mid];
	}
}
