import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = sc.nextLine();
		System.out.println("Enter timesOutput: ");
		int timesOutput = sc.nextInt();
		for (int i = 0; i < timesOutput; i++) {
			System.out.println(name);
		}
		

		
	}
}
