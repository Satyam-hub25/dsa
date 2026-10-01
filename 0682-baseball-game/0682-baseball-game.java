class Solution {
    public int calPoints(String[] operations) {
        int D=0;
        int sum=0;
        int total=0;
        Stack<Integer> st=new Stack<>();
      for(int i=0; i<operations.length; i++){
        //for c pop karo
        if(operations[i].equals("C")){
            st.pop();
            //for d 2*st peek value
        }else if(operations[i].equals("D")){
            D=2*st.peek();
            st.push(D);
            //for + sum of last 2 st value;
        }else if(operations[i].equals("+")){
            sum =st.get(st.size()-1)+st.get(st.size()-2);
            st.push(sum);
            //string to integer me convert krke st me push karo
        }else{
            st.push(Integer.parseInt(operations[i]));
        }
      }
      //run loop total sum of st value
      for(int  x=0; x<st.size(); x++){
        total +=st.get(x);
      }
      //return total
      return total;
    }
}


