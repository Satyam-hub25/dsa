class Solution {
    boolean checkPalindrome(String str){
        if(str.length()==1) return true;
        int i=0;
        int j=str.length()-1;
        while(i<j){
                if(str.charAt(i)==str.charAt(j)){
                    i++;
                    j--;
                }else{
                    return false;
                }
            }
           return true;
        }
    public int countSubstrings(String s) {
        int count=0;
        for(int i=0; i<s.length(); i++){
            for(int j=i; j<s.length(); j++){
                String sub=s.substring(i,j+1);
                if(checkPalindrome(sub)){
                    count++;
                }
            }
        }
        return count;
    }
}