package edu.kis.vh.nursery;

/**
 * @author Mrucznik
 * Klasa zawierająca implementacje wyliczanki typu Hanoi
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {

	private int totalRejected = 0;

	/**
	 * @return ilość odrzuconych liczb
	 */
	public int reportRejected() {
		return totalRejected;
	}

	/**
	 * Funkcja uruchamiajaca wyliczankę
	 * @param in ilość liczb do wyliczenia
	 */
	@Override
	public void countIn(int in) {
		if (!callCheck() && in > peekaboo())
			totalRejected++;
		else
			super.countIn(in);
	}
}
