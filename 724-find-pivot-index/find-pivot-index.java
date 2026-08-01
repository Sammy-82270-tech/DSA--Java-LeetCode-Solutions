class Solution {
    public int pivotIndex(int[] nums) {
        int right_sum = 0;
        for(int i = 0; i < nums.length; i++){
            right_sum += nums[i];
        }

        int left_sum = 0;
        for(int i = 0; i< nums.length; i++){
            if(left_sum == right_sum - nums[i]){
                return i;
            }

            left_sum += nums[i];
            right_sum -= nums[i];
        }

        return -1;
    }
}