package ds.problems.sortings;
//https://leetcode.com/problems/merge-sorted-array/
//88. Merge Sorted Array

public class _88MergeSortedArray {
    public static void main(String[] args) {
        _88MergeSortedArray mergeSortedArray = new _88MergeSortedArray();
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        mergeSortedArray.merge(nums1,3,nums2,3);
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int pointer = m + n - 1; // keeps track of our final array where elements would be inserted
        int i = m - 1; // starts at the end of nums1 arr
        int j = n - 1; //starts at the end of nums2 arr

        while(i >=0 && j >=0) { // we wanna keep comparing for numbers until both the arrays reach the first element (since we are starting from the end)
            if(nums1[i] <= nums2[j]) { // if nums1.elem is lesser
                nums1[pointer] = nums2[j]; // put nums1.ele in final arr
                pointer--; // decrement final arr position
                j--; // decrease nums2 position since that was added in final arr
            }

            else { // if nums2.ele is lesser
                nums1[pointer] = nums1[i]; // put that one in final arr
                pointer--; // decrement final arr position
                i--; //decrease nums1 position
            }
        }

        while (j >= 0) { // once one arr is done, combine the rest in final arr
            nums1[pointer] = nums2[j];
            pointer--;
            j--;
        }
    }
}
