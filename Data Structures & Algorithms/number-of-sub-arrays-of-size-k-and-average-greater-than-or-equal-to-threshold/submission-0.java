class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count=0;
        int windowsum=0;
        for(int i=0;i<k;i++){
            windowsum+=arr[i];
        }
        if(windowsum/k >=threshold){
            count++;
        }
        for(int right=k;right<arr.length;right++){
            windowsum+=arr[right];
            windowsum-=arr[right-k];
            if(windowsum/k>=threshold){
                count++;
            }
        }
    return count;

        
    }
}