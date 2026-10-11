class Solution {
    public int[] dailyTemperatures(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        Stack<Integer>st=new Stack<>();
        //max warmer temp ke bad jitne bhi rem tmep honge wo abiosly chote honge so ans[i]==0 for all after max warmer temp
        for(int i=0; i<n; i++){
            //agar st not empty tehn apply condition 
            while (!st.isEmpty() && nums[i] > nums[st.peek()]) {
                //j ko bahar nikal ke ans ke same jth index pe ans daal denge 
                int j=st.pop();
                //minus krke 
                ans[j]=i-j;
            }
            st.push(i);
        }
        return ans;
    }
}