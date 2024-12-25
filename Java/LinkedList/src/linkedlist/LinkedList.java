package linkedlist;

public class LinkedList {
	private Node head;
	private Node tail;
	private int length;
	
	public class Node{
		int val;
		Node next;
		Node(int val){
			this.val=val;
		}
	}
	public LinkedList(int val) {
		Node newNode=new Node(val);
		head=newNode;
		tail=newNode;
		length++;
	}
	
	//Prepend the Item in the linked list
	public void prependList(int val) {
		Node newNode=new Node(val);
		if(length==0) {
			head=newNode;
			tail=newNode;
		}
		newNode.next=head;
		head=newNode;
		length++;
	}
	
	// Append the linked list 
	public void appendList(int val) {
		Node newNode=new Node(val);
		if(length==0) {
			head=newNode;
			tail=newNode;
		}else {
			tail.next=newNode;
			tail=tail.next;
		}
		length++;
	}
	//Remove First item from the Linked list
	public Node removeFirst() {
		if(length==0)return null;
		Node temp=head;
		head=head.next;
		temp.next=null;
		length--;
		if(length==0) {
			tail=null;
		}
		return head;
	}
	//Remove the Last Node From the Linked List
	public Node removeLast() {
		if(length==0)return null;
		Node temp=head;
		Node pre = null;
		while(temp.next!=null) {
			pre=temp;
			temp=temp.next;
		}
		tail=pre;
		tail.next=null;
		length--;
		return head;
	}
	// get the Item from the list from the index;
	public Node get(int idx) {
		if(idx<0 || idx>length) return null;
		Node temp=head;
		while(idx!=0) {
			temp=temp.next;
			idx--;
		}
		return temp;
	}
	// set or update the item in the linked list
	public boolean set(int idx,int val) {
		if(idx<0 || idx>length)return false;
		Node temp=get(idx);
		if(temp!=null) {
			temp.val=val;
			return true;
		}
		return false;		
	}
	// insert the new item in the linked list 
	public boolean insert(int idx,int val) {
		if(idx<0 || idx>length) return false;
		Node temp=get(idx-1);
		Node newNode=new Node(val);
		if(idx==0) {
			prependList(val);
			return true;
		}
		if(idx==length) {
			appendList(val);
			return true;
		}
		newNode.next=temp.next;
		temp.next=newNode;
		length++;
		return true;		
	}
	// Remove the item from the list 
	public Node remove(int idx) {
		if(idx<0 || idx>=length) return null;
		if(idx==0)return removeFirst();
		if(idx==length-1) return removeLast();
		Node pre = get(idx-1);
		Node temp=pre.next;
		pre.next=temp.next;
		temp.next=null;
		length--;
		
		return temp;		
	}
	//Reverse the list
	public Node reverse() {
		Node temp=head;
		Node bef=null;
		Node after=null;
		head=tail;
		tail=temp;
		while(temp!=null) {
			after=temp.next;
			temp.next=bef;
			bef=temp;
			temp=after;
		}
		return temp;
	}
	
	public void printList() {
		if(length==0) {
			System.out.println("No Node present in the linked list");
		}
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.val+"->");
			temp=temp.next;
		}
		System.out.print("null");
	}
}
