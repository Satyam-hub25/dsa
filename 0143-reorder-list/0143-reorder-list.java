/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
       ArrayList<ListNode> list=new ArrayList<>();
       //all listNode ko add karo list me 
       for(ListNode i=head; i!=null ; i=i.next){
        list.add(i);
       }
       //normalyy ab list me ad karo first and last dono ko 
       int first=0;
       int last=list.size()-1;
       ListNode temp=head;
       while(first<=last){
        //jab tak index chota hoga pichle wale se tab tak aage wale ko print karo
            temp.next=list.get(first);
            temp=temp.next;
            first++;
            //actual coaprision agar true hai to first ke agle se last ko add and so on okk
             if(first<=last){
                temp.next=list.get(last);
                temp=temp.next;
                last--;
             }    
       } 
       temp.next=null;
    }
}