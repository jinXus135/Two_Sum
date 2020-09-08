/* 
Anthony Licea 
09-7-20
 CS245 DATA STRUCTURES AND ALGORITHMS
 
 this program provides a brute force solution to the two sum leetcode problem by first arranging a given array
 in ascending order, and searching the array for two numbers which will add up to a desired value. 
 If found these numbers are passed through a method to determine their indexes. those indexes are then stored
 in an array and printed to the screen. if nothing is found to satisfy our conditions or if the two numbers 
found are the same, we return -1. 
*/
import java.util.Arrays;

public class two_sum {

	static int [] num = new int [] {2, 12, 8, 7,87,9,66,4};
	
	
	private int [] sort(int[]num) {		// selection sort algorithm 
		
		
		for(int i = 0; i<num.length; i++) {
		
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
	private int [] twoSum(int[]num, int sum){		// getting the index values for numbers adding up to desired sum
		int [] indx = new int[2];
		for (int i =0; i < num.length; i++) {
			int h = num[i];
			for (int j = i+1; j < num.length;j++) {
				if (h + num[j] == sum) {
					indx[0] = this.getIndex(num, h);
					indx[1]= this.getIndex(num, num[j]);
				}
				
			}
		}
		return indx;
	}
	
	public int getIndex(int[]num, int numb) {		// getting the index of a given number in an array
		for (int i = 0; i<num.length; i++) {
			if(num[i]== numb) {
				return i;
			}
			
		}
		return -1;
	}
	
	//public int two_sum(int []num, int sum) {
		
		
	//}
	public static void main(String args[])
	{
		two_sum h = new two_sum();	// declaring new two_sum object
		int[]sorted = h.sort(num);	// sorting static array
		
		int[]sum = h.twoSum(sorted, 12); // testing different input values
		if(sum[0] ==  sum[1]) {
			System.out.println("values not found in array"); // if not found print message and -1
			System.out.println(-1);
		}
		else {
			System.out.println("index of postions adding up to sum: " + Arrays.toString(sum));// if two values which add to sum are found,
			System.out.println(Arrays.toString(sorted));
			
		}
		
		
		
	}
}
