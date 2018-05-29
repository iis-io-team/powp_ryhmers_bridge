package edu.kis.vh.nursery;


/**
 * @author Jacek Olszewski
 * Klasa bazowa wyliczanek, na której opierają się bardziej złożone wyliczanki.
 * Sama w sobie jest samodzielną wyliczanką.
 */
public class DefaultCountingOutRhymer {

	private static final int STARTINGTOTAL = -1;

	private static final int ARRAYSIZE = 12;

	private int[] numbers = new int[ARRAYSIZE];

	private int total = STARTINGTOTAL;

	/**
	 * @return Całkowita ilość liczb w wyliczance.
	 */
	public int getTotal() {
		return total;
	}

	/**
	 * @param in Liczba do wliczenia w wyliczankę.
	 */
	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	/**
	 * @return Czy wyliczanka jest pusta.
	 */
	public boolean callCheck() {
		return total == STARTINGTOTAL;
	}

	/**
	 * @return Czy wyliczanka jest zapełniona.
	 */
	public boolean isFull() {
		return total == 11;
	}

	/**
	 * @return Ostatnia wartość w wyliczance (lub -1 jeżeli pusta).
	 */
	protected int lastValue() {
		if (callCheck())
			return STARTINGTOTAL;
		return numbers[total];
	}

	/**
	 * @return "Pozbycie" się ostatniej liczby z wyliczanki oraz zwrócenie "usuniętej" liczby (lub -1 jeżeli nie ma co usunąć).
	 */
	public int countOut() {
		if (callCheck())
			return STARTINGTOTAL;
		return numbers[total--];
	}

}
