package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	private int totalRejected = 0;

	public int reportRejected() {
		return totalRejected;
	}
	
	@Override
	public void countIn(int in) {
	if (!callCheck() && in > lastValue())
		totalRejected++;
	else
		super.countIn(in);
	}
// Alt + Right Arrow = przejscie do przodu po plikach, zgodnie z kolejnoscia edycji.
// Alt + Left Arrow = przejscie wstecz po plikach zgodnie historia edycji.
}
