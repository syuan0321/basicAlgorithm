package sortingAlgrithems.Alg4InsertionSort;

import sortingAlgrithems.models.ArraySamples;
import sortingAlgrithems.util.Util;

/*
 * 6/22/2016
 * 
 * Thought: from left to right, pick 1st one and insert others from right and re-order.Buble considers  i to length-1, Insertion considers i+1 to [0,i].
 * Buble算右边 Insertion算左边
 * 
 * O(n) = n^2
 * 
 * 
 */
public class InsertionSort {
	public static int[] sample  = {2,8,7,1,3,5,6,4};	
	
	public static void sort(){
		for (int i = 0; i < sample.length-1; i++) {
	        for( int j=i+1; j>0; j-- ) {
	            if( sample[j] < sample[j-1] )
	            	Util.switchIJ(j, j-1, sample);
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
