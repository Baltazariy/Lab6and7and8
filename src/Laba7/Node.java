package Laba7;

import Laba6_2.Vagon;

public class Node {
    private Node next;
    private Node previous;
    private Vagon data;


    public Node getNext() {

        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public Vagon getData() {
        return data;
    }

    public void setData(Vagon data) {
        this.data = data;
    }
}
