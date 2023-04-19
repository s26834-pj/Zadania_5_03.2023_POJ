enum TypJednosladu {
    HULAJNOGA, MOTOCYKL
}

public class Jednoslad extends Pojazd {
    private final TypJednosladu typ;

    public Jednoslad(String marka, String nazwa, double pojemnoscSilnika, RodzajSilnika rodzajSilnika,
                     double moc, double momentObrotowy, TypJednosladu typ) {
        super(marka, nazwa, pojemnoscSilnika, rodzajSilnika, moc, momentObrotowy);
        this.typ = typ;
    }

    public Jednoslad(String marka, String nazwa, TypJednosladu typ) {
        super(marka, nazwa, 0, RodzajSilnika.BRAK, 0, 0);
        this.typ = typ;
    }

    public void wyswietl() {
        super.wyswietl();
        System.out.println("Typ: " + typ);
    }
}
