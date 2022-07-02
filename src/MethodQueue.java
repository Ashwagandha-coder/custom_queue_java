public interface MethodQueue<T> {

    void enqueue(T element);

    T dequeue();

    T peek();

    int getSize();

}
