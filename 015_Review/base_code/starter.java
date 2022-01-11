import java.util.Scanner;
import java.util.Random;
class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter character name");
		String characterName = sc.nextLine();
		System.out.println("Enter character title");
		String characterTitle = sc.nextLine();
		System.out.println(characterTitle + ", " + characterName + " you are a wizard");

	
	System.out.println("You have a limit of 25 points to spend on strength, dexterity, intelligence, constitution, and charisma");
	System.out.println("Enter points for strength");
	int strength = sc.nextInt();
	int x = 25 - strength;
	if (strength < 0 || strength > 10) {
	System.out.println("Please try again");
	} else if (strength >= 0 && strength <= 10) {
		System.out.println("You have " + x + " points left");
	}
//rogue code cannot have code in between else if statements. They should be put
	System.out.println("Enter points for dexterity");
	int dexterity = sc.nextInt();
	int y = (25 - (strength + dexterity));
	if (dexterity < 0 || dexterity > 10) {
	System.out.println("Please try again");
	} else if (strength >= 0 && strength <= 10) {
		System.out.println("You have " + y + " points left");
	}

	System.out.println("Enter points for intelligence");
	int intelligence = sc.nextInt();
	int z = (25 - (strength + dexterity + intelligence));
	if (intelligence < 0 || intelligence > 10) {
	System.out.println("Please try again");
	} else if (intelligence >= 0 && intelligence <= 10) {
		System.out.println("You have " + z + " points left");
	}
	
	System.out.println("Enter points for constitution");
	int constitution = sc.nextInt();
	int kappa = (25 - (strength + dexterity + intelligence + constitution));
	if (intelligence < 0 || intelligence > 10) {
	System.out.println("Please try again");
	} else if (intelligence >= 0 && intelligence <= 10) {
		System.out.println("You have " + kappa + " points left");
	}
	
	System.out.println("Enter points for charisma");
	int charisma = sc.nextInt();
	int alpha = (25 - (strength + dexterity + intelligence + constitution + charisma));
	if (charisma < 0 || charisma > 10) {
	System.out.println("You have " + alpha + " points left");
	} else if (charisma >= 0 && charisma <= 10) {
		System.out.println("You have " + alpha + " points left");
	}
	System.out.println("Your name is " + characterTitle + characterName);
	System.out.println("Your strength is " + strength);
	System.out.println("Your dexterity is " + dexterity);
	System.out.println("Your intelligence is " + intelligence);
	System.out.println("Your constitution is " + constitution);
	System.out.println("Your charisma is " + charisma);
	System.out.println("You have " + alpha + " points left over ");

}
}