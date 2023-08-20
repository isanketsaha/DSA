package ds.linkedList;

import ds.common.Node;

public class SLinkedList<T> {
    private Node head;

    public void addNodeAtEnd(T data) {
        Node<T> node = new Node<>(data, null);
        if (head == null)
            addNodeAtStart(data);
        else {
            Node<T> tmp = head;
            while (tmp.getNext() != null)
                tmp = tmp.getNext();
            tmp.setNext(node);
        }
    }

    public void addNodeAtStart(T data) {
        Node<T> node = new Node<>(data, null);
        if (head != null) {
            node.setNext(head);
        }
        head = node;
    }

    public void insertNodeAtPosition(int position, T data) {
        Node tmp = head;
        int index = 1;
        if (head == null) {
            head = new Node<>(data, null);
        } else if (tmp.getNext() == null) {
            head.setNext(new Node<>(data, null));
        } else if (position == 1) {
            addNodeAtStart(data);
        } else {
            while (index < position -1 && tmp.getNext() != null) {
                tmp = tmp.getNext();
                index++;
            }
            tmp.setNext(new Node<>(data, tmp.getNext()));
        }
    }

    public void deleteNodeAtStart() {
        if (head != null)
            head = head.getNext();
    }

    public void deleteNodeAtEnd() {
        Node tmp = head;
        while (tmp.getNext()
                .getNext() != null)
            tmp = tmp.getNext();
        tmp.setNext(null);
    }

    @Override
    public String toString() {
        StringBuilder value = new StringBuilder();
        Node tmp = head;
        if (tmp == null)
            value.append("[ ]");
        else {
            while (tmp != null) {
                value.append(tmp.toString());
                tmp = tmp.getNext();
            }
        }
        return value.toString();
    }
}

class main {
    public static void main(String[] args) {
        SLinkedList<String> ll = new SLinkedList<>();

        ll.addNodeAtEnd("Pooja");
        ll.addNodeAtEnd("Papen");
        ll.addNodeAtEnd("Sanket");
        ll.insertNodeAtPosition(7,"TEST");
        System.out.println(ll);
    }
}