class Solution {
    public int maxAscendingSum(int[] nums) {
        int cur=nums[0];
        int res=cur;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                cur+=nums[i];

            }
            else{
                cur=nums[i];
            }
        res=Math.max(res,cur);
        }
    return res;
        
    }
}