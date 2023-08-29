package ds.queue;

import ds.common.Node;

public class Queue<T> {

    private Node<T> tail, head = null;

    public void enqueue(T data) {
        Node node = new Node(data, null);
        if (isEmpty())
            head = node;
        else{
            tail.setNext(node);
        }
        tail = node;
    }

    public void dequeue() {
        if (!isEmpty())
            head = head.getNext();
    }

    public boolean isEmpty() {
        return head == null;
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

    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(3);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.dequeue();
        System.out.println(queue);
    }
}
