package Laba7;

import Laba6_2.Vagon;
import org.jetbrains.annotations.NotNull;

import java.util.*;

public class MyList implements List<Vagon> {
    private Node head;
    private Node tail;
    private int size = 0;

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Vagon> iterator() {
        return new Iterator<Vagon>() {
            private Node currentNode = head;
            @Override
            public boolean hasNext() {
                return currentNode != null;
            }

            @Override
            public Vagon next() {
                Node result = currentNode;
                if (currentNode != null) {
                    currentNode = currentNode.getNext();
                } else {
                    throw new NoSuchElementException();
                }
                return result.getData();
            }
        };
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Vagon vagon) {
        Node node = new Node();
        node.setData(vagon);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.setNext(node);
            tail = node;
        }
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Vagon> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Vagon> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Vagon get(int index) {
        return null;
    }

    @Override
    public Vagon set(int index, Vagon element) {
        return null;
    }

    @Override
    public void add(int index, Vagon element) {

    }

    @Override
    public Vagon remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Vagon> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Vagon> listIterator(int index) {
        return null;
    }

    @Override
    public List<Vagon> subList(int fromIndex, int toIndex) {
        return null;
    }
}