class Solution {
    public int[] rearrangeArray(int[] nums) {
        int positive_position = 0;
        int negative_position = 1;
        int[] result = new int[nums.length];
        for (int i = 0;i<nums.length;i++){
            if(nums[i]>0){
                result[positive_position] = nums[i];
                positive_position +=2;
            }
            if(nums[i]<0){
                result[negative_position] = nums[i];
                negative_position +=2;
            }
        
        }
        return result;
        
    }
}