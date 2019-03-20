import java.util.Scanner;
public class PostalStamp {

	public static void main(String[] args) {
		System.out.print("Enter a weights in ounce for letters to mail out. \n"
				+ "When you are done entering, please enter -1 to finish: ");
		Scanner src= new Scanner(System.in);
		double ounces = src.nextDouble();
		
		while (ounces > -1) {
			if (ounces<1) 
				System.out.println("You can use forever stamp");
			else 
				System.out.println("You need additional postage than a forever stamp.");
			System.out.print(
					"Enter a weights in ounce for letters to mail out. \n"
					+ "When you are done entering, please enter -1 to finish: ");
			
			ounces=src.nextDouble();
		}
		System.out.println("Good bye!!");
		src.close();

	}

}
