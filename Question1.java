package in.linkedList;

public class Question1 {
	public static ListNode detectAndRemoveLoop(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }

        if (fast == null || fast.next == null) {
            return head;
        }

        slow = head;
        while (slow.next != fast.next) {
            slow = slow.next;
            fast = fast.next;
        }

        fast.next = null;

        return head;
    }
	public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
	public static void main(String[] args) {
		
		ListNode node=new ListNode(1);
		node.next=new ListNode(3);
		node.next.next=new ListNode(4);
		
		printList(detectAndRemoveLoop(node));

	}

}
