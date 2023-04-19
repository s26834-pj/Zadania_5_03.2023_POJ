public class Pojazd extends Maszyna {
    private static int maxLiczbaPojazdow = 0;
    protected double moc;
    protected double momentObrotowy;
    protected int nrPojazdu;

    public Pojazd(String marka, String nazwa, double pojemnoscSilnika, RodzajSilnika rodzajSilnika, double moc,
                  double momentObrotowy) {
        super(marka, nazwa, pojemnoscSilnika, rodzajSilnika);
        this.moc = moc;
        this.momentObrotowy = momentObrotowy;
        maxLiczbaPojazdow++;
        this.nrPojazdu = maxLiczbaPojazdow;
    }

    public void wyswietl() {
        System.out.println("Pojazd " + nrPojazdu + " z " + maxLiczbaPojazdow + ": " + marka + " " + nazwa +
                ", moc: " + moc + " kW, moment obrotowy: " + momentObrotowy + " Nm");
    }
}
