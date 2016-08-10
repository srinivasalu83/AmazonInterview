package leetcode;

public class LC206ReverseLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = ListNode.createList();
		ListNode.print(head);
		head = recursvie(head);
		ListNode.print(head);

	}

	public static ListNode reverse(ListNode head){
		if(head==null || head.next==null)
			return head;
		ListNode p1=head;
		ListNode p2=head.next;
		head.next=null;
		while(p2!=null){
			ListNode tmp=p2.next;
			p2.next=p1;
			p1=p2;
			p2=tmp;
		}
		return p1;
	}
	
	public static ListNode recursvie(ListNode head){
	    if(head==null || head.next == null)
	        return head;
	 
	    //get second node    
	    ListNode second = head.next;
	    //set first's next to be null
	    head.next = null;
	 
	    ListNode rest = recursvie(second);
	    second.next = head;
	 
	    return rest;
		
	}
}
