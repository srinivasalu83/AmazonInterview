package leetcode;

public class LC2AddTwoNumbersII {

	public static void main(String[] args) {
		ListNode list12=new ListNode(4);
		ListNode list14=new ListNode(4);
		ListNode list13=new ListNode(5);
		//ListNode rest1=new ListNode(9);
		list12.next=list14;
		list14.next=list13;
		//list13.next=rest1;
		ListNode list25=new ListNode(5);
		ListNode list26=new ListNode(6);
		ListNode list24=new ListNode(4);
		list25.next =list26;
		list26.next=list24;
		
		LC2AddTwoNumbersII twoNumber = new LC2AddTwoNumbersII();
		ListNode sum = twoNumber.addTwoNumbersReverse(list12, list25);
		while(sum!=null){
			System.out.print(sum.value);
			sum=sum.next;
		}
	}
	
	public ListNode addTwoNumbersReverse(ListNode l1, ListNode l2) {
		ListNode previous=recersive(l1, l2);
	     if(previous.value>10){
			 int carrier = previous.value/10;
		     previous.value=previous.value%10;
		     ListNode head= new ListNode(carrier);
		     head.next=previous;
		     return head;
	     }
        return previous;
    }

	private ListNode recersive(ListNode l1, ListNode l2) {
		if(l1.next==null)
        	return new ListNode(l1.value+l2.value);
        ListNode previous= recersive(l1.next,l2.next);
        int carrier = previous.value/10;
        previous.value=previous.value%10;
        ListNode sum=new ListNode(l1.value+l2.value+carrier);
        sum.next=previous;
		return sum;
	}


}
