package in.linkedList;

public class Question8 {
	public ListNode removeZeroSum(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy;
        int sum = 0;

        while (curr != null && curr.next != null) {
            sum += curr.next.val;

            if (sum == 0) {
                ListNode nextNode = curr.next.next;
                while (nextNode != null && nextNode.val == 0) {
                    nextNode = nextNode.next;
                }
                curr.next = nextNode;
                curr = dummy; 
                sum = 0;
            } else {
                curr = curr.next;
            }
        }

        return dummy.next;
    }

}
