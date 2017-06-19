/*
题目描述
给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
author : bo
*/
public class Solution {
    public double Power(double base, int exponent) {
        if(exponent == 0) return 1;
		double result = base;
		boolean flag = true;
		if(exponent < 0) {
			flag = false;
			exponent = -exponent;
		}
		for(int i = 1; i < exponent; i++){
			result = result * base;
		}
		if(flag == false) return 1.0/result;
		return result;
  }
}