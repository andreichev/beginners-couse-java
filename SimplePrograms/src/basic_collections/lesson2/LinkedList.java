package basic_collections.lesson2;

import basic_collections.lesson1.List;

public class LinkedList implements List {
    private class Node {
        Node(int value) {
            this.value = value;
            this.next = null;
        }
        int value;
        Node next;
    }

    private Node first;
    private Node last;
    private int size;

    LinkedList() {
        size = 0;
        first = null;
        last = null;
    }

    @Override
    public void add(int x) {
        if(first == null) {
            first = new Node(x);
            last = first;
            size++;
            return;
        }
        last.next = new Node(x);
        last = last.next;
        size++;
    }

    @Override
    public int get(int i) {
        Node current = first;
        for(int k = 0; k < i; k++) {
            current = current.next;
        }
        return current.value;
    }

    @Override
    public void removeAt(int i) {
        // TODO: Implement
    }

    @Override
    public int size() { return size; }
}
