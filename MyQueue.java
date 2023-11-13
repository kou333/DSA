public class MyQueue<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] array;
    private int size;
    private int front;
    private int rear;

    public MyQueue() {
        this.array = new Object[DEFAULT_CAPACITY];
        this.size = 0;
        this.front = 0;
        this.rear = -1;
    }

    public void enqueue(T element) {
        if (size == array.length) {
            resizeArray();
        }

        rear = (rear + 1) % array.length;
        array[rear] = element;
        size++;
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }

        T removedElement = (T) array[front];
        front = (front + 1) % array.length;
        size--;
        return removedElement;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    private void resizeArray() {
        int newCapacity = array.length * 2;
        Object[] newArray = new Object[newCapacity];

        for (int i = 0; i < size; i++) {
            newArray[i] = array[(front + i) % array.length];
        }

        array = newArray;
        front = 0;
        rear = size - 1;
    }

    public static void main(String[] args) {
        MyQueue<String> myQueue = new MyQueue<>();

        myQueue.enqueue("Element 1");
        myQueue.enqueue("Element 2");
        myQueue.enqueue("Element 3");

        System.out.println("Elements in the queue: " + myQueue.size());

        System.out.println("Dequeue: " + myQueue.dequeue());

        System.out.println("Elements in the queue after dequeue: " + myQueue.size());
    }
}
