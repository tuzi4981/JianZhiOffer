package question26_30;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

/**
 * 题目描述
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。
 * 例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。 
 * 输入描述:
 * 输入一个字符串,长度不超过9(可能有字符重复),字符只包括大小写字母。
 * @author xiebo
 * 思路：使用递归的思想，将字符串分成两部分，第一部分是第一个字符，第二部分是剩下的字符
 * 每次递归返回的都是第二部分的所有排列，所以只需要将第一部分和每个排列的每个字符交换位置，得到的就是结果。
 */
public class question27{
	public static HashSet<String> result = new HashSet<String>();//使用Set是为了保证加入的字符串不重复
	public static ArrayList<String> Permutation(String str){
		ArrayList<String> returnResult = new ArrayList<>();
		if(str.length() <= 0) return returnResult;
		StringOrder(str);
		returnResult.addAll(result);
		//对结果按照字典顺序重排序
		Collections.sort(returnResult);
		return returnResult;
	}
	public static void StringOrder(String str) {
		if(str.length() == 1){
			result.add(str);
			return ;
		}
		//将字符串分成两部分，第一部分是第一个字符，第二部分是剩下的字符
		StringOrder(str.substring(1, str.length()));
		HashSet<String> tmpSet = new HashSet<String>();
		//添加以第一个元素开头的序列
		for(Iterator it = result.iterator(); it.hasNext();){
			tmpSet.add(new String(str.substring(0, 1) + it.next().toString()));
		}
		//将第一个元素分别和后面的元素进行互换
		for(Iterator it = result.iterator(); it.hasNext();){
			String str_in_result = it.next().toString();
			for(int j = 0; j < str_in_result.length(); j++){
				tmpSet.add( swap(str.substring(0,1), str_in_result, j) );
			}
		}
		result = tmpSet;
	}
	public static String swap(String str1, String str2, int i){
		StringBuilder result = new StringBuilder(str2);
		result.setCharAt(i, str1.charAt(0));
		result.insert(0, str2.charAt(i));
		return result.toString();
	}
	public static void main(String[] args) {
		ArrayList<String> result = Permutation("abc");
		for(String str : result){
			System.out.print(str + " ");
		}
	}

}
