import java.util.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class Assignment4 {
	
	@Test
	void test() {
		 assertEquals(firstUniqChar("leetcode"), 0);
		 assertEquals(firstUniqChar("loveleetcode"), 2);
		 
		 assertEquals(addDigits(38), 2);
		 assertEquals(addDigits(3456789), 6);
		 
		 int[] a = {0, 1, 0, 3, 12};
		 int[] b = {1, 3, 12, 0, 0};
		 moveZeroes(a);
		 assertArrayEquals(a, b);
		 
		 assertEquals(longestPalindrome("babad"), "bab");
		assertEquals(longestPalindrome("banana"), "anana");
		 
		 int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};			
		 int[][] matrixRotate = {{13, 9, 5, 1}, {14, 10, 6, 2}, {15, 11, 7, 3}, {16, 12, 8, 4}};
		 assertArrayEquals(rotate(matrix), matrixRotate);
		 
	}
	
	/*
	 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
	 * s = "leetcode" return 0. 
	 * s = "loveleetcode" return 2.
	 */
    public static int firstUniqChar(String s) {
    	if(s.length() == 0) return -1;
    	if(s.length() == 1) return 0;    	
    	for(int i = 0; i < s.length(); i++) {
    		int num = 0;
    		for(int j = 0; j < s.length(); j++) {
    			if(s.charAt(j) == s.charAt(i)) num++;
        	}
    		if(num == 1) return i;		
    	}
    	return -1;
     }   
    
    /*
     *Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
     * Input: 38 Output: 2
     * Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
     */
    public static int addDigits(int n) {
    	if(n < 10) return n;
    	int result = 0;
    	while(n > 9) {
    		result += (n % 10);
    		n /= 10;
        }
    	result += n;
    	if(result < 10) return result;
    	return addDigits(result);
    }
    
    /*
     *  Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
     *  Input: [0,1,0,3,12] Output: [1,3,12,0,0]
     */
    public static void moveZeroes(int[] nums) {
    	if(nums.length == 0) return; 
    	int i = 0;
    	while(nums[i] != 0) i++;
    	for(int j = i + 1; j < nums.length; j++) {
    		while(nums[j] == 0) j++;
    		int temp = nums[j];
    		nums[j] = nums[i];
    		nums[i] = temp;
    		i++;
    	}
    	for(i = 0; i < nums.length; i++)
    		System.out.print(nums[i] + ", ");
    	return;	
     }
	
    /*
     * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
     * Input: "babad" Output: "bab" Note: "aba" is also a valid answer.
     */
	public static String longestPalindrome(String s) {
		if(s.length() == 0 || s.length() == 1) return s;
		boolean[][] isPalindrome = new boolean[s.length()][s.length()];
		int length = 0, i = 0, start = 0, end = 0;		
		for(i = 0; i < s.length(); i++) {
			for(int j = i; j >= 0; j--) {
				if(s.charAt(i) == s.charAt(j) && ((i - j < 2) || isPalindrome[j + 1][i - 1] == true)) {
					isPalindrome[j][i] = true;
					if(length < i - j + 1) {
						length = i - j + 1;
						start = j;
                        end = i + 1;
					}
				}			
			}
		}		
		return s.substring(start, end);
    }
	
	
    /*
     * You are given an n x n 2D matrix representing an image. Rotate the image by 90 degrees (clockwise).
     * Given input matrix = [ [1,2,3],
  			      [4,5,6],
  			      [7,8,9] ],
     * rotate the input matrix in-place such that it becomes: [  [7,4,1],
  								 [8,5,2],
  								  [9,6,3] ],
     */
    public static int[][] rotate(int[][] matrix) {
    	if(matrix.length == 0 || matrix.length == 1) return matrix;
    	int[][] result = new int[matrix.length][matrix.length];
    	for(int i = 0; i < matrix.length; i++) {
    		for(int j = 0; j < matrix.length; j++) {
    			result[i][j] = matrix[matrix.length - j - 1][i];
    		}
    	}
    	return result;
   }
   //in-place
	public static void rotate(int[][] matrix) {
        if(matrix.length < 2) return;
        for(int i = 0; i < matrix.length; i++){
            for(int j = i; j < matrix.length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp; 
            }
        }
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length / 2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - 1 - j];
                matrix[i][matrix.length - 1 - j] = temp;
            }
        }
        return;
    }
    
}
