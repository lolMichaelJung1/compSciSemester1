import java.util.Scanner;
import java.util.Random;

class multipliedNumbers {
	
	public static String multiplyDivide(int x, int y){
		int num1 = x;
		int num2 = y;
		int result = num1 * num2;
		if (result % 3 == 0) {
			return "The number is divisible by 3";
		}
		else{
			return "The number is not divisble by 3";
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter numbers");
		int a = sc.nextInt();
		System.out.println("enter numbers");
		int b = sc.nextInt();
		System.out.print(multiplyDivide(a,b));
		
	}
}

