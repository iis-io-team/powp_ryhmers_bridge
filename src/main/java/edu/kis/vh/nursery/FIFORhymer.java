package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

	public DefaultCountingOutRhymer counitngOutRhymer = new DefaultCountingOutRhymer();
	
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
