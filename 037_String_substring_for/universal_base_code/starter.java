import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String word = sc.nextLine();
		System.out.println(word.length());
		System.out.println(word.substring(0,word.length()));
		for(int i = 0; i < word.length(); i++){
			System.out.println(word.charAt(i));
			
		}


		
	}
}
