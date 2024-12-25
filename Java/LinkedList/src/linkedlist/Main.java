package linkedlist;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList mylinkedList=new LinkedList(10);
		mylinkedList.appendList(11);
		mylinkedList.appendList(12);
		mylinkedList.appendList(13);
		mylinkedList.appendList(14);
		mylinkedList.appendList(15);
		System.out.print("After Append the list :- ");
		mylinkedList.printList();
		
		System.out.print("\n\nAfter PreAppend the list :- ");
		mylinkedList.prependList(9);
		mylinkedList.printList();
		
		System.out.print("\n\nAfter Remove the first item from the list :- ");
		mylinkedList.removeFirst();
		mylinkedList.printList();
		
		System.out.print("\n\nAfter Remove the last item from the list :- ");
		mylinkedList.removeLast();
		mylinkedList.printList();
		
		System.out.print("\n\nExtracted Node "+mylinkedList.get(2).val);
		
		System.out.print("\n\nAfter change the value ");
		mylinkedList.set(4, 15);
		mylinkedList.printList();
		
		System.out.print("\n\nAfter insert the item in the list ");
		mylinkedList.insert(4, 14);
		mylinkedList.printList();
		
		System.out.print("\n\nAfter Remove the item from the list ");
		mylinkedList.remove(5);
		mylinkedList.printList();
		
		System.out.print("\n\nAfter Reverse the item in the list ");
		mylinkedList.reverse();
		mylinkedList.printList();

	}

}
