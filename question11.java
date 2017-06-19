/*
题目描述
输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
author : bo
*/
public class Solution {
    public int NumberOf1(int n) {
	int count = 0;
		boolean flag = true;
		if(n < 0){
			n = -n;
			n--;
			flag = false;
		}
		while(n != 0){
			if(n%2 == 1)
				count++;
			n /= 2;
		}
		if(flag == false) return 32-count;
		return count;
    }
}