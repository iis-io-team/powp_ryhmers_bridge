package edu.kis.vh.nursery.collection;

public interface StackInterface {
    int LIST_IS_EMPTY_VALUE = -1;

    void push(int i);

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();

    int getSize();
}
