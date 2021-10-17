package IteratorsAndComparatorsT8.Exercise.StackIterator03;

import java.util.Iterator;

public class Stack<Integer> implements Iterable<Integer> {
    private Node<Integer> top;

    public Stack() {
        this.top = null;
    }

    public void push(int newElement) {
        Node<Integer> newNode = new Node<>(newElement);
        newNode.prev = this.top;
        this.top = newNode;
    }

    public int pop() throws Exception {
        if (top == null) {
            throw new Exception("No elements");
        } else {
            Node<Integer> currentTop = top;
            top = top.prev;
            return currentTop.element;
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private Node<Integer> current = top;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public Integer next() {
                int currentValue = current.element;
                current = current.prev;
                return (Integer) java.lang.Integer.valueOf(currentValue);
            }
        };
    }
}