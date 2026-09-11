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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        ListNode before=new ListNode();
        before.next=head;
        int length=0;
        ListNode counter=head;
        while(counter!=null){
            counter=counter.next;
            length++;
        }
        if(length==n){
            return head.next;
        }
        for(int i=0;i<length-n;i++){
            temp=temp.next;
            before=before.next;
        }
        before.next=temp.next;
    return head;
    }
}
