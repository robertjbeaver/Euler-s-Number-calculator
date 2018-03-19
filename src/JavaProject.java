import java.util.Scanner;

public class JavaProject {

	public static void main(String[] args) {
		System.out.println("Welcome to the Code challange!");
		Scanner sc = new Scanner(System.in);
		String choice ="y";
		while(!choice.equalsIgnoreCase("n")) {
			double n = validDouble(sc);
			double e = calculateEuler(n);
			System.out.println("Euler's Number is: "+ e);
			System.out.print("Would you like to try and caluculate it again? (Y/N):  ");
			choice = getChoice(sc);		
			
		}	
		System.out.println("\nBye!");		

	}
	public static double validDouble(Scanner sc) {
		double i = 0;
		boolean isValid = false;
		while (!isValid) { 
			System.out.print("Please enter your value for n. Must be a real number above 0:  ");
			if (sc.hasNextDouble()) {
				i = sc.nextDouble();
					if(i > 0) isValid = true;
					else {
						System.out.println("Error. Please enter a valid number.");				
						sc.nextLine();
						continue;
					}
			} else {
				System.out.println("Error. Please enter a valid number.");
				// sc.nextLine();
			}
			sc.nextLine();
		} return i;
	}
	public static double calculateEuler(double n) {
		double e = Math.pow((1+1/n), n);
		return e;
	}
	public static String getChoice(Scanner sc) {
		String s = "";
		boolean isValid = false;
		while (!isValid) {
			s = sc.next();
			if(s.equalsIgnoreCase("y")||s.equalsIgnoreCase("n")) {
				isValid = true;
				sc.nextLine();
			} else {
				System.out.println("Please enter either Y or N");
				s = "";
				sc.nextLine();
			}
		}
		return s;
	}
}
