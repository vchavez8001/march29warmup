public class Subtract {
	public static void main(String[] args) {
		Subtract w1 = new Subtract();
		System.out.println(w1.subtract(8, 2));

		subtractStatic(3, -5);

	}

	public int subtract(int num1, int num2) {
		return (num1 - num2);
	}

	public static int subtractStatic(int num1, int num2) {
		return (num1 - num2);
	}

	public static void subtractStaticVoid(int num1, int num2) {
		System.out.println(num1 - num2);
	}

	public void subtractNonStaticVoid(int num1, int num2) {
		System.out.println(num1 - num2);
	}

}
