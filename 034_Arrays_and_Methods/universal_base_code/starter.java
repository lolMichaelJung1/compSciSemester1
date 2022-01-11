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
		public static double getArrayAverage(int [] x){
			int sum = 0;
			int i = 0;
			while (i < x.length){
			sum += x[i];
			i++;
			
			}
			return (double)sum / x.length;
		}
		public static int getArrayMax(int [] x){
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
		public static int getArrayMin(int [] x){
			int i = 1;
			int min = x[0];
			while(i < x.length){
				if(x[i] < min){
					min = x[i];
				}
				i++;
			}
			return min;
		}

	public static void main(String args[]) {
		int [] arrayOne = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 
		int [] arrayTwo = {5, 12, 6, 3};
		System.out.println(getArrayMin(arrayOne));
		System.out.println(getArrayMax(arrayOne));
		}
}
