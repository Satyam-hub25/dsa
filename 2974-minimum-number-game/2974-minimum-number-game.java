class Solution {
    public int[] numberGame(int[] nums) {
        int i=0;
        int j=i+1;
        int temp=0;
        Arrays.sort(nums);
        //condition
        while(j < nums.length){
            temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
              i+=2;
        j+=2;
        }
      //adding in new array ans
            int ans[]=new int[nums.length];
        for(int k=0; k<ans.length; k++){
          ans[k]=nums[k];
          
        }
        return ans;
    }
}