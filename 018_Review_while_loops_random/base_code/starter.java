import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
int i = 25;
while (i <= 25 && i>= 5){
	System.out.println(i);
	i--;
}
System.out.println("Enter integer");
int x =  sc.nextInt();
int ans = x-1;
while (true){
	System.out.println(x);
	x = x * ans;
	if(ans == 0){
		break;
	}
	ans = ans - 1;
}

		
	}
}
