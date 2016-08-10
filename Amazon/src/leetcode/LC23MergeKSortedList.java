package leetcode;

import java.util.ArrayList;

public class LC23MergeKSortedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1 = new ListNode(1);
		ListNode l3 = new ListNode(3);
		ListNode l2 = new ListNode(2);
		ListNode l4 = new ListNode(4);
		ListNode l5 = new ListNode(5);
		ListNode l6 = new ListNode(6);
		l1.next= l4;
		l2.next = l3;
		l5.next =l6;
		ArrayList<ListNode> lists = new ArrayList<ListNode>();
		lists.add(l1);
		lists.add(l2);
		lists.add(l5);
		LC23MergeKSortedList ksort = new LC23MergeKSortedList();
		ListNode result =ksort.merge(lists, 0, lists.size()-1);
		while(result!=null){
			System.out.println(result.value);
			//if(result.next!=null)
			result = result.next;
		}
	}
	
	public ListNode merge(ArrayList<ListNode> lists, int start, int end){
		if(start<end){
		    int mid =(start+end)/2; 
		    return mergeTwoLists(merge(lists, start, mid), merge(lists, mid+1, end));
		    }
		return lists.get(start);	
     }
	

	public ListNode mergeTwoLists(ListNode l1, ListNode l2){
		//ListNode p1 = l1;
		//ListNode p2 = l2;
		ListNode fakeHead = new ListNode(0);
		ListNode tmp = fakeHead;
		while(l1!=null && l2!=null){
			if(l1.value <= l2.value){
				tmp.next = l1;
				l1=l1.next;
			}else{
				tmp.next=l2;
				l2=l2.next;
			}
			tmp = tmp.next;
		}
		if(l1 !=null)
			tmp.next =l1;
		else
			tmp.next =l2;
		
		return fakeHead.next;
	}
}
