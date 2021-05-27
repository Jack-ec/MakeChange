import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MakeChange {

	final static int TOONIES = 2;
	final static int LOONIES = 1;
	final static double QUARTERS = 0.25;
	final static double DIMES = 0.10;
	final static double NICKELS= 0.05;

	public static void main(String args[]) throws Exception{

		double number = 0;
		boolean valid = false;

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("What is your dollar amount?:");
		try {
			String input = reader.readLine();
			number = Double.parseDouble(input);
			valid = true;
		} catch (Exception e) {
			System.out.println("INVALID");
		}

		if (valid) {
			number = NICKELS*(Math.round(number/NICKELS));

			int numberOfToonies = (int)(number / TOONIES);
			double remainder = (number % TOONIES);

			int numberOfLoonies = (int)(remainder / LOONIES);
			remainder = (remainder % LOONIES);  

			double numberOfQuarters = (int)(remainder / QUARTERS);
			remainder = (remainder % QUARTERS);  

			double numberOfDimes = (int)(remainder / DIMES);
			remainder = (remainder % DIMES);  

			double numberOfNickels = (int)(remainder / NICKELS);
			remainder = (remainder % NICKELS);  

			System.out.println("toonies:"  + numberOfToonies + "; loonies:" + numberOfLoonies + "; quarters:" + (int)numberOfQuarters + "; dimes:" + (int)numberOfDimes + "; nickels:" + (int)numberOfNickels);
			

		}
	}
	
}
