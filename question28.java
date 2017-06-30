package question26_30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 题目描述
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
 * 由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 * @author xiebo
 * 思路：每次消除数组中两个不相同的元素，直到消除不了，剩下的那个元素或者那些相同的元素就是这个数字，
 * 在找出这个数字之后再返回数组中检查是否正确。
 */
public class question28 {
	public static int MoreThanHalfNum_Solution(int [] array) {
		boolean flag_pram_continue = true;
		int []array_copy = Arrays.copyOf(array, array.length);
		while(flag_pram_continue){
			int i = 0;
			//第一个元素和后面的元素比较，如果找到不相同的，就删除他们
			int firstElem = array[0];
			int secondElem;
			for(i = 1; i < array.length; i++){
				secondElem = array[i];
				if(firstElem != secondElem){
					//在数组中删除这两个元素
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
			//找完了数组都没有找到两个不同的元素或者数组中的元素已经被删完了，这个时候就退出循环
			if(i == array.length || array.length == 0){
				flag_pram_continue = false;
			}
		}
		//到这里说明已经删除完了所有不相同的元素对，剩下的数组有两种可能，
		//第一种是有一个或多个元素，那么这个时候就需要回去检查这个元素是否是满足要求的
		//第二种情况是一个空数组，这种情况直接返回0就行
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
