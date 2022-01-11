import java.util.Scanner;
import java.util.Random;
import java.io.*;
class starter {
   public static void main(String[] args) {
    {
        Scanner sc = new Scanner (System.in);
        Random rand = new Random();

        System.out.println("Welcome to slots gambling!");
        System.out.println("Actions");
        System.out.println("1.Start a new game");
        System.out.println("2.Exit");
        System.out.print("Please select an action: ");
        int userAction = sc.nextInt();

        if (userAction == 1)
        {
            System.out.print("Please enter your username: ");
            String userName = sc.next();
            System.out.print("\nWelcome to the slots game! You begin with $1552.00." + "\nEnter a negative value to quit. " + "Slots is based on pure luck, " + userName + "!\n");

            double startingSum = 1552.00;
            double userTotal = 0.0;
            System.out.printf("\nYou currently have: $%.2f\n", startingSum);

            do 
            {
                System.out.print(" How many dollars do you want to wager? ");
                double userBet1 = sc.nextDouble();  
                userTotal = (startingSum - userBet1);

             
                int slot1 = rand.nextInt(6) + 1;
                int slot2 = rand.nextInt(6) + 1;
                int slot3 = rand.nextInt(6) + 1;
              
                String valName1 = " ", valName2 = " ", valName3 = " "; 

                switch (slot1)
                {
                    case 1:
                        valName1 = "  Cherries  ";
                        break;
                    case 2:
                        valName1 = "  Mango  ";
                        break;
                    case 3:
                        valName1 = "  Watermelon  ";
                        break;
                    case 4:
                        valName1 = "  7  ";
                        break;
                    case 5:
                        valName1 = "  Strawberry  ";
                        break;
                    case 6:
                        valName1 = "  Bars  ";
                        break;
                }

                switch (slot2)
                {
                    case 1:
                        valName2 = "  Cherries  ";
                        break;
                    case 2:
                        valName2 = "  Mango  ";
                        break;
                    case 3:
                        valName2 = "  Watermelon  ";
                        break;
                    case 4:
                        valName2 = "  7  ";
                        break;
                    case 5:
                        valName2 = "  Strawberry  ";
                        break;
                    case 6:
                        valName2 = "  Bars  ";
                        break;
                }

                switch (slot3)
                {
                    case 1:
                        valName3 = "  Cherries  ";
                        break;
                    case 2:
                        valName3 = "  Mango  ";
                        break;
                    case 3:
                        valName3 = "  Watermelon  ";
                        break;
                    case 4:
                        valName3 = "  7  ";
                        break;
                    case 5:
                        valName3 = "  Strawberry  ";
                        break;
                    case 6:
                        valName3 = "  Bars  ";
                        break;
                }
            
                
                System.out.println("\n------------------------------------");
                System.out.printf("%-12s%-10s%5s\n", valName1, valName2, valName3);
                System.out.print("------------------------------------\n");

                
                if (slot1 == slot2 || slot2 == slot3 || slot1 == slot3 )
                {
                    System.out.println("\nNumber of matches: 1");
                    double doubleReward = (userBet1 * 2);
                    double postBetSum = (userTotal + doubleReward);
                    System.out.printf("You have won: $%.2f", doubleReward);
                    System.out.printf("\nYou currently have: $%.2f", postBetSum);
                }
                else if (slot1 == slot2 && slot2 == slot3 && slot1 == slot3 )
                {
                    System.out.println("\nNumber of matches: 3");
                    double tripleReward = (userBet1 * 3);
                    double postBetSum = (userTotal + tripleReward);
                    System.out.printf("\nYou have won: $%.2f",tripleReward);
                    System.out.printf("\nYou currently have: $%.2f", postBetSum);
                }
                else
                {
                    System.out.println("\nNumber of matches: 0");
                    System.out.println("You have won: $0.00");
                    System.out.printf("You currently have: $%.2f", userTotal);
                }
            } while (userTotal > 0.00);
        } 
    }
}
}