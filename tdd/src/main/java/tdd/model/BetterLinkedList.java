package tdd.model;

public class BetterLinkedList {
	
	private Node head;
	private Node tail;
	
	static class Node{
		Object data;
		Node next;
		
		public Node(Object data, Node next) {
			this.data = data;
			this.next = next;
		}
		
		//Constructor to make the tail node
		public Node(Object data) {
			this.data = data;
			this.next = null;
		}
	}

	public BetterLinkedList(Object obj) {
		this.head = new Node(obj, null);
		this.tail = head;
	}

	public void add(Object obj) {
		Node adding = new Node(obj, null);
		this.tail.next = adding;
		this.tail = adding;
	}

	public void remove(int index) {
		if(index == 0) head = head.next;
		Node before = get(index-1);
		Node after = get(index+1);
		before.next = after;
	}

	public Node get(int index) {
		Node returning = head;
		for(int i = 1; i<=index; i++) {
			returning = returning.next;
		}
		return returning;
	}

	public void set(int index, Object obj) {
		get(index).data = obj;
	}

	public Node pop() {
		Node returning = head;
		head = head.next;
		return returning;
	}

	public void push(Object obj) {
		Node newTail = new Node(obj,null);
		tail.next = newTail;
		tail = newTail;
	}

	public Node getTail() {
		return tail;
	}
}
