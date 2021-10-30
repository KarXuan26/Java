import java.util.Random;

public class Selection {
	public static void main(String[] args) {
		Random random = new Random();
		int number = random.nextInt();
		
		System.out.println("number = " + number);
		
		if (number < 0)
			System.out.println("number is less than 0");
		
		else 
			if (number > 0)
				System.out.println("number is more than 0");
			
			else
				System.out.println("number is equals to 0");
		
	}
}
