package leetcode;

public class LC2AddTwoNumbers {

	public static void main(String[] args) {
		ListNode list12=new ListNode(2);
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
		
		LC2AddTwoNumbers twoNumber = new LC2AddTwoNumbers();
		ListNode sum = twoNumber.addTwoNumbers2(list12, list25);
		while(sum!=null){
			System.out.print(sum.value);
			sum=sum.next;
		}
	}
	
	public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        int carrier =0;
		ListNode result = new ListNode(-1);  
		ListNode sum = result;  

		while(l1!=null && l2!=null){
			int val = l1.value+l2.value+carrier;
			carrier=val/10;
			val=val%10;
		    sum.next = new ListNode(val);  
		    sum = sum.next;  
			l1 = l1.next;
            l2 = l2.next;
		}
		while(l1!=null){
			int val = l1.value+carrier;
			carrier=val/10;
			val=val%10;
		    sum.next = new ListNode(val);  
		    sum = sum.next;  
			l1 = l1.next;
		}
		while(l2!=null){
			int val = l2.value+carrier;
			carrier=val/10;
			val=val%10;
		    sum.next = new ListNode(val);  
		    sum = sum.next;  
		    l2 = l2.next;
		}
		if(carrier>0)
			sum.next = new ListNode(carrier);
		return result.next;
    }

	public ListNode addTwoNumbers(ListNode first, ListNode second) {
		ListNode head = new ListNode(-1);
		head.next=first;
		boolean flag = false;
		while(first!=null&&second!=null){
			int sum=0;
			if(flag)
			    sum = first.value+second.value+1;
			else
				sum = first.value+second.value;
			if(sum>9){
				sum=sum-10;
				flag=true;
			}else{
				flag=false;
			}
			first.value=sum;
			if(first.next==null && second.next!=null){
                first.next=second;
                second.next=null;
			}
			first = first.next;
			second = second.next;
		}
		
		//process rest
		while(first!=null){
			int sum=0;
			if(flag)
			    sum = first.value+1;
			else
				sum= first.value;
			if(sum>9){
				sum=sum-10;
				flag=true;
			}else{
				flag=false;
			}
			first.value=sum;
			if(first.next==null&&flag){
				ListNode rest = new ListNode(1);
				first.next = rest;
				break;
				}
			first = first.next;

		}
		return head.next;
	}
}
