package two_sum_pointer;

import java.util.Arrays;

public class two_sum_pointer {

	static int [] num = new int [] {2, 12, 8, 7,87,9,66,4};
	
	
	private int [] sort(int[]num) {		// selection sort algorithm 
		
		
		for(int i = 0; i<num.length; i++) {
			int place = i;
			for(int j = i+1; j < num.length;j++){
				if(num[j]<num[i]) { // switch to (num [j] > num[i]) for descending order
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		return num;
	}
	private int[] TwoSum(int[]num, int sum) {
		int []arr = new int[2];
		int rp = num.length-1; // right side pointer
		int lp = 0;  // left side pointer
		while (lp < rp) {
			if(num[lp]+num[rp] == sum) {
				arr[0] = this.getIndex(num, num[lp]);
				arr[1] = this.getIndex(num, num[rp]);
				return arr;
			}
			else if(num[lp]+num[rp] < sum) {
				lp++;
				}
			else {
				rp--;
			}
			}
		return arr;
		}
	
	private int getIndex(int[]num, int numb) {		// getting the index of a given number in an array
		for (int i = 0; i<num.length; i++) {
			if(num[i]== numb) {
				return i;
			}
			
		}
		return 0;
	}
	public static void main( String args[]) {
		two_sum_pointer c = new two_sum_pointer();
		int[] csort = c.sort(num);
		int[]idx= c.TwoSum(num, 11);
		if(idx[0] ==  idx[1]) {
			System.out.println("values not found in array"); // if not found print message and -1
			System.out.println(-1);
		}
		else {
			System.out.println("index of postions adding up to sum: " + Arrays.toString(idx));// if two values which add to sum are found,
			System.out.println(Arrays.toString(csort));
			
		}
		
		
	}
}
