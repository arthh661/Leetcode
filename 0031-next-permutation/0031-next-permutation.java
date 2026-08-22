class Solution {
    public void nextPermutation(int[] nums) {
         int pivot = -1;

        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                pivot = i;
                break;
            }
        }

        // Step 2: If no pivot, array is the largest permutation
        // Reverse the entire array
        if (pivot == -1) {
            int left = 0;
            int right = nums.length - 1;

            while (left < right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;

                left++;
                right--;
            }

            return;
        }

        // Step 3: Find the element just greater than pivot
        for (int i = nums.length - 1; i > pivot; i--) {
            if (nums[i] > nums[pivot]) {

                int temp = nums[pivot];
                nums[pivot] = nums[i];
                nums[i] = temp;

                break;
            }
        }

        // Step 4: Reverse everything after pivot
        int left = pivot + 1;
        int right = nums.length - 1;

        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
        
    }
}