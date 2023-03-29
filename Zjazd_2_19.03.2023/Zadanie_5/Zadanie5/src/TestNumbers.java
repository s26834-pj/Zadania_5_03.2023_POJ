/*
Zaimplementuj klasę Numbers. Dodaj konstruktor który przyjmuje trzy liczby typu integer.
Dodaj metody:
- `sum()`, zwraca sumę liczb;
- `average()`, zwraca średnią arytmetyczną liczb;
- `min()`, zwraca najmniejszą z liczb;
- `max()`, zwraca największą z liczb;
- `geometric()`, zwraca średnią geometryczną liczb;
Przetestuj zaimplementowany program.
Autor: Hanna Paczoska
 */
public class TestNumbers {
    public static void main(String[] args) {
        Numbers nums = new Numbers(20, 888, 29673);
        System.out.println("Suma: " + nums.sum());
        System.out.printf("Średnia arytmetyczna: " + "%4.2f\n", nums.average());
        System.out.println("Najmniejsza: " + nums.min());
        System.out.println("Największa: " + nums.max());
        System.out.printf("Średnia geometryczna: " + "%5.2f\n", nums.geometric());
    }
}
