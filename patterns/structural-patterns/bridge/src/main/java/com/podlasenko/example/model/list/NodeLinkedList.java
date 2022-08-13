package com.podlasenko.example.model.list;

public class NodeLinkedList<T> implements LinkedList<T> {

    private static class Node {
        private final Object data;
        private Node next;

        private Node(Object data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    private int size;
    private Node head;
    private Node tail;

    @Override
    public void addFirst(T element) {
        if (head == null) {
            tail = head = new Node(element, null);
        } else {
            head = new Node(element, head);
        }
        size++;
    }

    @Override
    public T removeFirst() {
        if (head == null) {
            return null;
        }
        @SuppressWarnings("unchecked")
        T temp = (T) head.data;
        if (head.next != null) {
            head = head.next;
        } else {
            head = null;
            tail = null;
        }
        size--;
        return temp;
    }

    @Override
    public void addLast(T element) {
        if (tail == null) {
            tail = head = new Node(element, null);
        } else {
            tail.next = new Node(element, null);
            tail = tail.next;
        }
        size++;
    }

    @Override
    public T removeLast() {
        if (tail == null) {
            return null;
        }
        if (head == tail) {
            @SuppressWarnings("unchecked")
            T temp = (T) head.data;
            head = tail = null;
            size--;
            return temp;
        }
        //since we don't have a back pointer
        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        @SuppressWarnings("unchecked")
        T result = (T) tail.data;
        tail = temp;
        tail.next = null;
        size--;
        return result;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        Node temp = head;
        while (temp != null) {
            result.append(temp.data).append(temp.next == null ? "" : ", ");
            temp = temp.next;
        }
        result.append("]");
        return result.toString();
    }

}
