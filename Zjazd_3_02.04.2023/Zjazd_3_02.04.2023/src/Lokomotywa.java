public class Lokomotywa extends Maszyna {
    private final int liczbaWagonow;
    private final int liczbaKol;

    public Lokomotywa(String marka, String nazwa, double pojemnoscSilnika, RodzajSilnika rodzajSilnika,
                      int liczbaWagonow, int liczbaKol) {
        super(marka, nazwa, pojemnoscSilnika, rodzajSilnika);
        this.liczbaWagonow = liczbaWagonow;
        this.liczbaKol = liczbaKol;
    }

    public void wyswietl() {
        System.out.println("Lokomotywa  " + marka + " " + nazwa + ", pojemność silnika: " + pojemnoscSilnika
                + ", rodzaj silnika: " + rodzajSilnika + ", Liczba wagonów: " + liczbaWagonow
                + ", Liczba kół: " + liczbaKol);
    }
}
