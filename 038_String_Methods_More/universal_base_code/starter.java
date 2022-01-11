import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = sc.nextLine();
		System.out.println(name.substring(0,name.length()));
		for(int i = 0; i < name.length(); i++){
			System.out.println(name.charAt(i));
		}
		
		int space = name.indexOf(" ");
		System.out.println("Last name: ");
		System.out.println(name.substring(space,name.length()));
		
	}
}
