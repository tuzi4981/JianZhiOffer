package question26_30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ��Ŀ����
 * ��������һ�����ֳ��ֵĴ����������鳤�ȵ�һ�룬���ҳ�������֡�
 * ��������һ������Ϊ9������{1,2,3,2,2,2,5,4,2}��
 * ��������2�������г�����5�Σ��������鳤�ȵ�һ�룬������2����������������0��
 * @author xiebo
 * ˼·��ÿ��������������������ͬ��Ԫ�أ�ֱ���������ˣ�ʣ�µ��Ǹ�Ԫ�ػ�����Щ��ͬ��Ԫ�ؾ���������֣�
 * ���ҳ��������֮���ٷ��������м���Ƿ���ȷ��
 */
public class question28 {
	public static int MoreThanHalfNum_Solution(int [] array) {
		boolean flag_pram_continue = true;
		int []array_copy = Arrays.copyOf(array, array.length);
		while(flag_pram_continue){
			int i = 0;
			//��һ��Ԫ�غͺ����Ԫ�رȽϣ�����ҵ�����ͬ�ģ���ɾ������
			int firstElem = array[0];
			int secondElem;
			for(i = 1; i < array.length; i++){
				secondElem = array[i];
				if(firstElem != secondElem){
					//��������ɾ��������Ԫ��
					int []new_array = new int[array.length-2];
					int count = 0;
					for(int j = 1; j < array.length; j++){
						if(j != i){
							new_array[count++] = array[j];
						}
					}
					array = new_array;
					break;
				}
			}
			//���������鶼û���ҵ�������ͬ��Ԫ�ػ��������е�Ԫ���Ѿ���ɾ���ˣ����ʱ����˳�ѭ��
			if(i == array.length || array.length == 0){
				flag_pram_continue = false;
			}
		}
		//������˵���Ѿ�ɾ���������в���ͬ��Ԫ�ضԣ�ʣ�µ����������ֿ��ܣ�
		//��һ������һ������Ԫ�أ���ô���ʱ�����Ҫ��ȥ������Ԫ���Ƿ�������Ҫ���
		//�ڶ��������һ�������飬�������ֱ�ӷ���0����
		if(array.length >= 1){
			int resultElem = array[0];
			int count = 0;
			for(int i = 0; i < array_copy.length; i++){
				if(array_copy[i] == resultElem) count++;
			}
			if(count > array_copy.length/2 ) {
				return resultElem;
			}else{
				return 0;
			}
		}
		else {
			return 0;
		}
	}
	public static void main(String[] args) {
		int []arr = {4,2,1,4,2,4};
		int moreThanHalfNum_Solution = MoreThanHalfNum_Solution(arr);
		System.out.println(moreThanHalfNum_Solution);
	}
}
