    
public class SquareOfThree  {
  public static void main(String[]args) {
		int x = 0;
		int sum = 0;

		while (x != 33) {

			x = x + 3;
			sum = sum + x * x;
			// System.out.printf("Cumulation result: " + sum + " : " + x + " * " + x);
			System.out.printf("Cumulation result: %8d%8s%8d%8s%8d \n", sum, ":", x, "*", x);
		}
		System.out.println("The SUM of the squares of multiples of 3 is: " + sum);

     
  }
}
