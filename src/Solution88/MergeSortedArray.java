package Solution88;

import java.util.Arrays;

public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        for (int i = m, k = 0; k < nums2.length; i++, k++) {
            nums1[i] = nums2[k];
        }
        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        int[] a = new int[] { 1,2,3,0,0,0 };
        int[] b = new int[] { 2,5,6 };

        MergeSortedArray test = new MergeSortedArray();
        test.merge(a, 3, b, 3);
        System.out.println(Arrays.toString(a));
    }
}
