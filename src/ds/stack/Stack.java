package ds.stack;

import ds.common.Node;

public class Stack<T> {

    Node<T> head = null;

    public void push(T value) {
        Node<T> node = new Node<>(value, head);
        head = node;
    }

    public Node<T> pop() {
        Node<T> tmp = head;
        head = head.getNext();
        return tmp;
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
        Stack<String> stack = new Stack<>();
        stack.push("Pooja");
        stack.push("Papen");
        stack.pop();
        stack.pop();
        System.out.println(stack.isEmpty());
    }
}
