class Solution {
    public void sortColors(int[] nums) {
        int temp;
        int n = nums.length-1;
        boolean swapped;
        for(int i=0;i<n;i++){
            swapped = false;
            for(int j=0;j<n-i;j++){
                if(nums[j] > nums[j+1]){
                    temp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = temp;
                    swapped = true;
                }
            }
            if(swapped == false){
                break;
            }
        }   
    }
}
