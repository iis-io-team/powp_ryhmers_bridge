package edu.kis.vh.nursery;

import edu.kis.vh.nursery.array.IntArrayStack;

/**
 * Klasa DefaultCountingOutRhymer została publiczna by można było korzystać z konkretnych jej implementacji oraz
 * budować ją w fabryce.
 */

public class DefaultCountingOutRhymer {

    private IntArrayStack intArrayStack;

    public DefaultCountingOutRhymer() {
        this.intArrayStack = new IntArrayStack();
    }

    public DefaultCountingOutRhymer(IntArrayStack intArrayStack) {
        this.intArrayStack = intArrayStack;
    }

    public int getTotal() {
        return intArrayStack.getTotal();
    }

    void countIn(int in) {
        intArrayStack.countIn(in);
    }

    boolean callCheck() {
        return intArrayStack.callCheck();
    }

    boolean isFull() {
        return intArrayStack.isFull();
    }

    int peekaboo() {
        return intArrayStack.peekaboo();
    }

    int countOut() {
        return intArrayStack.countOut();
    }
}
