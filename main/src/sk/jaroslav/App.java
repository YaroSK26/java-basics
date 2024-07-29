package sk.jaroslav;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Ruka ruka = new Ruka(5);

        System.out.println(ruka.pocetPrstov);
        ruka.odstranPrst();
        System.out.println(ruka.pocetPrstov);
    }
}