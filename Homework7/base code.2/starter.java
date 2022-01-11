import java.util.Scanner;
import java.util.Random;
class dog {
	private String name;
	private	String breed;
	private	int age;
	
	public dog(){
		name = "Clifford";
		breed = "big red dog";
		age = 3;
	}
	
	public dog(String na){
		name = na;
		breed = "dog dog";
		age = 1;
	}
	public dog(String na, int ag){
		name = na;
		breed = " dog dog";
		age = ag;
	}
	public dog(String na, String br, int ag){
		name = na;
		breed = br;
		age = ag;
	}
	
	
	public void setName(String na){
		name = na;
	}
	public void setAge(int ag){
		age = ag;
	}
	public void setBreed(String br){
		breed = br;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public String getBreed(){
		return breed;
	}
	public boolean isSleeping(){
		Random rand = new Random();
	boolean sleep = rand.nextBoolean();
		return sleep;
	}
	public void bark(){
		System.out.print( name + " barks");
		
	}
}
		
	

class starter {
	public static void main(String args[]) {
		dog d1 = new dog();
		dog d2 = new dog("Joe");
		dog d3 = new dog("Jim", "Thai Ridgeback", 99);
		System.out.println(d2);
		System.out.println(d1);
		System.out.println(d3);

	

	}
}

