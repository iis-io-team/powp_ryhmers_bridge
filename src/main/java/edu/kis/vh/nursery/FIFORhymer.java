package edu.kis.vh.nursery;

import edu.kis.vh.nursery.collection.IntLinkedList;
import edu.kis.vh.nursery.collection.StackInterface;

/**
 * Klasa FIFORhymer została publiczna ponieważ inaczej fabryka nie miała by do niej dostępu
 *
 * Zastosowałem kolejkę IntLinkedList ze względu na (teoretycznie) nieograniczone miejsce w kolejce.
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
	    //Tutaj jest łamana zasada izolacji ponieważ odwołujemy się bezpośrednio do metod klasy IntLinkedList.
		while (!callCheck())
			stack.push(super.countOut());
		
		int ret = stack.pop();
		
		while (!stack.isEmpty())
			countIn(stack.pop());

		return ret;
	}
}
