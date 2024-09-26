import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Solution s1 = new Solution();

        // Test Case 
        int[] nums = {5, 2, 3, 1};
        int[] sortedArray = s1.sortArray(nums);
        System.out.println("Test Case: Sorted Array: " + Arrays.toString(sortedArray));

        // Test Case 1
        int[] nums1 = {0};
        int[] sortedArray1 = s1.sortArray(nums1);
        System.out.println("Test Case 1: Sorted Array: " + Arrays.toString(sortedArray1));
        
        // Test Case 2
        int[] nums2 = {};
        int[] sortedArray2 = s1.sortArray(nums2);
        System.out.println("Test Case 2: Sorted Array: " + Arrays.toString(sortedArray2));

        // Test Case 3
        int[] nums3 = {7, 7, 7, 7, 7};
        int[] sortedArray3 = s1.sortArray(nums3);
        System.out.println("Test Case 3: Sorted Array: " + Arrays.toString(sortedArray3));

        // Test Case 4
        int[] nums4 = {2, 1};
        int[] sortedArray4 = s1.sortArray(nums4);
        System.out.println("Test Case 4: Sorted Array: " + Arrays.toString(sortedArray4));

        // Test Case 5
        int[] nums5 = {-3, -1, -2, -5, -4};
        int[] sortedArray5 = s1.sortArray(nums5);
        System.out.println("Test Case 5: Sorted Array: " + Arrays.toString(sortedArray5));

        // Test Case 6
        int[] nums6 = {-1, 5, 3, -2, 0};
        int[] sortedArray6 = s1.sortArray(nums6);
        System.out.println("Test Case 6: Sorted Array: " + Arrays.toString(sortedArray6));

        // Test Case 7
        int[] nums7 = {50000, -50000, 0, 123, -9999, 9999, 50000};
        int[] sortedArray7 = s1.sortArray(nums7);
        System.out.println("Test Case 7: Sorted Array: " + Arrays.toString(sortedArray7));

        // Test Case 8
        int[] nums8 = {1, 2, 3, 4, 5, 6, 7};
        int[] sortedArray8 = s1.sortArray(nums8);
        System.out.println("Test Case 8: Sorted Array: " + Arrays.toString(sortedArray8));

        // Test Case 9
        int[] nums9 = {9, 7, 5, 3, 1, -1, -3};
        int[] sortedArray9 = s1.sortArray(nums9);
        System.out.println("Test Case 9: Sorted Array: " + Arrays.toString(sortedArray9));

        // Test Case 10
        int[] nums10 = {2, 3, 1, 2, 1, 3, 4, 2};
        int[] sortedArray10 = s1.sortArray(nums10);
        System.out.println("Test Case 10: Sorted Array: " + Arrays.toString(sortedArray10));
    }
}