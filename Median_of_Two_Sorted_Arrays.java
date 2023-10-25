class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int[] res = new int[nums1.length+nums2.length];
        int p = 0;
        int q = 0;
        int i = 0;
        while (p<nums1.length && q<nums2.length) {
            if (nums1[p] < nums2[q])
                res[i++]=nums1[p++];
            else
                res[i++]=nums2[q++];
        }
        if (p < nums1.length) {
            while (p < nums1.length) {
                res[i++]=nums1[p++];
            }
        }
        if (q < nums2.length) {
            while (q < nums2.length) {
                res[i++]=nums2[q++];
            }
        }
        int len = res.length;
        if (len%2!=0) {
            return (double) res[len/2];
        } else {
            int x = res[len/2];
            int y = res[len/2-1];
            return (double) (x + y) /2;
        } 
    }
}
