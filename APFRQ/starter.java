class starter {
		int currentRun = 1;
		int maxRun = 1;
		int index = -1;
	public int toss(){
		/* implementation not shown */
	}
	public static int[] getCubeTosses (NumberCube cube, int numTosses){
		int[] x = new int x [numTosses]
		for(int i = 0; i < x.length; i++ ){
			x[i] = cube.toss();
			return x;
		}
	}
	public static int getLongestRun (int[] values){
		for(int i =0; i < values.length -1; i++){
			if(values[i] == values[i+1]){
				run++;
				if(currentRun > maxRun){
					maxRun = currentRun;
					index = i;
				}
			} else{
				currentRun = 0;
			}
		}
		reuturn index;
	}
	public static void main(String args[]) {
	
}
