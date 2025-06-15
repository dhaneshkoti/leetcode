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
    public int sizeLL(ListNode head){
        ListNode curr=head;
        int count=0;
        while(curr!=null){
            count++;
            curr=curr.next;
        }
        return count;
    }
    public ListNode reverseLL(ListNode head){
        ListNode curr=head;
        ListNode pre=null;
        while(curr!=null){
            ListNode temp=curr.next;
            curr.next=pre;
            pre=curr;
            curr=temp;
        }
        return pre;
    }
    public int[] nextLargerNodes(ListNode head) {
        int size=sizeLL(head);
        int[] arr=new int[size];
        ListNode nhead=reverseLL(head);
        Stack<Integer> st=new Stack<>();
        st.push(nhead.val);
        ListNode curr=nhead.next;
        int ptr=size-2;
        while(ptr>=0){
            int ele=curr.val;
            curr=curr.next;
            while(st.size()>0&&st.peek()<=ele){
                st.pop();
            }
            if(st.size()==0){
                arr[ptr]=0;
            }
            else{
                arr[ptr]=st.peek();
            }
            st.push(ele);
            ptr--;
        }
        return arr;
    }
}