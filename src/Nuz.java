public class Nuz {
    Vidlicka vidlicka;


    public synchronized void vezmiSiMe(){
        System.out.println("vzal jsem si nuz");
        vidlicka.najezse();
    }

    public synchronized void najezse(){
        System.out.println("jime");
    }

}
