package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;

/**
 * Main class for using rhymers
 */
public class DefaultRhymersFactory implements RhymersFactory {

	/**
	 * Method for get standard rhymer
	 *
	 * @return DefaultCountingOutRhymer
	 */
	@Override
	public DefaultCountingOutRhymer getStandardRhymer() {
		return new DefaultCountingOutRhymer();
	}

	/**
	 * Method for get false rhymer
	 * @return DefaultCountingOutRhymer
	 */
	@Override
	public DefaultCountingOutRhymer getFalseRhymer() {
		return new DefaultCountingOutRhymer();
	}

	/**
	 * Method for get fifo rhymer
	 * @return FIFORhymer
	 */
	@Override
	public DefaultCountingOutRhymer getFIFORhymer() {
		return new FIFORhymer();
	}

	/**
	 * Method for get hanoi rhymer
	 * @return HanoiRhymer
	 */
	@Override
	public DefaultCountingOutRhymer getHanoiRhymer() {
		return new HanoiRhymer();
	}

}
