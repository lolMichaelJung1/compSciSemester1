package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
	String role = "Wizard";
	int strength =5; 
	int dexterity = 5;
	int intelligence = 5;
	int constitution =5;
	int charisma = 5;
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
		System.out.println("Rogue winrate is 55%");
	}
	if (role.equals("Rogue")){
		System.out.println("Wizard winrate is 45%");
	}
	if (role.equals("Warrior")){
		System.out.println("Warrior winrate is 54.3%");
	}
	}
	
	public void MyToString(){
		System.out.println("Your role is " + role);
		System.out.println("Your strength trait is " + strength);
		System.out.println("Your dexterity trait is " + dexterity);
		System.out.println("Your intelligence trait is " + intelligence);
		System.out.println("Your constitution trait is " + constitution);
		System.out.println("Your charisma trait is " + charisma);
	}
	
	public myCharacter (String ro, int st, int de, int in, int co, int ch){
		role = ro;
		strength = st;
		dexterity = de;
		intelligence = in;
		constitution = co;
		charisma = ch;
	}
	public void setRole(String ro){
		role = ro;
	}
	public void setStrength(int st){
		strength = st;
	}
	public void setDexterity(int de){
		dexterity = de;
	}
	public void setIntelligence(int in){
		intelligence = in;
	}
	public void setConstitution(int co){
		constitution = co;
	}
	public void setCharisma(int ch){
		charisma = ch;
	}
	public boolean setAll(String ro, int st, int de, int in, int co, int ch){
	role = ro;
	strength = st;
	dexterity = de;
	intelligence = in;
	constitution = co;
	charisma = ch;
	}

	
	int[] x;
	x = new int[10];
	System.out.println(x.length);
	x[0] = 9;
	x[1] = 8;
	x[2] = 7;
	x[3] = 6;
	x[4] = 5;
	x[5] = 4;
	x[6] = 3;
	x[7] = 2;
	x[8] = 1;
	x[9] = 0;
System.out.println(x[0]);
System.out.println(x[1]);
System.out.println(x[2]);
System.out.println(x[3]);
System.out.println(x[4]);
System.out.println(x[5]);
System.out.println(x[6]);
System.out.println(x[7]);
System.out.println(x[8]);
System.out.println(x[9]);
}
	



