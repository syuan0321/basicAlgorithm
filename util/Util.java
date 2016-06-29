package sortingAlgrithems.util;

public class Util {
	public static int[] switchIJ(int  i, int j, int[] sample){
		int jImage = sample[j];
		int iImage = sample[i];
		//switch
		sample[j] = iImage;
		sample[i] = jImage;	
		
		return sample;
	}
	
	public static void prinSmaple(String note, int[] sample){
		System.out.print(note);
		for (int k = 0; k < sample.length; k++) {
			System.out.print(sample[k] + "  ");
			if (k+1 == sample.length) {
				System.out.print(""+ " \n");
			}
			
		}		
	}
}
