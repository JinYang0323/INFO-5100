import java.util.Arrays;

public class Assignment7_5_findMedianSortedArrays {
	public static void main() {
		int[] nums1 = new int[] {1, 3};
		int[] nums2 = new int[] {2};
		// Simple Unit Test
		System.out.println(findMedianSortedArrays(nums1, nums2)); //should be 
	}
	
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		if(nums1 == null) return findMedianSortedArrays(nums2);
		if(nums2 == null) return findMedianSortedArrays(nums1);
		int[] merge = new int[nums1.length + nums2.length];
		for (int i = 0, j = 0; (i + j) < merge.length; ) {
            if (i == nums1.length) {
                merge[i + j] = nums2[j++];
                continue;
            }
            if (j == nums2.length) {
                merge[i + j] = nums1[i++];
                continue;
            }
            if (nums1[i] < nums2[j]) {
                merge[i + j] = nums1[i];
                i++;
            } else {
                merge[i + j] = nums2[j];
                j++;
            }
        }
		return findMedianSortedArrays(merge);
	}
	
	public static double findMedianSortedArrays(int[] nums) {
		if(nums == null) return 0;
		Arrays.sort(nums);
		return (nums[(nums.length - 1) / 2] + nums[nums.length / 2]) / 2.0;
	}
}
