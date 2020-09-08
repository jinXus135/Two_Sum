# Two_Sum
this program provides a "two pointer sliding window" solution to the two sum leetcode problem by first arranging a given array
 in ascending order, and searching the array for two numbers which will add up to a desired value. it does this by setting two pointer
 values, one at the beginning(A or lp) and one at the end(B or rp) of the array. the program first checks to see whether the values add
 to the desired sum. if it does not, it will check if the sum of value A and B is greater than or less than the desired value, 
 if it is greater then, we will decrement B and check if the value that comes before it fits our criteria. if less then, we will
 Increment A and try again to get closer to our desired value. if nothing is found or if values A and B are the same then the system
 prints -1. otherwise it returns an array with the indexes of the values adding to the sum and the sorted version of the OG array.
 
*/
