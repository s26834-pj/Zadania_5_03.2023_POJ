public class Karta {
    Wartosc wartosc;
    KolorKarty kolor;

    Karta(Wartosc wartosc, KolorKarty kolor) {
        this.wartosc = wartosc;
        this.kolor = kolor;
    }

    void printInfo() {
        System.out.println(wartosc + " " + kolor);
    }
}
