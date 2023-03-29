/*
Polecenie:
Zaimplementuj klasę `MyDate`, która przechowuje informację: `month` (typu int),
`day`(typu int) i `year` (type int).
Klasa powinna zawierać konstruktor, który inicjalizuje zmienne,
sprawdzając poprawność zakresów (day 0-31, month 0-12, year 1990-2050).
Zaimplementuj methody set i get dla wszystkich pól.
Dodaj metodę `displayDate`, która wyświetli pola z uwzględnieniem zer
nieznaczących oddzielone znakiem "/", np `21/03/2051`.
Przetestuj zaimplementowaną klasę.
Autor: Hanna Paczoska
 */
public class TestDate {

    public static void main(String[] args) {
        MyDate date1 = new MyDate(6, 17, 2020);
        date1.displayDate();
        date1.setMonth(4);
        date1.setDay(15);
        date1.setYear(2050);
        date1.displayDate();
        System.out.println("Month: " + date1.getMonth() + " Day: " + date1.getDay() + " Year: " + date1.getYear());

        MyDate date2 = new MyDate(2, 29, 2024);
        date2.displayDate();

        MyDate date3 = new MyDate(4, 31, 2010);
        date3.displayDate();
    }
}
