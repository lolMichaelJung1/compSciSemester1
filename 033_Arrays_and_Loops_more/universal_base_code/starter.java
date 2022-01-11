
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Random rand = new Random();
		int[] y = new int [rand.nextInt(51)+200];
		for (int i = 0; i < y.length; i++){
		y[i] = rand.nextInt(100)+1;
		System.out.println(y[i]);

		
	}
}
}