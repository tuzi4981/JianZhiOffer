package package1;
/**
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项。
 * n<=39
 * @author bo
 *
 */
public class question7 {
	public static void main(String[] args) {
		
	}
	public static int Fibonacci(int n) {
		int first = 1;
		int second = 1;
		int result = 0;
		if (n == 1) return 1;
		if (n == 2) return 1;
		for(int i = 3; i <= n; i++){
			result = first + second;
			first = second;
			second = result;
		}
		return result;

    }
}
