package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;

/**
 * Klasa DefaultCountingOutRhymer została publiczna by można było korzystać z konkretnych jej implementacji oraz
 * budować ją w fabryce.
 */

public class DefaultCountingOutRhymer {

    private IntLinkedList intLinkedList;

    public DefaultCountingOutRhymer() {
        this.intLinkedList = new IntLinkedList();
    }

    public DefaultCountingOutRhymer(IntLinkedList intLinkedList) {
        this.intLinkedList = intLinkedList;
    }

    public int getTotal() {
        return intLinkedList.getSize();
    }

    void countIn(int in) {
        intLinkedList.push(in);
    }

    boolean callCheck() {
        return intLinkedList.isEmpty();
    }

    boolean isFull() {
        return intLinkedList.isFull();
    }

    int peekaboo() {
        return intLinkedList.top();
    }

    int countOut() {
        return intLinkedList.pop();
    }
}
