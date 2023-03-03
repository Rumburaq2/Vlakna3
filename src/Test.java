public class Test extends Thread{
    public static volatile int hodnota;  //volatile = necachovat na procesoru

    public void run() {
        for (int i = 0; i < 1000000; i++) {
           prictiJedna();

        }
    }

    static synchronized void prictiJedna(){
        hodnota++;
    }
}
