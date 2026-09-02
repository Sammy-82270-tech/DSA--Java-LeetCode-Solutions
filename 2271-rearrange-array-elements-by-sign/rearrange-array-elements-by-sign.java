class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        int[] arr = new int[nums.length];

        for(int i = 0; i< nums.length; i++){
            if(nums [i] < 0){
                list1.add(nums[i]);
            }
            else list2.add(nums[i]);
        }
        int j=0;
        int k=0;
        
        for(int i = 0; i< nums.length; i++){
            
            if(i % 2 == 0){
                arr[i] = list2.get(j);
                j++;  
            }else{
                arr[i] = list1.get(k);
                k++;
            }
        }
        return arr;
    }
}