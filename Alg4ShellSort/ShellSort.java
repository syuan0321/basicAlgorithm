package sortingAlgrithems.Alg4ShellSort;

import sortingAlgrithems.models.ArraySamples;
import sortingAlgrithems.util.Util;

/*
 * 6/27/2016
 * 
 * Thought: Update of InsertionSort, since InsertionSort only increase 1 position 1 time. Shell thought could could use group increasing (steps),
 * 			Step length is important. StepLengh = sampleLength/2 ../2 ../2 ../2 ==> 1/2 = 0
 * 			(sample[0],sample[sampleLength/2]),(sample[1],sample[sampleLength/2+1]) ...
 * 
 * O(n) = n (Logn * Logn)  -- better than n^2
 * 
 * 
 */
public class ShellSort {
	public static int[] sample  = {2,8,7,1,3,5,6,4};	
	
	public static void sort(){
		int length = sample.length;int gap = 0;
		for(gap = length /2 ;gap > 0 ; gap /= 2 ){
			for(int i = 0 ; i < gap ; i++){
				for(int j = gap+i ; j < length ; j += gap){
		                if (sample[j] < sample[j - gap])  
		                {  
		                    int temp = sample[j];  
		                    int k = j - gap;  
		                    while (k >= 0 && sample[k] > temp)  
		                    {  
		                        sample[k + gap] = sample[k];  
		                        k -= gap;  
		                    }  
		                    sample[k + gap] = temp; 
		                }    
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
