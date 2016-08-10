package leetcode;

public class ListNode {
	 int value;
	 ListNode next;
	 ListNode(int x) {
		 value = x;
		 next = null;
	 }
	 
	 public static ListNode createList(){
			ListNode head = new ListNode(1);
	        ListNode three = new ListNode(3);
	        ListNode seven = new ListNode(7);
	        ListNode eleven = new ListNode(11);
	        ListNode thirteen = new ListNode(13);
	        ListNode seventeen = new ListNode(17);
	        ListNode nineteen = new ListNode(19);
	        ListNode twentyThree = new ListNode(23);
	        head.next=three;
	        three.next=seven;
	        seven.next=eleven;
	        eleven.next=thirteen;
	        thirteen.next=seventeen;
	        seventeen.next=nineteen;
	        nineteen.next=twentyThree;
	        return head;
	 }
	 
	 public static ListNode createRemovableList(){
			ListNode head = new ListNode(6);
	        ListNode one = new ListNode(-6);
	        ListNode two = new ListNode(8);
	        ListNode three = new ListNode(4);
	        ListNode four = new ListNode(-12);
	        ListNode five = new ListNode(9);
	        ListNode six = new ListNode(8);
	        ListNode seven = new ListNode(-8);
	        head.next=one;
	        one.next=two;
	        two.next=three;
	        three.next=four;
	        four.next=five;
	        five.next=five;
	        five.next=seven;
	        return head;
	 }
	 
	 public static ListNode createPalindromeList(){
			ListNode head = new ListNode(1);
	        ListNode three = new ListNode(3);
	        ListNode seven = new ListNode(7);
	        ListNode eleven = new ListNode(11);
	        ListNode thirteen = new ListNode(11);
	        ListNode seventeen = new ListNode(7);
	        ListNode nineteen = new ListNode(3);
	        ListNode twentyThree = new ListNode(1);
	        head.next=three;
	        three.next=seven;
	        seven.next=eleven;
	        eleven.next=thirteen;
	        thirteen.next=seventeen;
	        seventeen.next=nineteen;
	        nineteen.next=twentyThree;
	        return head;
	 }
	 
	 public static void print(ListNode head){
		 while(head!=null){
			 System.out.print(head.value+"->");
			 head=head.next;
			 }
		 System.out.println("null");
	 }
}
