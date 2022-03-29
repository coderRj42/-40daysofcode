class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode previous=null;
        ListNode currentNode=head;
        while(currentNode !=null){
            ListNode next= currentNode.next;
            currentNode.next=previous;
            previous= currentNode;
            currentNode=next;
        }
        return previous;
    }
}
