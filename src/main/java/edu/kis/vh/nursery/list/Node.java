package edu.kis.vh.nursery.list;

class Node {

	Node next;
	private int value;
	private Node prev;

	Node(int i) {
		setValue(i);
	}

	Node getNext() {
		return next;
	}

	void setNext(Node next) {
		this.next = next;
	}

	Node getPrev() {
		return prev;
	}

	void setPrev(Node prev) {
		this.prev = prev;
	}

	int getValue() {
		return value;
	}

	private void setValue(int value) {
		this.value = value;
	}
	
}
