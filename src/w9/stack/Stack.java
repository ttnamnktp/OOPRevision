package w9.stack;

public class Stack<T> {
    private Object[] elements;
    private int size;
    private int maxSize;

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        this.size = 0;
        elements = new Object[maxSize];
    }

    public Stack() {
        this.size = 0;
    }

    public boolean isEmpty() {
        if (size == 0) return true;
        return false;
    }

    public boolean isFull() {
        if (size == maxSize) return true;
        return false;
    }

    public T peak() {
        if (size == 0) return null;
        return (T) elements[size - 1];
    }

    public <T> boolean push(T element) {
        if (isFull()) return false;
        elements[size] = element;
        size++;
        return true;
    }

    public T pop() {
        if (size == 0) return null;
        T element = (T) elements[size - 1];
        elements[size - 1] = null;
        size--;
        return element;
    }

    public int getSize(){
        return size;
    }
}
