package package1;
/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法。
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
