package edu.kis.vh.nursery.list;

/**
 * Reprezentuje pojedynczy węzeł w dwukierunkowej liście powiązanej.
 * Każdy węzeł przechowuje wartość typu int oraz referencje do poprzedniego i następnego węzła.
 */
public class Node {

    /**
     * Wartość przechowywana w węźle.
     */
    private final int value;

    /**
     * Referencja do poprzedniego węzła w liście.
     */
    private Node prev;

    /**
     * Referencja do następnego węzła w liście.
     */
    private Node next;

    /**
     * Tworzy nowy węzeł z podaną wartością.
     * @param i wartość przechowywana w węźle
     */
    public Node(int i) {
        value = i;
    }

    /**
     * Zwraca referencję do poprzedniego węzła.
     * @return poprzedni węzeł
     */
    public Node getPrev() {
        return prev;
    }

    /**
     * Ustawia referencję do poprzedniego węzła.
     * @param prev nowy poprzedni węzeł
     */
    public void setPrev(Node prev) {
        this.prev = prev;
    }

    /**
     * Zwraca referencję do następnego węzła.
     * @return następny węzeł
     */
    public Node getNext() {
        return next;
    }

    /**
     * Ustawia referencję do następnego węzła.
     * @param next nowy następny węzeł
     */
    public void setNext(Node next) {
        this.next = next;
    }

    /**
     * Zwraca wartość przechowywaną w węźle.
     * @return wartość typu int
     */
    public int getValue() {
        return value;
    }
}
