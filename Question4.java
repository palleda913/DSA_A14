package in.linkedList;

public class Question4 {

	 public ListNode copyRandomList(ListNode head) {
	        if (head == null) {
	            return null;
	        }

	        ListNode curr = head;
	        while (curr != null) {
	        	ListNode copy = new ListNode(curr.val);
	            copy.next = curr.next;
	            curr.next = copy;
	            curr = copy.next;
	        }
	        curr = head;
	       
	        ListNode dummy = new ListNode(0);
	        ListNode tail = dummy;
	        curr = head;
	        while (curr != null) {
	            tail.next = curr.next;
	            tail = tail.next;
	            curr.next = curr.next.next;
	            curr = curr.next;
	        }

	        return dummy.next;
	 }
	 

}
