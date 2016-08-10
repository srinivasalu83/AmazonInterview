package leetcode;

public class SwapKthElements {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(4);
		head.next.next.next = new ListNode(5);
		head.next.next.next.next = new ListNode(7);
		head.next.next.next.next.next = new ListNode(8);
		ListNode.print(head);
		head = swapKthElements(head, 2);
		ListNode.print(head);
	}

	public static ListNode swapKthElements(ListNode head, int k) {
		int n = 0;
		int i = 1; // start from head as index 1
		
		ListNode node = head;
		ListNode node1 = null;
		while (node != null) {
			if (i == k) {
				node1 = node;
			}
			node = node.next;
			i++;
		}
		int i2 = i - k; // kth from last 
		node = head;
		i = 1;
		ListNode node2 = null;
		while(node != null) {
			if (i == i2) {
				node2 = node;
			}
			node = node.next;
			i++;
		}
	
		int temp = node1.value;
		node1.value = node2.value;
		node2.value = temp;
		return head;
	}
}