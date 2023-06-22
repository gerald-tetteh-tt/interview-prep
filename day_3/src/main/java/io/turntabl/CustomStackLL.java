package io.turntabl;

import java.util.LinkedList;

public class CustomStackLL<T> {
    private final LinkedList<T> stack;

    public CustomStackLL() {
        stack = new LinkedList<>();
    }

    public void push(T element) {
        stack.offer(element);
    }
    public T peek() {
        return stack.getLast();
    }
    public T pop() {
        return stack.removeLast();
    }
}
