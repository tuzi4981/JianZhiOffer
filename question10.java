package package1;
/**
 * ���ǿ�����2*1��С���κ��Ż�������ȥ���Ǹ���ľ��Ρ�
 * ������n��2*1��С�������ص��ظ���һ��2*n�Ĵ���Σ�
 * �ܹ��ж����ַ�����
 * ˼·��������쳲���������
 * @author bo
 *
 */
public class question10 {
	public static void main(String[] args) {

	}
	public int RectCover(int target) {
		int first = 1;
		int second = 2;
		if(target == 1)return 1;
		if(target ==2)return 2;
		int result = 0;
		for(int i = 3; i <= target; i++){
			result = first + second;
			first = second;
			second = result;
		}
		return result;
	}
}
