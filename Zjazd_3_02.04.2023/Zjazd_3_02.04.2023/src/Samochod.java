enum Segment {
    A, B
}

public class Samochod extends Pojazd {
    private final Segment segment;
    private final String VIN;

    public Samochod(String marka, String nazwa, double pojemnoscSilnika, RodzajSilnika rodzajSilnika,
                    double moc, double momentObrotowy, Segment segment, String VIN) {
        super(marka, nazwa, pojemnoscSilnika, rodzajSilnika, moc, momentObrotowy);
        this.segment = segment;
        this.VIN = VIN;
    }

    public void wyswietl() {
        super.wyswietl();
        System.out.println("Segment: " + segment + ", VIN: " + VIN);
    }
}