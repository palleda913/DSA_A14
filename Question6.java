package in.linkedList;

public class Question6 {
	public static ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode oddDummy = new ListNode(0);
        ListNode evenDummy = new ListNode(0);
        ListNode odd = oddDummy;
        ListNode even = evenDummy;
        ListNode curr = head;
        int index = 1;

        while (curr != null) {
            if (index % 2 == 1) {
                odd.next = curr;
                odd = odd.next;
            } else {
                even.next = curr;
                even = even.next;
            }
            curr = curr.next;
            index++;
        }

        odd.next = evenDummy.next;
        even.next = null;

        return oddDummy.next;
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
		
		printList(oddEvenList(node));

	}

}
