class Solution {
    public int findDuplicate(int[] nums) {
        int i = 0;
        while(i<nums.length){
            if(nums[i] == i+1) i++;
            else{
                int temp = nums[i];
                if(nums[i] == nums[temp - 1]) return nums[i];
                nums[i] = nums[temp-1];
                nums[temp-1] = temp;
            }
        }
        return 1;
    }
}