package edu.kis.vh.nursery;

import edu.kis.vh.nursery.collection.StackInterface;

/**
 * Klasa FIFORhymer została publiczna ponieważ inaczej fabryka nie miała by do niej dostępu
 */

public class FIFORhymer extends DefaultCountingOutRhymer {

	public DefaultCountingOutRhymer counitngOutRhymer = new DefaultCountingOutRhymer();

	public FIFORhymer() {
		super();
	}

	public FIFORhymer(StackInterface stack) {
		super(stack);
	}

	@Override
	public int countOut() {
		while (!callCheck())
			counitngOutRhymer.countIn(super.countOut());
		
		int ret = counitngOutRhymer.countOut();
		
		while (!counitngOutRhymer.callCheck())
			countIn(counitngOutRhymer.countOut());

		return ret;
	}
}
