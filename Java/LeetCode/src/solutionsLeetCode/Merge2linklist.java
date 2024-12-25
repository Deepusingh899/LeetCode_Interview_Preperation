package solutionsLeetCode;

import java.util.*;
class Node {
    int data;
    Node next;
 
    Node(int d) {
        data = d;
        next = null;
    }
}

public class Merge2linklist {
	Node head;
	
	public void addNode(Node node) {
		if(head==null) {
			head=node;			
		}else {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=node;
		}
	}
	public void printList() {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Merge2linklist list1= new Merge2linklist();
		Merge2linklist list2=new Merge2linklist();
		Merge2linklist list3=new Merge2linklist();
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		
		for(int i=0;i<n1;i++) {
			list1.addNode(new Node(sc.nextInt()));
		}
		for(int i=0;i<n2;i++) {
			list2.addNode(new Node(sc.nextInt()));
		}
		
		list3.head=new mergeSortedList().mergeTwoLists(list1.head,list2.head);
		list3.printList();
	}

}
class mergeSortedList{
	public Node mergeTwoLists(Node list1,Node list2) {
		Node currNode=new Node(0);
		if(list1==null) {
			return currNode.next=list2;
		}
		if(list2==null) {
			return currNode.next=list1;
		}
		if(list1.data<list2.data) {
			currNode.next=list1;
			list1.next=mergeTwoLists(list1.next,list2);
			currNode=currNode.next;
		}
		else {
			currNode.next=list2;
			list2.next=mergeTwoLists(list1,list2.next);
			currNode=currNode.next;
		}
		return currNode;
	}
}
