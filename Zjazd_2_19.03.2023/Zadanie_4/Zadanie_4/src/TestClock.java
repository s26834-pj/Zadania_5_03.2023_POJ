/*
Zaimplementuj klasę `Clock`. Klasa zawierać będzie pola: `hours, minutes, seconds`.
Zmienna `hours` przyjmuje wartości z zakresu 0-23, `minutes` z zakresu 0-59, `seconds` 0-59.
Dodaj trzy konstruktor:
- domyślny - inicjalizuje godzinę 12:00:00;
- konstruktor zawierający trzy parametry: hours, minutes, seconds,
- konstruktor z jednym parametrem - czas w sekundach licząc od północy jest konwertowany do pól:
`hours, minutes, seconds`.
Dodaj metody:
- `getHours(), getMinutes(), getSeconds()`, bez parametrów, które zwracają odpowiednie wartości;
- `setHours(), setMinutes(), setSeconds()`, z jednym parametrem, który ustawia odpowiednie wartości;
- `tick()`, bez parametrów, która inkrementuje wartość second o jeden.
   Przykład: wartość 00:00:01 zamieni się na 00:00:02; wartość 00:59:59 zmieni się na 01:00:00;
- `tickDown()`, zmniejsza wartość sekund o jedno; analogiczna do tick();
- `toString()`, bez parametrów, zwraca reprezentację obiektu w postaci **"[hh-mm-ss]"**,
   uzupełnioną o nieznaczące zera, na przykład: **"[03:12:56]"**.
Przetestuj zaimplementowany program.
Autor: Hanna Paczoska
 */
public class TestClock {
    public static void main(String[] args) {
        Clock clock1 = new Clock();
        System.out.println(clock1);

        Clock clock2 = new Clock(12, 40, 59);
        System.out.println(clock2);
        System.out.println("["+clock2.getHours() + ":" + clock2.getMinutes() + ":" + clock2.getSeconds()+ "]");

        Clock clock3 = new Clock(5200);
        System.out.println(clock3);

        clock1.tick();
        System.out.println(clock1);

        clock2.tick();
        System.out.println(clock2);

        clock3.tickDown();
        System.out.println(clock3);
    }
}
