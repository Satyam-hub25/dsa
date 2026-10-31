class Solution {
    public boolean isUgly(int n) {
      if(n<=0)return false;
      int nums[]={2,3,5};
      int a=nums.length;
      for(int i=0; i<a; i++){
        while(n%nums[i]==0){
            n=n/nums[i];
        }
      }
     if(n==1){
      return true;
     }
     return false;
     }
}