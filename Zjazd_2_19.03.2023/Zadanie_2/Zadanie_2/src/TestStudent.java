/*
Polecenie:
Zaimplementuj klasę `Student`, do przechowywania `imienia`, `nazwiska`, `numer indeksu`
`obecność` (wyrażonej w procentach) `oceny z POJ` (typu int).
Jeżeli podczas tworzenia obiektu nie zostało przekazane imię i nazwisko,
pola powinny być ustawione wartością "Unknown".
Dodaj odpowiednie metody set i get do wszystkich pól klasy.
Jeżeli obecnocność jest mniejsza niż 50%, student powinien otrzymać ocenę 2.
Przetestuj program, tworząc trzy różne obiekty klasy `Student`.
Autor: Hanna Paczoska
 */
public class TestStudent {
    public static class Main {
        public static void main(String[] args) {
            // Tworzenie obiektów klasy Student
            Student student1 = new Student(30573, 4, 45.0);
            Student student2 = new Student("Eryk", "Manioli", 29605, 4, 70);
            Student student3 = new Student("Kuba", "Lipka", 21223, 4, 20.0);
            Student student4 = new Student(28966, 5, 100.0);
            Student student5 = new Student("Ewa", "Brzoska", 29743, 4, 80.0);

            student2.setImie("Krzysztof");
            student2.setNazwisko("Kupiec");
            student2.setNumerIndeksu(2333);
            student2.setOcenaPOJ(5);
            student2.setObecnosc(100);

            // Wyświetlanie informacji o studentach
            System.out.println("Student 1: " + student1.getImie() + " " + student1.getNazwisko()
                    + ", indeks: " + student1.getNumerIndeksu() + ", POJ: " + student1.getOcenaPOJ()
                    + ", obecność: " + student1.getObecnosc() + "%");
            System.out.println("Student 2: " + student2.getImie() + " " + student2.getNazwisko()
                    + ", indeks: " + student2.getNumerIndeksu() + ", POJ: " + student2.getOcenaPOJ()
                    + ", obecność: " + student2.getObecnosc() + "%");
            System.out.println("Student 3: " + student3.getImie() + " " + student3.getNazwisko()
                    + ", indeks: " + student3.getNumerIndeksu() + ", POJ: " + student3.getOcenaPOJ()
                    + ", obecność: " + student3.getObecnosc() + "%");
            System.out.println("Student 4: " + student4.getImie() + " " + student4.getNazwisko()
                    + ", indeks: " + student4.getNumerIndeksu() + ", POJ: " + student4.getOcenaPOJ()
                    + ", obecność: " + student4.getObecnosc() + "%");
            System.out.println("Student 5: " + student5.getImie() + " " + student5.getNazwisko()
                    + ", indeks: " + student5.getNumerIndeksu() + ", POJ: " + student5.getOcenaPOJ()
                    + ", obecność: " + student5.getObecnosc() + "%");
        }
    }
}
