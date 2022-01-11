package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
	String role = new String("Warrior");
	int strength = 10; 
	int dexterity = 10;
	int intelligence = 10;
	int constitution = 10;
	int charisma = 10;
	String stats = new String("Strenghth is " + strength + " Dexterity is " + dexterity + " Intelligence is " + intelligence + " Constitution is " + constitution + " Charisma is " + charisma);
	
	public myCharacter(){
		String role = "NPC";
	}
	public myCharacter(String ro){
		role = ro;
	int dexterity = 10;
	int intelligence = 10;
	int constitution = 10;
	int charisma = 10;
	String stats = new String("Strenghth is " + strength + " Dexterity is " + dexterity + " Intelligence is " + intelligence + " Constitution is " + constitution + " Charisma is " + charisma);
	if (role.equals("Wizard")){
		System.out.println("You chose Rogue");
	}
	if (role.equals("Rogue")){
		System.out.println("You chose Wizard");
	}
	if (role.equals("Warrior")){
		System.out.println("You chose Warrior");
	}
	}
	
}








		
