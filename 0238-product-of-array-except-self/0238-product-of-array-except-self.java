class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n];
        arr[0]=1;
        //prefix
         for(int i=1; i<n; i++){
            arr[i]=arr[i-1]*nums[i-1];
         }
         //sufffix
         int product=1;
        for(int i=n-1; i>=0; i--){
              arr[i]=arr[i]*product;
               product=product*nums[i];

         }
         return arr;
    }
}