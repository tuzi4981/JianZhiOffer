package package1;
/**
 * һֻ����һ�ο�������1��̨�ף�Ҳ��������2����
 * �����������һ��n����̨���ܹ��ж�����������
 * @author bo
 *
 */
public class question8 {
	public int JumpFloor(int target) {
		int first = 1;
		int second = 2;
		int result = 0;
		if (target == 1) return 1;
		if (target == 2) return 2;
		for(int i = 3; i <= target; i++){
			result = first + second;
			first = second;
			second = result;
		}
		return result;

    }
}
