import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String sentence = sc.nextLine();
		System.out.println(sentence.substring(0,sentence.length()));
		int start;
		String rev = "";
		int end = sentence.length();
		for(int i = sentence.length()-1; i >= 0; i--){
			String curr = sentence.substring(i, i+1);
			if (curr.equals(" ")){
				start = i+1;
				rev += sentence.substring(start, end);
				rev += " ";
				end = i;
			}
			
		}
		rev += sentence.substring(0, end);
		System.out.println(rev);

	}
}