class Solution {
    public int[] findErrorNums(int[] nums) {
       int [] arr= new int[2];
       int i = 0;
       while(i<nums.length){
        if (nums[i] == i+1) i++;
        else{
            int temp = nums[i];
            if(nums[temp - 1] == nums[i]){
                arr[0] = nums[i];
                i++;
            }
            else{
                nums[i] = nums[temp - 1];
                nums[temp - 1] = temp;
            }
        }
       }
       for(int j=0; j<nums.length; j++){
        if(nums[j] != j+1) arr[1] = j+1;
        
       }
       return arr;
       
    }
}