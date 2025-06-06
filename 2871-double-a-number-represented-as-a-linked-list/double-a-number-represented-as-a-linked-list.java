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
    public ListNode reversell(ListNode head){
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
    public ListNode doubleIt(ListNode head) {
        ListNode nhead=reversell(head);
        ListNode dummy=new ListNode(-1);
        ListNode ans=dummy;
        int carry=0;
        while(nhead!=null){
            int sum=nhead.val+nhead.val+carry;
            int d=sum%10;
            carry=sum/10;
            ListNode temp=new ListNode(d);
            dummy.next=temp;
            dummy=dummy.next;
            nhead=nhead.next;
        }
        if(carry>0){
            ListNode temp=new ListNode(carry);
            dummy.next=temp;
        }
        ans=reversell(ans.next);
        return ans;
    }
}