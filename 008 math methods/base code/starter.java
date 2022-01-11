import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		 int a = 13;
		 int b = 6;
		 int c = 11;
		 int d = 30;
		 int e = 7;
		 int f = 2;
		 int g = 3;
		 int h = 8;
		 int i = 31;
		 int j = 37;
		 int k = 35;
		 int l = 21;
		 int m = 14;
		 int n = 6;
		 System.out.println(Math.max(a-b*c, d%e*(-2)));
		System.out.println(Math.sqrt(g*h+i%e));
		System.out.println(Math.pow(j/g, k%l));
		System.out.println(Math.max(Math.pow(f,m%g),Math.sqrt(f*n)));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x:");
		double x = sc.nextDouble();
		System.out.println("Enter y:");
		double y = sc.nextDouble();
		System.out.println(Math.max(x,y));
		System.out.println(Math.sqrt(y));
		System.out.println(Math.pow(x,y));
		
		
		
	}

}
