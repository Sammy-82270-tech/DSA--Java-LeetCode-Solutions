class Solution {
    public int removeDuplicates(int[] nums) {
        

        int arr[]= new int[nums.length];
        arr[0]= nums[0];
        
        int n = 1;
        for (int i = 1; i<nums.length; i++){
            if(nums[i] != nums[i-1]){
                arr[n] = nums[i];
                n++;
            }
        }

        for(int i=0; i < n ; i++){
            nums[i] = arr[i];
        }
        return n;
    }
}