import java.util.ArrayList;

public class CustomQueue<T> implements MethodQueue<T> {

    private ArrayList<T> arrayList;

    private int size = 10;

    public CustomQueue() {}

    public CustomQueue(int size) { this.size = size; }

    public void init() { arrayList = new ArrayList<>(size); }

    public void enqueue(T element) { arrayList.add(element); }

    public T dequeue() { return arrayList.remove(0); }

    public T peek() { return arrayList.get(0); }

    public int getSize() { return arrayList.size(); }

}
