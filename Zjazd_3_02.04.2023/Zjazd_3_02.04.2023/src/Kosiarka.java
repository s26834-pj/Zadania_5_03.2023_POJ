public class Kosiarka extends Maszyna {
    private boolean czyMelekser;
    private boolean czyNaped;
    private int liczbaOstrzy;

    public Kosiarka(String marka, String nazwa, double pojemnoscSilnika, RodzajSilnika rodzajSilnika,
                    boolean czyMelekser, boolean czyNaped, int liczbaOstrzy) {
        super(marka, nazwa, pojemnoscSilnika, rodzajSilnika);
        this.czyMelekser = czyMelekser;
        this.czyNaped = czyNaped;
        this.liczbaOstrzy = liczbaOstrzy;
    }

    public void wyswietl() {
        System.out.println("Kosiarka " + marka + " " + nazwa + ", pojemność silnika: " + pojemnoscSilnika
                + ", rodzaj silnika: " + rodzajSilnika + ", czy melekser: " + czyMelekser
                + ", czy napęd: " + czyNaped + ", liczba ostrzy: " + liczbaOstrzy);
    }

    public void setCzyMelekser(boolean czyMelekser) {
        this.czyMelekser = czyMelekser;
    }

    public void setCzyNaped(boolean czyNaped) {
        this.czyNaped = czyNaped;
    }

    public void setLiczbaOstrzy(int liczbaOstrzy) {
        this.liczbaOstrzy = liczbaOstrzy;
    }
}