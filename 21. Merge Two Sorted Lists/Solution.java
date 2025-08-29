class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    
ListNode dummy = new ListNode(0);//1. create a dummy node that functions as the head of the list. this is a new node
ListNode tail = dummy; //2. create a reference node to the tail. intalize it to the same node as the start of the list
ListNode L1 = list1, L2 = list2; //3. create a pointer to the beginning of both lists (L1 and L2, respectively)


while(L1 != null && L2 != null){ //loop until we reach the end of both lists
    if(L1.val<L2.val){
        tail.next = L1;// hook l1 to the dummy node's tail
        L1 = L1.next;//advace l1 down the list
    }else{
        tail.next = L2;// hook l2 to the dummy node's tail
        L2 = L2.next;//advance l2 down the list
    }
    tail = tail.next; //move the tail down one so we can add to the end of the linked list
}

tail.next = (L1 != null ? L1 : L2); //attachs the left over chain if one list is longer than the other

if(list1 == null){
    return list2;
}
if(list2 == null){
    return list1;
}
return dummy.next; //return the entire list but without the dummy node we used as as the sentinel node to reduce need for head special code
}
}
/*





**note: make sure values are sorted properly. 
 * 
 * 
 */
