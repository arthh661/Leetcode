class Solution {
    public int longestConsecutive(int[] nums){
        if (nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        
        int current = 1;
        int longest = 1;

        for(int j = 1; j < nums.length;j++){
            if (nums[j] == nums[j - 1]+1){
                current++;
            }
            else if(nums[j] == nums[j-1]){

            }
            else{
                current = 1;
                
            }
            longest = Math.max(longest,current);

        }

        return longest;

    }
}