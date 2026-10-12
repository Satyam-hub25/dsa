class Solution {
    public String reverseWords(String s) {
        //replace with coma,remove white spacce strt/end(use trim) and then
        String []ans=s.trim().split("\\s+");
        String res="";
         for(int i=ans.length-1; i>=0;i--){
               res+=ans[i]+" ";
         }
         return res.trim();
    }
}