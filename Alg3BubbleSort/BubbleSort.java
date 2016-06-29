package sortingAlgrithems.Alg3BubbleSort;

import sortingAlgrithems.models.ArraySamples;
import sortingAlgrithems.util.Util;

/* 6/1/2016
 * 
 * Thought: from left to right, compare each other two and switch them until loop to the end of the array
 * 
 * O(n) = n^2
 * 
 * 
 */
public class BubbleSort {
	public static int[] sample  = {2,8,7,1,3,5,6,4};	
	
	public static void sort(){
		for(int i = 0 ; i<sample.length-1; i++){ // This loop like searching for the maximum Number in length times
			for(int j = 0 ; j<sample.length-1; j++){ 
					if(sample[j] > sample[j+1]){
						Util.switchIJ(j, j+1, sample);
					}
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
