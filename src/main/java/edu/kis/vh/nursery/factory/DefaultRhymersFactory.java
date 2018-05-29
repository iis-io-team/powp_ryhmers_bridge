package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;
import edu.kis.vh.nursery.factory.RhymersFactory;


/*
 * Klasy factory zostaly publiczne aby mozna bylo uzywac fabryk do pobierania implementacji wyliczanek
 */
public class DefaultRhymersFactory implements RhymersFactory {

	@Override
	public DefaultCountingOutRhymer getStandardRhymer() {
		return new DefaultCountingOutRhymer();
	}

	@Override
	public DefaultCountingOutRhymer getFalseRhymer() {
		return new DefaultCountingOutRhymer();
	}

	@Override
	public DefaultCountingOutRhymer getFIFORhymer() {
		return new FIFORhymer();
	}

	@Override
	public DefaultCountingOutRhymer getHanoiRhymer() {
		return new HanoiRhymer();
	}

}
