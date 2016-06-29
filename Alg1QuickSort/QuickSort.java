package sortingAlgrithems.Alg1QuickSort;

import sortingAlgrithems.models.ArraySamples;
import sortingAlgrithems.util.Util;

/*
 * May/2016
 * 
 * Thought: from left find bigger one, from right find smaller one. Then witch place, accorder to the pivot(usually starts from index 0) to seperate the order into two parts
 * 
 * O(n) = n(Log n)      -- [2parts*(1/2) 4parts*(1/4) 8parts*(1/8)]
 * 
 * 
 */
public class QuickSort {
	public static int[] sample ;
	
	public static void sort(int leftIndex, int rightIndex){
		
		if(leftIndex>rightIndex)return;
		
		int pivot = sample[leftIndex];
		
		int i = leftIndex,j = rightIndex;
		
		while(i!=j){
			
			while(sample[j] >= pivot && i< j){
				j--;
			}
			while(sample[i] <= pivot && i<j){
				i++;
			}
			if(i<j){
				Util.switchIJ(i, j,sample);
			}
			
		}
		sample[leftIndex] = sample[j];
		sample[j] = pivot;
		
		sort(leftIndex, j-1);
		sort(i+1, rightIndex);
	}
	
	
	public static void main(String[] args) {
		for(ArraySamples s: ArraySamples.values()){
			sample = s.getValue();
			
			Util.prinSmaple("Original: ",sample);
			
			sort(0, sample.length-1);

			Util.prinSmaple("Sorted: ",sample);
			
			System.out.println("******************************** \n");
		}
		
		
	}
	

}
