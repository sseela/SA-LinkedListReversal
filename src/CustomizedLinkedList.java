public class CustomizedLinkedList {
	static Node head;
	
	static class Node {
		int data;
		Node next;
		Node(int d) {
			this.data = d;
			this.next = null;
		}
	}
	
	public static Node reverse(Node node) {
		Node current = node;
		Node previous = null;
		Node next = null;
		while(current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		return previous;
	}
	
	public static void printList(Node node) {
		while(node != null) {
			System.out.print(node.data+" ");
			node = node.next;
		}
	}
	
	public static void main(String[] args) {
		CustomizedLinkedList list = new CustomizedLinkedList();
		list.head = new Node(10);
		list.head.next = new Node(20);
		list.head.next.next = new Node(30);
		list.head.next.next.next = new Node(40);
		printList(head);
		
		head = reverse(head);
		printList(head);
		
	}
	
	
}
