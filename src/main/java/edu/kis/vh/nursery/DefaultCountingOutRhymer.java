package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;
import edu.kis.vh.nursery.list.StackInterface;

/**
 * Klasa DefaultCountingOutRhymer została publiczna by można było korzystać z konkretnych jej implementacji oraz
 * budować ją w fabryce.
 *
 * Po zmianach wprowadzonych w zadaniu 3.1.5 i 3.1.6 (Bridge) Klasa DefaultCountingOutRhymer jest uniwersalna pod kątem
 * implementacji listy. Można wykorzystać i IntLinkedList jak i IntArrayStack.
 * Domyślnie jest stosowany IntLinkedList.
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
