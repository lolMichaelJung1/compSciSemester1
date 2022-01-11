import java.util.Scanner;
class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	 System.out.println("Input integerOne: ");
	 int integerOne = sc.nextInt();
	 System.out.println("Input integerTwo: ");
	 int integerTwo = sc.nextInt();
	 if ((integerOne % 2) == 0) {
   System.out.println("Integer one is even");
} else {
  System.out.println("Integer one is odd");
}
if ((integerTwo % 2) == 0) {
   System.out.println("Integer two is even");
} else {
  System.out.println("Integer two is odd");
}
if ((integerOne % 3) == 0) {
   System.out.println("Integer one is divisible by 3");
} else {
  System.out.println("Integer one is not divisible by 3");
}
	 if ((integerTwo % 3) == 0) {
   System.out.println("Integer two is divisible by 3");
} else {
  System.out.println("Integer two is not divisible by 3");
}
if ((integerOne % 4) == 0) {
   System.out.println("Integer one is divisble by 4");
} else {
  System.out.println("Integer one is not divisble by 4");
}
if ((integerTwo % 4) == 0) {
   System.out.println("Integer two is divisble by 4");
} else {
  System.out.println("Integer two is not divisble by 4");
}
if ((integerOne % 5) == 0) {
   System.out.println("Integer one is divisble by 5");
} else {
  System.out.println("Integer one is not divisble by 5");
}
if ((integerTwo % 5) == 0) {
   System.out.println("Integer two is divisble by 5");
} else {
  System.out.println("Integer two is not divisble by 5");
}
	}
}
