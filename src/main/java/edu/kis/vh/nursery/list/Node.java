package edu.kis.vh.nursery.list;

public class Node {

	private int value;
	private Node prev;
	private Node next;

//	Enkapsulacja pol value, prev oraz next spowodowaly automatyczne wygenerowanie setterow i getterow dla tych pol, oraz zmiane
//	dostepu na private. W klasie IntLinkedList zostaly rowniez dokonane zmiany - poprzednio odwolania do pol byly bezposrednie 
//	(poniewaz pola byly publiczne), a po enkapsulacji zostaly zamienione na uzycia getterow i setterow do odwolywania sie do pol klasy "Node"
	public Node(int i) {
		value = i;
	}

	public int getValue() {
		return value;
	}

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
}
