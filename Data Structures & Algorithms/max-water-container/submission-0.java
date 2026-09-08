class Solution {
    public int maxArea(int[] heights) {
        int left=0;
        int right=heights.length-1;
        int maxwater=0;
        int water=0;
        while(left<=right){
            water=(right-left)*Math.min(heights[left],heights[right]);
            if(water>maxwater){
                maxwater=water;
            }
            if(heights[left]<heights[right]){
                left++;
            }
            else if(heights[right]<heights[left]){
                right--;
            }
            else{
                left++;
                right--;
            }

        }
    return maxwater;
        
    }
}
