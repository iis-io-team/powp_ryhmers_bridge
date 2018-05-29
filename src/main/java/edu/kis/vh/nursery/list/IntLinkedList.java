package edu.kis.vh.nursery.list;

class IntLinkedList {

	static final int EMPTY = -1;
	
	class Node {

		private final int value;
		private Node prev;
		private Node next;

		public Node(int value) {
			this.value = value;
		}

		public int getValue() {
			return value;
		}

		public Node getPrev() {
			return prev;
		}

		public void setPrev(Node prev) {
			this.prev = prev;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}
		
		/*
		 * W innych klasach ustawianie wartosci zostalo zamienione na uzycie settera a pobieranie na uzycie gettera
		 */
	}

	private Node last;

	public void push(int index) {
		if (getLast() == null)
			setLast(new Node(index));
		else {
			getLast().setNext(new Node(index));
			getLast().getNext().setPrev(getLast());
			setLast(getLast().getNext());
		}
	}

	public boolean isEmpty() {
		return getLast() == null;
	}

	public boolean isFull() {
		return false;
	}

	public int top() {
		if (isEmpty())
			return EMPTY;
		return getLast().getValue();
	}

	public int pop() {
		if (isEmpty())
			return EMPTY;
		int ret = getLast().getValue();
		setLast(getLast().getPrev());
		return ret;
	}

	Node getLast() {
		return last;
	}

	void setLast(Node last) {
		this.last = last;
	}
}
