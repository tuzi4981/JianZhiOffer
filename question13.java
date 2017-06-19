/*
题目描述
输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
使得所有的奇数位于数组的前半部分，所有的偶数位于位于数组的后半部分，
并保证奇数和奇数，偶数和偶数之间的相对位置不变。
author : bo
*/
public class Solution {
    public void reOrderArray(int [] array) {
        int array_low = 0, array_high = array.length-1;
		int []result = new int[array.length];
		int result_low = 0, result_high = result.length-1;
		while(array_low <= array.length-1){
			if(array[array_low]%2 == 1){
				result[result_low] = array[array_low];
				result_low++;
			}
			if(array[array_high]%2 == 0){
				result[result_high] = array[array_high];
				result_high--;
			}
			array_low++;
			array_high--;
		}
        for(int i = 0; i < result.length; i++){
            array[i] = result[i];
        }
    }
}