class Solution {
    public int calPoints(String[] operations) {
       Stack<Integer> st=new Stack<>();
       int D=0;
       int sum=0;
       int total=0;
       for(int i=0; i<operations.length; i++){
        if(operations[i].equals("C")){
            st.pop();
        }else if(operations[i].equals("D")){
              D =2*st.peek();
              st.push(D);
        }else if(operations[i].equals("+")){
            sum = st.get(st.size()-1) + st.get(st.size()-2);
            st.push(sum);
        }else{
                st.push(Integer.parseInt(operations[i]));
        }
       }
         for(int x=0; x<st.size(); x++){
            total +=st.get(x);
         }
       return total;
    }
}