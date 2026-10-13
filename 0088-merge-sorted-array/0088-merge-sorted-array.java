class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
      int i=0;
      int j=0;
      int k=0;
      int []merge=new int[m+n];
      //comparison
      while(i<m && j<n){
        if(nums1[i]<=nums2[j]){
         merge[k++]=nums1[i++];
        }
        else {
         merge[k++]=nums2[j++];
        }
      }
      //rest nums1 elements
       while( i<m ){
         merge[k++]=nums1[i++];
       }
      //rest nums2 elements
       while( j <n){
        merge[k++]=nums2[j++];
       }
      
          for(int l=0; l<merge.length; l++){
            nums1[l]=merge[l];
          }
      }
    }
