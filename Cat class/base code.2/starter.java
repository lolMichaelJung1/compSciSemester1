
import java.util.Scanner;
import java.util.Random;
	 class cat{
		String name;
		public cat(){
			name = "Garfield";
		} 
	
		public cat(String xName){
			name = xName;
		}
		
		public void meow(){
		System.out.println(name + " has meowed");
		return;
		}
	}
	
class starter {
	public static void main(String args[]) {
	System.out.println("Enter the name of your cat");
	
	cat cat1 = new cat();
	cat cat2 = new cat("Chomsky");
	cat cat3 = new cat();
	cat1.meow();
	cat2.meow();
	}
}

