package package1;
/**
 * һֻ����һ�ο�������1��̨�ף�Ҳ��������2��������Ҳ��������n����
 * �����������һ��n����̨���ܹ��ж�����������
 * @author bo
 *
 */
public class question9 {
	public static void main(String[] args) {
		int jumpFloorII = JumpFloorII(5);
		System.out.println(jumpFloorII);
	}
	public static int JumpFloorII(int target) {
		if(target == 1)return 1;
        int current = 1;
        for(int i = 2; i <= target; ++i){
            current *= 2;
        }
		return current;

	}
}
