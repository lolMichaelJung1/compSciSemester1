import java.util.Scanner;
import java.util.Random;
class starter  {
	public static void main(String args[]) {
		Random rand = new Random();
		int[] x = new int[20];
		for (int i = 0; i < x.length; i++){
			x[i] = rand.nextInt(50)+1;
			System.out.println(x[i]);
		}
		int[] y = new int[20];
		for (int i = 0; i < y.length; i++){
			y[i] = x[19 - i];
			
		}
		for (int i = 0; i < y.length; i++){
			System.out.println(y[i]);
			
		}
	}
}

