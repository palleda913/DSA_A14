package in.linkedList;

public class Question3 {
	public ListNode flatten(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        head.next = flatten(head.next);
        head = merge(head, head.next);

        return head;
    }

    private ListNode merge(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        ListNode curr = list1;
        ListNode nextNode = list2;

        while (curr != null && nextNode != null) {
            if (curr.val < nextNode.val) {
                tail.bottom = curr;
                curr = curr.bottom;
            } else {
                tail.bottom = nextNode;
                nextNode = nextNode.bottom;
            }
            tail = tail.bottom;
        }

        if (curr != null) {
            tail.bottom = curr;
        } else {
            tail.bottom = nextNode;
        }

        return dummy.bottom;
    }

}
