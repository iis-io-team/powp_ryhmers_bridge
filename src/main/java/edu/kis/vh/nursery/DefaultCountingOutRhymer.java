package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int initialtotal = -1;

	private static final int arraysize = 12;

	private int[] numbers = new int[arraysize];

	public int total = initialtotal;

	public int getTotal() {
		return total;
	}

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == initialtotal;
	}

	public boolean isFull() {
		return total == 11;
	}

	protected int prevValue() {
		if (callCheck())
			return initialtotal;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return initialtotal;
		return numbers[total--];
	}

}
