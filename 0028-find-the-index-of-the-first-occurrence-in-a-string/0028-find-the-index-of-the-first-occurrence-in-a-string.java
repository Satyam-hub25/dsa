class Solution {
    public int strStr(String haystack, String needle) {
        int n=haystack.length();
        int k=needle.length();
        for(int i=0; i<=n-k; i++){
         String find=haystack.substring(i,i+k);
                if(find.equals(needle)){
                    return i;
                }
        }
                    return -1;
    }
}