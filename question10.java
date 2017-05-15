package package1;
/**
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
 * 请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，
 * 总共有多少种方法？
 * 思路：依旧是斐波那契。。
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
