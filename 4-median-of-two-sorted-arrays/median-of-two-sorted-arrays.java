class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int s1 =nums1.length;
       int s2 = nums2.length;

       int[] arr = new int[s1 + s2];
       
       for(int i = 0; i< s1; i++){
            arr[i] = nums1[i];
       }

       for(int i = 0; i< s2; i++){
            arr[s1+i] = nums2[i];
       }

        Arrays.sort(arr);

        int n = arr.length;
        if(n%2 ==0) return (arr[(n/2)-1] + (arr[n/2])) / 2.0;
        else return arr[n/2];
    }
}