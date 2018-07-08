package edu.kis.vh.nursery.list;

public class IntLinkedList implements StackInterface {

	private Node last;
	private int index;
	private int size;


	@Override
    public void push(int i) {
		if (getLast() == null)
			setLast(new Node(i));
		else {
			getLast().setNext(new Node(i));
			getLast().getNext().setPrev(getLast());
			setLast(getLast().getNext());
		}
		size++;
	}

	@Override
    public boolean isEmpty() {
		return getLast() == null;
	}

	@Override
    public boolean isFull() {
		return false;
	}

	@Override
    public int top() {
		if (isEmpty())
			return -1;
		return getLast().getValue();
	}

	@Override
    public int pop() {
		if (isEmpty())
			return -1;
		int ret = getLast().getValue();
		setLast(getLast().getPrev());
		size--;
		return ret;
	}

	@Override
    public int getSize() {
		return size;
	}

	Node getLast() {
		return last;
	}

	void setLast(Node last) {
		this.last = last;
	}

	int getIndex() {
		return index;
	}

	class Node {

		private int value;
		private Node prev;
		private Node next;

		public Node(int i) {
			setValue(i);
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
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

	}

}
