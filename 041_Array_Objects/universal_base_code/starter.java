import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Wizard[] wz = new Wizard[100];
		Warrior[] wa = new Warrior[100];
		int wizardCount = 0;
		int warriorCount = 0;
		for(int i = 0; i < wz.length; i++){
			wa[i] = new Warrior();
			wz[i] = new Wizard();
	
			
		}	
		
		
			// 	wz[i].attack(wa[i]);
			// wa[i].isDead();
			// ++warriorCount;
			// wa[i].attack(wz[i]);
			// wz[i].isDead();
			// ++wizardCount;
		while(wizardCount < 100){
			//WIZARD ATT
			wz[wizardCount].attack(wa[warriorCount]);
			if(wa[warriorCount].isDead()){
				warriorCount++;
			} 
			if(warriorCount == 100 ){
				break;
			}
			
			// WARRIOR ATT
			wa[warriorCount].attack(wz[wizardCount]);
			if(wz[wizardCount].isDead()){
				wizardCount++;
			}
		}
		//checks winner
		if(wizardCount == 100){
			System.out.println("Warrior wins and there are " + (100 - warriorCount) + " warriors left "); 
		}
		else{
			System.out.println("Wizard wins and there are " + (100 - wizardCount) + " wizards left "); 
		}
		
		
			
		// }
		// if(wa[i].equals(true)){
		// System.out.println("Wizard has lost and there are " 100 - wa[i] " warriors left in the battlefield");
		// }
		// if(warriorCount = 100){
		// System.out.println("Warrior has lost and there are " 100 - wz[i] " wizards left in the battlefield");
		 }
			
		
	}

