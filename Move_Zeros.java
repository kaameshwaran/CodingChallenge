class Solution {
    public void moveZeroes(int[] nums) {
        int p = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0)
            p++;
            else{
                int n = nums[i];
                nums[i] = 0;
                nums[i - p] = n;
            }
        }
    }
}