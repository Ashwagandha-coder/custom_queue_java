public class Client {


    public static void main(String[] args) {

        CustomQueue<Integer> customQueue = new CustomQueue<>();

        customQueue.init();

        customQueue.enqueue(22);
        customQueue.enqueue(33);
        customQueue.enqueue(55);
        customQueue.enqueue(66);
        customQueue.enqueue(77);

        System.out.println(customQueue.dequeue());
        System.out.println(customQueue.dequeue());
        System.out.println(customQueue.dequeue());
        System.out.println(customQueue.dequeue());

    }
}
