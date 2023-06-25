package in.linkedList;

public class Question5 {
	public static ListNode leftShiftLinkedList(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        ListNode kthNode = head;
        int count = 1;
        while (count < k && kthNode != null) {
            kthNode = kthNode.next;
            count++;
        }

        if (kthNode == null) {
            return head;
        }

        ListNode lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }


        lastNode.next = head;
        head = kthNode.next;

        kthNode.next = null;

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
		node.next.next=new ListNode(2);
		node.next.next.next=new ListNode(4);
		node.next.next.next.next=new ListNode(8);
		node.next.next.next.next.next=new ListNode(9);
		
		printList( leftShiftLinkedList(node,3));

	}

}
