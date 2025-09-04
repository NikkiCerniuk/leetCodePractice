class Solution {
    public ListNode deleteDuplicates(ListNode head) {
         if (head == null){
            return null;
        }

       ListNode current = head;

       while(current != null){


        while(current.next != null && current.val == current.next.val){
            current.next = current.next.next;
        }
        current = current.next;


       }
       return head;

}
}
/*
 * space complexity = 0(1)
 *  - we do not create anything new outside of constants. we are just rearraging and garbage collecting an existing linked list 
 * time complexity = 0(n)
 *  - we have to iterate through the entire linked list once 
 * 
 */
