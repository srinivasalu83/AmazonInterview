package leetcode;

public class RemoveNodes {

	public static void main(String[] args) {
		ListNode head = ListNode.createRemovableList();
		ListNode.print(head);
		head = removeCancellableNodes(head);
		ListNode.print(head);

	}

	static ListNode removeCancellableNodes(ListNode listHead)
	{
		if (listHead == null) return null; // or listHead
		ListNode fakeHead = new ListNode(0);
		ListNode current=fakeHead;
		fakeHead.next=listHead;
		while(current.next!=null){
			int sum=current.next.value;
			ListNode step=current.next.next;
			while(step!=null){
				sum=sum+step.value;
				if(sum==0)
					current.next=step.next;
				step=step.next;
			}
			current=current.next;
		}
		return fakeHead.next;
	}
}
