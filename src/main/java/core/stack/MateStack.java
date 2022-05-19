package core.stack;

import java.util.Objects;

public class MateStack<T> {
    private Node<T> firstElement;
    private int iterator = 0;

    public MateStack() {
        this.firstElement = null;
    }

    public void push(T value) {
        Node<T> firstPushElement = new Node<>();
        if (firstPushElement == null) {
            return;
        }
        firstPushElement.element = value;
        firstPushElement.nextNode = firstElement;
        firstElement = firstPushElement;
        iterator++;
    }

    public T peek() {
        if (Objects.nonNull(firstElement)){
            return firstElement.element;
        } else {
            throw new IndexOutOfBoundsException("Stack is empty");
        }
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
    }
}
