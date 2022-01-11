import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
		System.out.println("Enter intOne:");
		int intOne = sc.nextInt();
		System.out.println("Enter intTwo:");
		int intTwo = sc.nextInt();
		
		boolean Doinb;
		Doinb = (intOne > intTwo);
		if ((intOne > intTwo)  || (intOne < intTwo) || (intOne == intTwo)){System.out.println("intOne is equal to intTwo or different than intTwo");
			System.out.println("Enter int1");
			int int1 = sc.nextInt();
			System.out.println("Enter int2");
			int int2 = sc.nextInt();
			System.out.println("Enter int3:");
			int int3 = sc.nextInt();
		}
		
		
		
		
		System.out.print("Enter 1st number: ");
        int number1;
        number1 = sc.nextInt();

        System.out.print("Enter 2nd number: ");
        int number2;
        number2 = sc.nextInt();

        System.out.print("Enter 3rd number: ");
        int number3;
        number3 = sc.nextInt();

        int minimum = 0;
        if (number2 > number1 || number3 > number1){
            minimum = number1;
        }
        else if (number1 > number2  || number3 > number2){
            minimum = number2;
        }
        else if (number1 > number3  || number2 > number3){
            minimum = number3;
        }

        System.out.print("The minimum of the numbers entered is ");
        System.out.println(minimum); 
        
		
	}
}
