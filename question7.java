package package1;
/**
 * ��Ҷ�֪��쳲��������У�����Ҫ������һ������n���������쳲��������еĵ�n�
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
