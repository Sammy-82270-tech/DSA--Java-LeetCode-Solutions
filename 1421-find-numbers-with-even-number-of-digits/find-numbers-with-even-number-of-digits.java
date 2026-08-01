class Solution {
    public int findNumbers(int[] nums) {
        int evenLenCount =0;
        for(int num:nums){
            String n =Integer.toString(num);
            int n_len = n.length();
            if(n_len % 2 == 0){
                evenLenCount ++;
            }
        }
        return evenLenCount;
    }
}