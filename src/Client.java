public class Client {


    public static void main(String[] args) {

        CustomQueue<Integer> customQueue = new CustomQueue<>();

        customQueue.init();

        customQueue.add(22);
        customQueue.add(33);
        customQueue.add(55);
        customQueue.add(66);
        customQueue.add(77);

        System.out.println(customQueue.enqueue());
        System.out.println(customQueue.enqueue());
        System.out.println(customQueue.enqueue());
        System.out.println(customQueue.enqueue());

    }
}
