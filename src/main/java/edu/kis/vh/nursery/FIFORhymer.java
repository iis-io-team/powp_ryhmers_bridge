package edu.kis.vh.nursery;

import edu.kis.vh.nursery.collection.IntLinkedList;
import edu.kis.vh.nursery.collection.StackInterface;

/**
 * Klasa FIFORhymer została publiczna ponieważ inaczej fabryka nie miała by do niej dostępu
 */

public class FIFORhymer extends DefaultCountingOutRhymer {

	public StackInterface stack = new IntLinkedList();

	public FIFORhymer() {
		super();
	}

	public FIFORhymer(StackInterface stack) {
		super(stack);
	}

	@Override
	public int countOut() {
		while (!callCheck())
			stack.push(super.countOut());
		
		int ret = stack.pop();
		
		while (!stack.isEmpty())
			countIn(stack.pop());

		return ret;
	}
}
