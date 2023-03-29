public class Student {
    // Pola klasy Student
    private String imie;
    private String nazwisko;
    private int numerIndeksu;
    private int ocenaPOJ;
    private double obecnosc;

    // Konstruktor klasy Student
    public Student(int numerIndeksu, int ocenaPOJ, double obecnosc) {
        this.imie = "Unknown";
        this.nazwisko = "Unknown";
        this.numerIndeksu = numerIndeksu;
        this.ocenaPOJ = ocenaPOJ;
        this.obecnosc = obecnosc;
        if (obecnosc < 50.0) {
            this.ocenaPOJ = 2;
        }
    }

    public Student(String imie, String nazwisko, int numerIndeksu, int ocenaPOJ, double obecnosc) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numerIndeksu = numerIndeksu;
        this.ocenaPOJ = ocenaPOJ;
        this.obecnosc = obecnosc;
        if (obecnosc < 50.0) {
            this.ocenaPOJ = 2;
        }
    }

    // Metody dostępowe do pól klasy Student
    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getNumerIndeksu() {
        return numerIndeksu;
    }

    public void setNumerIndeksu(int numerIndeksu) {
        this.numerIndeksu = numerIndeksu;
    }

    public int getOcenaPOJ() {
        return ocenaPOJ;
    }

    public void setOcenaPOJ(int ocenaPOJ) {
        this.ocenaPOJ = ocenaPOJ;
    }

    public double getObecnosc() {
        return obecnosc;
    }

    public void setObecnosc(double obecnosc) {
        this.obecnosc = obecnosc;
        if (obecnosc < 50.0) {
            this.ocenaPOJ = 2;
        }
    }
}
