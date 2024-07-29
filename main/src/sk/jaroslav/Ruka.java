package sk.jaroslav;

public class Ruka {
    int pocetPrstov;
    char znak = 'a';
    char[] znaky = {'a', 'b', 'c'};
    char[] znaky2 = new char[3];

    static long cislo = 15454;

    public Ruka(int pocetPrstov) {
        this.pocetPrstov = pocetPrstov;
    }

    private long getCislo(long cislo) {
        return cislo + 100;
    }

    public static void main (String[] args) {
        Ruka ruka = new Ruka(5);
        ruka.znaky2[0] = 'a';

        long vysledok = ruka.getCislo(5);
        System.out.println(vysledok);  // Vypíše výsledok metódy getCislo

        long cisloNove = Ruka.cislo;    
        System.out.println(cisloNove);

        ruka.vypisZnaky();
    }

    public void odstranPrst() {
        if (this.pocetPrstov == 0) {
            return;
        } else {
            this.pocetPrstov = this.pocetPrstov - 1;
        }
    }

    public void vypisZnaky() {
        for (int i = 0; i < znaky.length; i++) {
            System.out.println(znaky[i]);
        }
    }
}