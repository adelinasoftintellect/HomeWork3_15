public class Main {

	public static void main(String[] args) {
		int n = 5;
		int k = 3;

		long factorialn = 1;
		long factorialk = 1;
		for (int i = 1; i <= n; i++) {
			factorialn *= i;
		}
		for (int j = 1; j <= k; j++) {
			factorialk *= j;
		}

		System.out.println(n + "! = " + factorialn);
		System.out.println(k + "! = " + factorialk);

		long a = (factorialn * factorialk) / (factorialn - factorialk);
		System.out.println("N!*K!/(N-K)!  = " + a);

	}
}
