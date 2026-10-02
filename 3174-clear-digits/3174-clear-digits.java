class Solution {
    public String clearDigits(String s) {
        s=s.toLowerCase();
        Stack<Character> st=new Stack<>();
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
          if(Character.isLetter(ch)) {
            st.push(ch);
          }else if(Character.isDigit(ch)){
            st.pop();
          }else{
            st.push(ch);
          }
        }
                 StringBuilder str=new StringBuilder();
        for(int x=0; x<st.size(); x++){
            str.append(st.get(x));
        }
        return str.toString();
    }
}