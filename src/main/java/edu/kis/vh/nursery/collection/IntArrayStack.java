package edu.kis.vh.nursery.collection;

public class IntArrayStack implements StackInterface {

    private static final int NUMBERS_CAPACITY = 12;

    private static final int EMPTY_STACK_VALUE = -1;

    private int[] numbers = new int[NUMBERS_CAPACITY];

    private int total = EMPTY_STACK_VALUE;

    public void push(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean isEmpty() {
        return total == EMPTY_STACK_VALUE;
    }

    public boolean isFull() {
        return total == NUMBERS_CAPACITY - 1;
    }

    public int top() {
        if (isEmpty())
            return LIST_IS_EMPTY_VALUE;
        return numbers[total];
    }

    public int pop() {
        if (isEmpty())
            return LIST_IS_EMPTY_VALUE;
        return numbers[total--];
    }

    public int getSize() {
        return total;
    }

}
