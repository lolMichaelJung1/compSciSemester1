import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String name = sc.next();
		
		System.out.println("Enter age:");
		int age = sc.nextInt();
		
		System.out.println("Enter birthdayMonth:");
		int birhtdayMonth = sc.nextInt();
		
		System.out.println("Enter birhtdayDay:");
		int birhtdayDay = sc.nextInt();
		
		System.out.println("Enter birhtdayYear:");
		int birthdayYear = sc.nextInt();
		
		System.out.println("how much is a BuckFifty:");
		double BuckFifty = sc.nextDouble();
		
		System.out.println("Thank you " + name + ", you are " + age + " years old");
		
	
	
	}
}
