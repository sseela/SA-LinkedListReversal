
public class CustomLinkedList {

	static Node head;
	
	static class Node {
		int data;
		Node next;
		
		Node(int d) {
			this.data = d;
			this.next = null;
		}
	}
	
	public Node reverse(Node node) {
		Node current = node;
		Node next = null;
		Node previous = null;
		
		while(current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		node = previous;
		return node;
	}
	
	public static void printList(Node node) {
		while(node != null) {
			System.out.println(node.data+" ");
			node = node.next;
		}
	}
	
	public static void main(String[] args) {
		CustomLinkedList list = new CustomLinkedList();
		list.head = new Node(10);
		list.head.next = new Node(20);
		list.head.next.next = new Node(30);
		list.head.next.next.next = new Node(40);
		System.out.println("before reversing: ");
		printList(head);
		
		head = list.reverse(head); 
		
        System.out.println(""); 
        System.out.println("Reversed linked list "); 
        printList(head); 
		
	}
	
	
	
	
}
