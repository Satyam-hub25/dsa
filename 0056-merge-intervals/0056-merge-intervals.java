class Solution {
    public int[][] merge(int[][] intervals) {
        int n=intervals.length;
        int m=intervals[0].length;
        int k=0;
        int ans[][]=new int[n][m];
        Arrays.sort(intervals,(a,b) -> a[0]-b[0]);
        ans[0][0]=intervals[0][0];
        ans[0][1]=intervals[0][1];
        for(int i=1; i<n; i++){
           if(intervals[i][0]<=ans[k][1]){
            ans[k][1]=Math.max(ans[k][1],intervals[i][1]);
           }else{
            k++;
            ans[k][0]=intervals[i][0];
            ans[k][1]=intervals[i][1];
           }
        } 
        return Arrays.copyOf(ans,k+1);
    }
}