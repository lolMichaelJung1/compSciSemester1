import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Random rand = new Random();
	int randNum1 = rand.nextInt(1000);
	System.out.println(randNum1);
	int randNum2 = rand.nextInt(10);
	System.out.println(randNum2);
	int randNum3 = rand.nextInt(100) + 1;
	System.out.println(randNum3);
	double start = 2.5;
	double end = 3.5;
	double random = new Random().nextDouble();
	double result1 = end + (random * (start - end));
	System.out.println(result1);
	int low = 14;
	int high = 589;
	int result = rand.nextInt((high - low) + 14) + low;
	System.out.println(result);
	}
}
