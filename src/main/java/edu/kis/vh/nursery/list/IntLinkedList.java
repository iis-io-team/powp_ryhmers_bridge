package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private Node last;

    protected static boolean isFull() {
        return false;
    }

    protected void push(int i) {
        if (last == null) {
            last = new Node(i);
        } else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.next;
		}
	}

    private boolean isEmpty() {
		return last == null;
	}

    protected int top() {
        if (isEmpty()) {
            return -1;
        }
        
        return last.getValue();
	}

    protected int pop() {
        if (isEmpty()) {
            return -1;
        }

        int ret = last.getValue();
        last = last.getPrev();

		return ret;
	}

}
