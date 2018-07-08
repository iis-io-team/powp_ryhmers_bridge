package edu.kis.vh.nursery.collection;

public interface StackInterface {
    int LIST_IS_EMPTY_VALUE = 0;
    //Zmiany wprowadzone w zadaniu 3.1.10 definitywnie pomogły. Jeżeli byłoby więcej niż dwie klasy które implementują
    //ten interfejs trzeba by było w każdej klasie uwzględniać te zmiany.

    void push(int i);

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();

    int getSize();
}
