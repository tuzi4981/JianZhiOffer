package question26_30;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

/**
 * ��Ŀ����
 * ����һ���ַ���,���ֵ����ӡ�����ַ������ַ����������С�
 * ���������ַ���abc,���ӡ�����ַ�a,b,c�������г����������ַ���abc,acb,bac,bca,cab��cba�� 
 * ��������:
 * ����һ���ַ���,���Ȳ�����9(�������ַ��ظ�),�ַ�ֻ������Сд��ĸ��
 * @author xiebo
 * ˼·��ʹ�õݹ��˼�룬���ַ����ֳ������֣���һ�����ǵ�һ���ַ����ڶ�������ʣ�µ��ַ�
 * ÿ�εݹ鷵�صĶ��ǵڶ����ֵ��������У�����ֻ��Ҫ����һ���ֺ�ÿ�����е�ÿ���ַ�����λ�ã��õ��ľ��ǽ����
 */
public class question27{
	public static HashSet<String> result = new HashSet<String>();//ʹ��Set��Ϊ�˱�֤������ַ������ظ�
	public static ArrayList<String> Permutation(String str){
		ArrayList<String> returnResult = new ArrayList<>();
		if(str.length() <= 0) return returnResult;
		StringOrder(str);
		returnResult.addAll(result);
		//�Խ�������ֵ�˳��������
		Collections.sort(returnResult);
		return returnResult;
	}
	public static void StringOrder(String str) {
		if(str.length() == 1){
			result.add(str);
			return ;
		}
		//���ַ����ֳ������֣���һ�����ǵ�һ���ַ����ڶ�������ʣ�µ��ַ�
		StringOrder(str.substring(1, str.length()));
		HashSet<String> tmpSet = new HashSet<String>();
		//����Ե�һ��Ԫ�ؿ�ͷ������
		for(Iterator it = result.iterator(); it.hasNext();){
			tmpSet.add(new String(str.substring(0, 1) + it.next().toString()));
		}
		//����һ��Ԫ�طֱ�ͺ����Ԫ�ؽ��л���
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
