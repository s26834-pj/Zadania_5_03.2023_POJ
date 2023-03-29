/*
Treść zadania:
Zaimplementuj klasę `Card` reprezentującą pojedynczą kartę do gry z talii kart.
Klasa powinna przechowywać `wartość` i `kolor`: kier, karo, pik, trefl.
W zadaniu użyj typu wyliczeniowego.
Napisz program testujący, który stworzy trzy różne obiekty klasy `Card`.
Autor: Hanna Paczoska
 */
public class TestKarty {

    public static void main(String[] args) {
        Karta karta1 = new Karta(Wartosc.AS, KolorKarty.KARO);
        Karta karta2 = new Karta(Wartosc.DAMA, KolorKarty.KIER);
        Karta karta3 = new Karta(Wartosc.SIEDEM, KolorKarty.PIK);
        Karta karta4 = new Karta(Wartosc.KROL, KolorKarty.TREFL);
        Karta karta5 = new Karta(Wartosc.CZTERY, KolorKarty.KARO);
        Karta karta6 = new Karta(Wartosc.OSIEM, KolorKarty.KIER);
        Karta karta7 = new Karta(Wartosc.DWA, KolorKarty.PIK);
        Karta karta8 = new Karta(Wartosc.WALET, KolorKarty.TREFL);
        Karta karta9 = new Karta(Wartosc.TRZY, KolorKarty.KIER);
        Karta karta10 = new Karta(Wartosc.SZESC, KolorKarty.PIK);
        Karta karta11 = new Karta(Wartosc.DZIEWIEC, KolorKarty.TREFL);
        Karta karta12 = new Karta(Wartosc.DZIESIEC, KolorKarty.PIK);
        Karta karta13 = new Karta(Wartosc.PIEC, KolorKarty.TREFL);

        karta1.printInfo();
        karta2.printInfo();
        karta3.printInfo();
        karta4.printInfo();
        karta5.printInfo();
        karta6.printInfo();
        karta7.printInfo();
        karta8.printInfo();
        karta9.printInfo();
        karta10.printInfo();
        karta11.printInfo();
        karta12.printInfo();
        karta13.printInfo();
    }
}
