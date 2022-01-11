import java.util.Scanner;
import java.util.Random;


class starter {
		public static void toStringArray(int [] x){
		int i = 0;
		while(i < x.length){
			System.out.println(x[i]);
			i++;
		}
		}
		public static double getMedian(int [] x){
			int sum = 0;
			int i = 0;
			while (i < x.length){
			sum += x[i];
			i++;
			
			}
			return (double)sum / x.length;
		}
		public static int getMode(int [] x){
			int count = 0;
			int i = 1;
			int max = x[0];
			while(i < x.length){
				if(x[i] > max){
					max = x[i];
				}
				i++;
			}	
			return max;
		}

	public static void main(String args[]) {
		int [] arrayOne = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 
		int [] arrayTwo = {5, 12, 6, 3};
		System.out.println(getMode(arrayOne));
		System.out.println(getMedian(arrayOne));
		}
}
