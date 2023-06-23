package com.addodevelop;

public class CustomLinkedListNode<T> {
    private final T value;
    private CustomLinkedListNode<T> next;

    public CustomLinkedListNode(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public CustomLinkedListNode<T> getNext() {
        return next;
    }

    public void setNext(CustomLinkedListNode<T> next) {
        this.next = next;
    }
}
