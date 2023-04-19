import java.util.ArrayList;

public class ParkMaszynowy {
    public static void main(String[] args) {
        ArrayList<Maszyna> listaMaszyn = new ArrayList<>();

        Lokomotywa lokomotywa1 = new Lokomotywa("PKP", "Pm36", 2200,
                RodzajSilnika.PAROWY, 100, 12);
        Lokomotywa lokomotywa2 = new Lokomotywa("Deutsche Bahn", "BR 01", 2400,
                RodzajSilnika.ELEKTRYCZNY, 110, 8);
        Kosiarka kosiarka1 = new Kosiarka("John Deere", "X584", 24,
                RodzajSilnika.SPALINOWY, true, true, 4);
        Kosiarka kosiarka2 = new Kosiarka("Husqvarna", "LC 247S", 18,
                RodzajSilnika.SPALINOWY, true, true, 2);
        Samochod samochod1 = new Samochod("Lexus", "UX", 2.0,
                RodzajSilnika.HYBRYDOWY, 184.0, 200.0, Segment.B, "1234abcd");
        Samochod samochod2 = new Samochod("Audi", "A4", 2.5,
                RodzajSilnika.DIESEL, 180.0, 250.0, Segment.A, "5678efgh");
        Jednoslad jednoslad1 = new Jednoslad("BMW", "Adventure", 1.2,
                RodzajSilnika.BENZYNA, 125.0, 100.0, TypJednosladu.MOTOCYKL);
        Jednoslad jednoslad2 = new Jednoslad("Nami", "E 2 MAX", TypJednosladu.HULAJNOGA);

        listaMaszyn.add(lokomotywa1);
        listaMaszyn.add(lokomotywa2);
        listaMaszyn.add(kosiarka1);
        listaMaszyn.add(kosiarka2);
        listaMaszyn.add(samochod1);
        listaMaszyn.add(samochod2);
        listaMaszyn.add(jednoslad1);
        listaMaszyn.add(jednoslad2);

        for (Maszyna maszyna : listaMaszyn) {
            maszyna.wyswietl();
            System.out.println();
        }
        kosiarka1.setCzyMelekser(false);
        kosiarka1.setCzyNaped(false);
        kosiarka1.setLiczbaOstrzy(6);
        System.out.println("Po zmianie wartości atrybutów: 'czyMelekser', 'CzyNaped', 'LiczbaOstrzy' :");
        kosiarka1.wyswietl();
    }
}
