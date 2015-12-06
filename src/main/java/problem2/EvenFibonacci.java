package problem2;

public class EvenFibonacci {
	public static void main(String[] args) {
		EvenFibonacci.sumOfEvenFibonacci(4000000);
	}

	public static void sumOfEvenFibonacci(int x) {
		int a = 1, b = 1;
		int ans = 0, result = 0;
		while (ans < x) {
			ans = a + ans;
			a = b;
			b = ans;
			if (ans % 2 == 0) {
				result += ans;
			}
		}
		System.out.println(result);
	}
}
