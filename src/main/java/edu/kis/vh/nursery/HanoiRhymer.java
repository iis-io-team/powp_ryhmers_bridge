package edu.kis.vh.nursery;

/**
 * Klasa HanoiRhymer została publiczna ponieważ inaczej fabryka nie miała by do niej dostępu
 */

public class HanoiRhymer extends DefaultCountingOutRhymer {

	private int totalRejected = 0;

	public int reportRejected() {
		return totalRejected;
	}

	@Override
	public void countIn(int in) {
		if (!callCheck() && in > peekaboo())
			totalRejected++;
		else
			super.countIn(in);
	}
	
//	Działanie kombinacji klawiszy alt + <- i alt + -> 
//	to poruszanie się po historii ostatio używanych zakładek plików
}
