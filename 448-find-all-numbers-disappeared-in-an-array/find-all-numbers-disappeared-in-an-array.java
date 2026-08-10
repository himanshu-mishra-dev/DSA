class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List <Integer> arr = new ArrayList<>();
        int i = 0;
        while(i<nums.length){
            if(nums[i] == i+1) i++;
            else{
                int temp = nums[i];
                if(nums[i] == nums[temp-1]) i++;
                else{
                    nums[i] = nums[temp-1];
                    nums[temp-1] = temp;
                }
            }
        }
        for(int j=0; j<nums.length; j++){
            if(nums[j]!= j+1) arr.add(j+1);
        }
        return arr;
    }
}