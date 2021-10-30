import java.util.Random;

public class Selection3 {
	public static void  main(String[] args) {
		Random random = new Random();
		float num1 = random.nextFloat();
		System.out.println("number one = " + num1);
		
		float num2 = random.nextFloat();
		System.out.println("number two = " + num2);
		
		float num3 = random.nextFloat();
		System.out.println("number three = " + num3);
		
		if (num1 < num2 && num2 < num3) {
			System.out.println("number 1 has the smallest value");
		}
			else
				if (num1 > num2 && num2 > num3) {
					System.out.println("number 1 has the biggest value");
				}
				else
					System.out.println("No answer");
		}
}
