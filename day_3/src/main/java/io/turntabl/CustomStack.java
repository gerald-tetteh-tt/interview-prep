package io.turntabl;

import java.lang.reflect.Array;

public class CustomStack<T> {
    private final int size;
    private final T[] stack;
    private int currentSize;

    public CustomStack(Class<T> clazz, int size) {
        this.size = size;
        this.stack = (T[]) Array.newInstance(clazz,size);
    }

    public void push(T element) throws Exception {
        if(currentSize == size) {
            throw new Exception("Stack overflow!!!");
        }
        stack[currentSize] = element;
        currentSize++;
    }
    public T peek() throws Exception {
        if(currentSize == 0) {
            throw new Exception("Stack is empty");
        }
        return stack[currentSize - 1];
    }
    public T pop() throws Exception {
        if(currentSize == 0) {
            throw new Exception("Stack is empty");
        }
        currentSize--;
        return stack[currentSize];
    }
}
