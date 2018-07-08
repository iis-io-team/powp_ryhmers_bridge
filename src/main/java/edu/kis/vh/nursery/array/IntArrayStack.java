package edu.kis.vh.nursery.array;

public class IntArrayStack {

    private static final int NUMBERS_CAPACITY = 12;

    private static final int EMPTY_STACK_VALUE = -1;

    private int[] numbers = new int[NUMBERS_CAPACITY];

    private int total = EMPTY_STACK_VALUE;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_STACK_VALUE;
    }

    public boolean isFull() {
        return total == NUMBERS_CAPACITY - 1;
    }

    public int peekaboo() {
        if (callCheck())
            return -1;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return numbers[total--];
    }

    public int getTotal() {
        return total;
    }

}
