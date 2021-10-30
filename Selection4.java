import java.util.Random;
public class Selection4 {
	public static void  main(String[] args) {
		Random random = new Random();
		float DemNum = random.nextFloat();
		
		System.out.println("Decimal Number = " + DemNum);
		
		if (DemNum < 0.0 || DemNum > 100.00) {
			System.out.println("It is not within 0 to 100");
		}
		else
			System.out.println("It is within 0 to 100");
		
		}
	}

