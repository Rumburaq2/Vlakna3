public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello world!");
        Test t1 = new Test();
        Test t2 = new Test();

        t1.start();
        t1.join();    // pocka az vlakno t1 skonci

        t2.start();

        t2.join();    // pocka az vlakno t2 skonci

        System.out.println(t1.hodnota);
        System.out.println(t2.hodnota);
    }
}