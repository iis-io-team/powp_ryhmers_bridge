package edu.kis.vh.nursery;

import edu.kis.vh.nursery.storage.IntLinkedList;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    public FIFORhymer() {
        super();
    }

    public FIFORhymer(IntLinkedList intLinkedList) {
        super(intLinkedList);
    }

    @Override
    public int countOut() {
        while (!callCheck())

            temp.countIn(super.countOut());

        int ret = temp.countOut();

        while (!temp.callCheck())

            countIn(temp.countOut());

        return ret;
    }

    public DefaultCountingOutRhymer getTemp() {
        return temp;
    }
}
