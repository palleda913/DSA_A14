package in.linkedList;

public class Question2 {

	public static ListNode addOneWithNode(ListNode head) {
		
		ListNode current=head;
		
		if(current==null)
			return null;;
		
		while(current.next!=null) {
			current=current.next;
		}
		if(current.val!=9) {
			current.val=current.val+1;
		}else {
			current.val=0;
			current.prev.val=current.prev.val+1;
		}
			
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
		
		ListNode node=new ListNode(2);
		node.next=new ListNode(8);
		node.next.next=new ListNode(6);
		
		printList(addOneWithNode(node));

	}

}
