class Solution {
    public long maximumSumOfHeights(int[] nums) {
        long max=Long.MIN_VALUE;
           int n=nums.length;
          for(int idx=0; idx<n; idx++){
            //int arr[]=new int[n]; matlab same hai clone ka
            int arr[]=nums.clone();
            long sum=0;
        //if [5,3 so 3<5 so make 5 to 3 if it before max val indx]
        int i=idx-1;
           while(i >=0){
           arr[i]=Math.min(arr[i],arr[i+1]);
             i--;
           }
        //if [2 , 7 so 2<7 so make 7 to 2 if it after max val indx]
            i=idx+1;
           while(i <n){
           arr[i]=Math.min(arr[i],arr[i-1]);
            i++;
           }
        
        for(int k=0; k<n; k++){
            sum+=arr[k];
        }
        //max sum nikl lenge 
        max=Math.max(max,sum);
    }
        return max;
    }
}