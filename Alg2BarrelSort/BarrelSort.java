package sortingAlgrithems.Alg2BarrelSort;
/*May/2016
 * 
 * Bucket Sort
 * Each number is a barrel, put the number into the barrel then count.Fast but cost a lot of space, most cost.
 * 
 * O(n) = n 
 * 
 * note: it is not Comparition sorting, so it is not limited to the sorting bottom line O(n(log n)) 
 * 
 */

import sortingAlgrithems.models.ArraySamples;
import sortingAlgrithems.util.Util;

public class BarrelSort {
	public static final int barrelSize = 1000;
	
	//{2,8,7,1,3,5,6,4}
	public static int[] sample  = {2,8,7,1,3,5,6,4};
	
	
	public static void sort(){
		int[] barrels = new int[barrelSize];
		
		for(int a : sample){
			barrels[a]++;
		}
		int index = 0;
		for(int i = 0;i<barrels.length;i++){
			int barrelValue = barrels[i];
			for (int j = 0; j < barrelValue; j++) {
				sample[index] = i;
				index++;
			}
		}
	}
	
	public static void main(String[] args) {
		for (ArraySamples s : ArraySamples.values()) {
			sample = s.getValue();
			Util.prinSmaple("Original: ",sample);
			
			sort();
			
			Util.prinSmaple("Sorted: ",sample);
			
			System.out.println("******************************** \n");		
		}
		
	}
	
}
