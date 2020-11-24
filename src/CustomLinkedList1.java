
public class CustomLinkedList1 {
	private static Node head;
	
	static class Node {
		private int data;
		private Node next;
		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public static Node reverse(Node head) {
		Node current = head;
		Node next = null;
		Node previous = null;
		while(current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		return previous;
	}
	
	public static void print(Node node) {
		while(node != null) {
			System.out.println(node.data+" ");
			node = node.next;
		}
	}
	
	public static void main(String[] args) {
		CustomLinkedList1 list = new CustomLinkedList1();
		list.head = new Node(10);
		list.head.next = new Node(20);
		list.head.next.next = new Node(30);
		list.head.next.next.next = new Node(40);
		System.out.println("before reversal: ");
		print(head);
		System.out.println("after reversal: ");
		Node h = reverse(head);
		print(h);
	}
}
