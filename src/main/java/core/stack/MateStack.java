package core.stack;

import java.util.Objects;

public class MateStack<T> {
    private Node<T> firstElement;
    private int iterator = 0;

    public void push(T value) {
        firstElement = new Node<>(value, firstElement);
        iterator++;
    }

    public T peek() {
        if (Objects.nonNull(firstElement)){
            return firstElement.element;
        }
            throw new IndexOutOfBoundsException("Stack is empty");
    }

    public T pop() {
        if (firstElement == null) {
            throw new IndexOutOfBoundsException("Stack is empty");
        }
        Node<T> pop = firstElement;
        firstElement = firstElement.nextNode;
        iterator--;
        return pop.element;
    }

    public int size() {
        return iterator;
    }

    private static class Node<T> {
        private T element;
        private Node<T> nextNode;

        public Node(T element, Node<T> nextNode) {
            this.element = element;
            this.nextNode = nextNode;
        }
    }
}
