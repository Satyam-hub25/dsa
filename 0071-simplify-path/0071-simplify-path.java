class Solution {
    public String simplifyPath(String path) {
        String ch[]=path.split("/");
        //to remove somthing split use .split function()
        //use like path.split("/") matlabjah slash dikha waha tak  string  nikal lo
        //like "/dfffd//sdg/gfh"=="dfffd","sdg","gfh"; then add to stack normly an aplply / at strt position "/sdfds" like this;
        Stack<String> st=new Stack<>();
        for(int i=0; i<ch.length; i++){
              if(ch[i].equals("") || ch[i].equals(".")){
               continue;
              } else if(ch[i].equals("..")){
                if(!st.isEmpty()){
                st.pop();
                }
              }else{
                st.push(ch[i]);
            }
        }
            String ans="";
            for(int i=0; i<st.size(); i++){
                ans +="/"+st.get(i);
        }
        if(ans.isEmpty()){
            return "/";
        }
        return ans;
    }
}