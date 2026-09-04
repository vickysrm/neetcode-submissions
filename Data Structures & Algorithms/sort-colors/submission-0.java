class Solution {
    public void sortColors(int[] nums) {
        int zcount=0;
        int ocount=0;
        int tcount=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                zcount++;
            }
            else if(nums[i]==1){
                ocount++;
            }
            else{
                tcount++;
            }
        }
        int index=0;
        for(int i=0;i<zcount;i++){
            nums[index++]=0;
        }
        for(int j=0;j<ocount;j++){
            nums[index++]=1;
        }
        for(int k=0;k<tcount;k++){
            nums[index++]=2;
        }
    }
}