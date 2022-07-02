public interface MethodQueue<T> {

    void add(T element);

    T enqueue();

    T peek();

    int getSize();

}
