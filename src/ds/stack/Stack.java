package ds.stack;

import ds.common.Node;

public class Stack<T> {

    Node<T> head = null;

    private void push(T value){
        Node<T> node = new Node<>(value, head);
        head = node;
    }

    private void pop(){
        head = head.getNext();
    }

    private boolean isEmpty(){
        return head == null;
    }


}
