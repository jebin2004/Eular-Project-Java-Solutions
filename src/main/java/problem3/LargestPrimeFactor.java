package problem3;

public class LargestPrimeFactor {
	public static void main(String[] args) {
		LargestPrimeFactor.findLargestPrimeFactor(600851475143L);
	}

	public static void findLargestPrimeFactor(long number) {
		int largestPrime = 0;
		for (int i = 2; i * i <= number; i++) {
			if (number % i == 0) {
				while (number % i == 0) {
					number = number / i;
					largestPrime = i;
				}
			}
		}
		if (number != 1) {
			System.out.println("Largest Prime Factor: " + number);
		} else {
			System.out.println("Largest Prime Factor: " + largestPrime);
		}

	}
}
