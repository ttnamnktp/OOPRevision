package draft.test3;

public class Stack<T> {
    private Object[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public Stack() {
        this(DEFAULT_CAPACITY);
    }

    public Stack(int capacity) {
        elements = new Object[capacity];
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == elements.length;
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return (T) elements[size - 1];
    }

    public void push(T value) {
        if (isFull()) {
            throw new IllegalStateException("Stack is full");
        }
        elements[size++] = value;
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        T value = (T) elements[--size];
        elements[size] = null; // Optional: help garbage collection
        return value;
    }

    public int getSize() {
        return size;
    }


}
