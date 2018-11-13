/**
 * 
 * @author BK201
 *
 */
public class ReverseLinkedList {

	public class ListNode {
		
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode reverseList(ListNode head) {
		
		ListNode prev = null;
		ListNode current = head;
		ListNode next = null;
		
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
