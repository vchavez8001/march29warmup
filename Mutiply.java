public class Multiply {
	public static void main(String[] args) {

		Multiply w1 = new Multiply();
		System.out.println(w1.multiply(5, 6));

		System.out.println(Multiply.multiplyStatic(4, 1));

		multiplyStaticVoid(3, 9);

		Multiply w2 = new Multiply();
		w2.multiplyNonStaticVoid(8, 2);

	}

	public int multiply(int num1, int num2) {
		return (num1 * num2);
	}

	public static int multiplyStatic(int num1, int num2) {
		return (num1 * num2);
	}

	public static void multiplyStaticVoid(int num1, int num2) {
		System.out.println(num1 * num2);
	}

	public void multiplyNonStaticVoid(int num1, int num2) {
		System.out.println(num1 * num2);
	}

}
