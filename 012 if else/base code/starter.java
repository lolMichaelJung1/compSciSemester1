import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
	int a = 1 + (int) (Math.random() * 999);
   int guess;

   System.out.println("I am thinking of a number from 1 to 100 ... guess what it is ?");
   guess = sc.nextInt();

   while(guess != a){
   if (guess > a)
   {  
     System.out.println("lower!");

   }
   else if (guess < a) 
   {
    System.out.println("higher!");

   }
   else 
   {
     System.out.println("Congratulations.   You guessed the number with X tries!");
   }
   }
  }
}