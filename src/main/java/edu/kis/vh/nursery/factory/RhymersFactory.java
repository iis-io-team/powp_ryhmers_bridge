package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;

public interface RhymersFactory {

	DefaultCountingOutRhymer getFIFORhymer();

	DefaultCountingOutRhymer getStandardRhymer();

	DefaultCountingOutRhymer getFalseRhymer();

	DefaultCountingOutRhymer getHanoiRhymer();

	}