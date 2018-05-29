package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

	private DefaultCountingOutRhymer defaultCountingOutRyhmer = new DefaultCountingOutRhymer();

	@Override
	public int countOut() {
		while (!callCheck())
			defaultCountingOutRyhmer.countIn(super.countOut());

		int ret = defaultCountingOutRyhmer.countOut();

		while (!defaultCountingOutRyhmer.callCheck())
			countIn(defaultCountingOutRyhmer.countOut());

		return ret;
	}
}
