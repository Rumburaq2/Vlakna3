public class DedaBabicka {
    public static void main(String[] args) throws InterruptedException {
        Nuz n = new Nuz();
        Vidlicka v = new Vidlicka();

        v.nuz = n;
        n.vidlicka = v;

        Thread dedecek = new Thread(() -> {
            n.vezmiSiMe();
        });

        Thread babicka = new Thread(() -> {
            n.vezmiSiMe();
        });

        dedecek.start();
        babicka.start();

        dedecek.join();
        babicka.join();

        System.out.println("mnam");



    }
}
