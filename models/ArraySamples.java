package sortingAlgrithems.models;

public enum ArraySamples {
	sample_0(new int[]{2,8,7,1,3,5,6,4}),
	sample_1(new int[]{72,6,57,88,60,42,83,73,48,85}),
	sample_2(new int[]{6,2,1,7,9,3,4,5,10,8}),
	sample_3(new int[]{0,2,1,7,7,2,4,5,9,3});
	
	private ArraySamples(int[] values){
		this.setValue(values);
	}
	
	private int[] value;

	public int[] getValue() {
		return value;
	}

	public void setValue(int[] value) {
		this.value = value;
	}
	
	
}
