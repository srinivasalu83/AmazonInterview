package leetcode;

public class LC21MergeTwoSortedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);
		l1.next= l4;  // 1--> 4
		l2.next = l3;  // 2-->3
		LC21MergeTwoSortedLists mergeList = new LC21MergeTwoSortedLists();
		ListNode result = mergeList.merge(l1, l2);
		while(result!=null){
			System.out.println(result.value);
			result = result.next;
		}
	}

	public ListNode merge(ListNode first, ListNode second){
		ListNode head = new ListNode(-1);
		ListNode step=head;
		
		while(first!=null && second!=null){
			if(first.value>second.value){
				step.next=second;
				step=step.next;
				second=second.next;
			}else{
				step.next=first;
				step=step.next;
				first=first.next;
			}
		}//while
		if(first!=null)
			step.next=first;
		if(second!=null)
			step.next=second;
		return head.next;
	}
}
