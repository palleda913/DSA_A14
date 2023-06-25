package in.linkedList;

import java.util.Stack;

public class Question7 {
	public static int[] nextGreaterNodes(ListNode head) {
       
        Stack<int[]> stack = new Stack<>();
        ListNode curr = head;
        int count = 0;
        while (curr != null) {
            curr = curr.next;
            count++;
        }
        int[] answer = new int[count];

        curr = head;
        for (int i = count - 1; i >= 0; i--) {
       
            while (!stack.isEmpty() && curr.val >= stack.peek()[0]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                answer[i] = 0;
            } else {
                answer[i] = stack.peek()[0];
            }

            stack.push(new int[]{curr.val, i});

            curr = curr.next;
        }

        return answer;
    }
	
	public static void main(String[] args) {
		
		ListNode node=new ListNode(2);
		node.next=new ListNode(1);
		node.next.next=new ListNode(5);

		
		int[] res = nextGreaterNodes(node);
		for(int ele:res)
			System.out.println(ele+" ");

	}

}
