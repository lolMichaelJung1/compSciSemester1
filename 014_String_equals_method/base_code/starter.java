import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
	System.out.println("Input role");
	String lane = sc.nextLine();
	System.out.println("You are a wizard");
	String wizard = ("wizard");
	System.out.println("You chose " + lane);
	
	if (!lane.equals("wizard")) {
		System.out.println("You are a not a wizard");
	} else {
		System.out.println("You are a wizard");
	} 
	
	
		
	
	}
}
