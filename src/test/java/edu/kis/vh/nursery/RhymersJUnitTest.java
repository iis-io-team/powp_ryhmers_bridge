package edu.kis.vh.nursery;

import edu.kis.vh.nursery.collection.IntArrayStack;
import org.junit.Assert;
import org.junit.Test;

public class RhymersJUnitTest {

	@Test
	public void testCountIn() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		int testValue = 4;
		rhymer.countIn(testValue);

		int result = rhymer.peekaboo();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testCallCheck() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		boolean result = rhymer.callCheck();
		Assert.assertEquals(true, result);

		rhymer.countIn(888);

		result = rhymer.callCheck();
		Assert.assertEquals(false, result);
	}

	@Test
	public void testIsFull() {
		DefaultCountingOutRhymer listRhymer = new DefaultCountingOutRhymer();
		DefaultCountingOutRhymer arrayRhymer = new DefaultCountingOutRhymer(new IntArrayStack());
		final int STACK_CAPACITY = 12;
		for (int i = 0; i < 100; i++) {
            boolean result = listRhymer.isFull();
            Assert.assertEquals(false, result);
            listRhymer.countIn(888);
        }
		for (int i = 0; i < STACK_CAPACITY; i++) {
			boolean result = arrayRhymer.isFull();
			Assert.assertEquals(false, result);
            arrayRhymer.countIn(888);
		}
        boolean result = arrayRhymer.isFull();
        Assert.assertEquals(true, result);

        //DefaultCountingOutRhymer domyślnie korzysta z IntLinkedList który podczas sprawdzania czy jest pełny
        //zwraca zawsze false. Jest to spowodowane tym że IntLinkedList nie ma ograniczenia jeżeli chodzi o rozmiar

	}

	@Test
	public void testPeekaboo() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		final int EMPTY_STACK_VALUE = 0; // Wartości zwracane gdy lista jest pusta zmieniły się z -1 na 0

		int result = rhymer.peekaboo();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		int testValue = 4;
		rhymer.countIn(testValue);

		result = rhymer.peekaboo();
		Assert.assertEquals(testValue, result);
		result = rhymer.peekaboo();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testCountOut() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		final int EMPTY_STACK_VALUE = 0;

		int result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		int testValue = 4;
		rhymer.countIn(testValue);

		result = rhymer.countOut();
		Assert.assertEquals(testValue, result);
		result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}

}
