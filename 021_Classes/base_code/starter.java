import java.util.Scanner;
import java.util.Random;

class Character {
	String role = new String("Warrior");
	int s = 10; 
	int d = 10;
	int i = 10;
	int c1 = 10;
	int c2 = 10;
	String stats = new String("Strenghth is " + s + " Dexterity is " + d + " Intelligence is " + i + " Constitution is " + c1 + " Charisma is " + c2);
}

class starter {
	public static void main(String args[]) {
Character  myCharacter = new Character();
System.out.println(myCharacter.role);
System.out.println(myCharacter.stats);



		
	}
}
