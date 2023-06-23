package com.addodevelop;

public class CustomLinkedList<T> {
    private CustomLinkedListNode<T> head;
    private CustomLinkedListNode<T> tail;
    private int length;

    public void add(T element) {
        CustomLinkedListNode<T> node = new CustomLinkedListNode<>(element);
        addNode(node);
    }

    public void addNode(CustomLinkedListNode<T> node) {
        length++;
        if(head == null) {
            head = node;
            tail = head;
            return;
        }
        CustomLinkedListNode<T> temp = tail;
        temp.setNext(node);
        tail = node;
    }

    public boolean hasLoop() {
        if(head == null) {
            return false;
        }
        CustomLinkedListNode<T> slowPointer = head;
        CustomLinkedListNode<T> fastPointer = head.getNext();
        while (slowPointer != fastPointer) {
            if(fastPointer == null || fastPointer.getNext() == null) {
                return false;
            }
            slowPointer = slowPointer.getNext();
            fastPointer = fastPointer.getNext().getNext();
        }
        return true;
    }

    public T poll() {
        return head.getValue();
    }

    public int getLength() {
        return length;
    }
}
