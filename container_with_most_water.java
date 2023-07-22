class Solution {
    public int maxArea(int[] height) {
         int start = 0;
         int end = height.length-1;
         int m = 0;
         while(start<end){
             int h = Math.min(height[start],height[end]);
             int b = end - start;
             int area = h*b;
             m = Math.max(m,area);
             if(height[start]<height[end]){
                start++;
             }
             else if(height[end] < height[start]){
                end--;
             }else{
                start++;
                end--;
             }   
         }
         return m;                                        
    }
}
