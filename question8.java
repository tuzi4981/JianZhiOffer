package package1;
/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法。
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
