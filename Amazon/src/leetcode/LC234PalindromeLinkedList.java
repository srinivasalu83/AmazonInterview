package leetcode;

public class LC234PalindromeLinkedList {

	public static void main(String[] args) {
		ListNode head = ListNode.createPalindromeList();
		ListNode.print(head);
		System.out.println(isPalindrome(head));
	}

	public static boolean isPalindrome(ListNode head) {
		// input check abcba abccba
		if (head == null || head.next == null)
			return true;

		ListNode middle = partition(head);
		middle = reverse(middle);

		while (head != null && middle != null) {
			if (head.value != middle.value)
				return false;
			head = head.next;
			middle = middle.next;
		}
		return true;
	}

	private static ListNode partition(ListNode head) {
		ListNode p = head;
		while (p.next != null && p.next.next != null) {
			p = p.next.next;
			head = head.next;
		}

		p = head.next;
		head.next = null;
		return p;
	}

	private static ListNode reverse(ListNode head) {
		if (head == null || head.next == null)
			return head;
		ListNode pre = head;
		ListNode cur = head.next;
		pre.next = null;
		ListNode nxt = null;

		while (cur != null) {
			nxt = cur.next;
			cur.next = pre;
			pre = cur;
			cur = nxt;
		}
		return pre;
	}

}
