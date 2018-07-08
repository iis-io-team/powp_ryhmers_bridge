package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;
import edu.kis.vh.nursery.list.StackInterface;

/**
 * Klasa DefaultCountingOutRhymer została publiczna by można było korzystać z konkretnych jej implementacji oraz
 * budować ją w fabryce.
 */

public class DefaultCountingOutRhymer {

    private StackInterface stack;

    public DefaultCountingOutRhymer() {
        this.stack = new IntLinkedList();
    }

    public DefaultCountingOutRhymer(StackInterface stack) {
        this.stack = stack;
    }

    public int getTotal() {
        return stack.getSize();
    }

    void countIn(int in) {
        stack.push(in);
    }

    boolean callCheck() {
        return stack.isEmpty();
    }

    boolean isFull() {
        return stack.isFull();
    }

    int peekaboo() {
        return stack.top();
    }

    int countOut() {
        return stack.pop();
    }
}
