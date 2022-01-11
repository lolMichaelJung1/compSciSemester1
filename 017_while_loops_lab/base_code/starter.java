import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
 {
        int attempt = 1;
        int userGuessNumber = 0;
        int secretNumber = (int) (Math.random() * 999 + 1);           
        Scanner userInput = new Scanner(System.in);
        System.out.println("This is a number guessing game");
        do {
            System.out.print("Enter a guess number between 1 to 1000: ");
            if(userInput.hasNextInt()) {
                userGuessNumber = userInput.nextInt();
                if (userGuessNumber == secretNumber)
                {    
                    System.out.println("Poggers your number is correct widepeeophappy");
                    break;
                }
                else if (userGuessNumber < secretNumber)
                    System.out.println("Your guess number is lower than the secret number");
                else if (userGuessNumber > secretNumber)
                    System.out.println("Your guess number is higher than the secret number");
                if(attempt == 1000) {
                    System.out.println("Maximum attempt reached");
                    break;
                }
                attempt++;
            }else {
                System.out.println("Enter a Valid Integer Number");
                break;
            }
        } while (userGuessNumber != secretNumber);
    }
	}
}