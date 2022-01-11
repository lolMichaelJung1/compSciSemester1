import pkg.*;
import java.util.Scanner;
import java.util.Random;


public class Hangman {
	private String guessingWord;
	private int numTries;
	
	public void setletter(String le){
		letter = le;
	}
	public void setletter(int st){
		start = st;
	}
	public String getLetter(){
		return letter;
	}
	public int getStart(){
		return start;
	}
	
	public Hangman(){
		guessWord = "potato";
		numTries = 5;
	}
	public void generateWord(){
			/* implementation not shown */
	}
	public int guessCheck(String letter, int start){
		for(int i = 0; i < guessingWord.length; i++){
			if (letter.charAt(0) == guessingWord.substring(0, guessingWord.length)) {
			return true;
			}
			else{
				return false;
			}
		}
		}
		
	public boolean checkWin(boolean [] arr){
		if(){
			
		}
	}
	
	public static void main(String args[]) {
		System.out.println("l");


		
	}
}
