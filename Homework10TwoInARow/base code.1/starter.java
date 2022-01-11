import java.util.Scanner;
import java.util.Random;
class starter  {
	public static void getArrayDuplicate(int [] x){
		Random rand = new Random();
		int count = 0;
		int i = 0;
		int randNum = rand.nextInt(10)+1;
		while(i < x.length){
			if (x[i] == randNum){
				System.out.println(i);
				count ++;
			}
			i++;
		}
		System.out.print(count);
	}
	public static void getArrayTwoInARow(int [] x){
		int i = 0;
		while(i<x.length-1){
			if (x[i] == x[i+1]){
	
				System.out.println(i);
				System.out.println(i+1);
				System.out.println(x[i]);
			}
			i++;
		}
	}
	public static void main(String args[]) {
		Random rand = new Random();
		int[] ArrayOne = new int[20];
		int i = 0;
		
		while(i<ArrayOne.length){
			ArrayOne[i] = rand.nextInt(10)+1;
			System.out.print(ArrayOne[i] + " ");
			i++;
		
		}
		getArrayDuplicate(ArrayOne);
		getArrayTwoInARow(ArrayOne);
	}
}
