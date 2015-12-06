package problem1;

public class MultiplesOf3Or5 {

	public static void main(String[] args) {
		MultiplesOf3Or5.sumOfMultiplesOf3Or5(10);
	}

	public static void sumOfMultiplesOf3Or5(int x) {
		int result = 0;
		for (int i = x - 1; i > 0; i--) {
			if (i % 3 == 0 || i % 5 == 0) {
				result += i;
			}
		}
		System.out.println(result);
	}

}
