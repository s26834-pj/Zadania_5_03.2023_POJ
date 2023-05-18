import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczby oddzielone spacją:");
        String input = scanner.nextLine();

        String[] inputNumbers = input.split(" ");

        Set<Integer> sortedSet = new TreeSet<>();

        for (String inputNumber : inputNumbers) {
            sortedSet.add(Integer.parseInt(inputNumber));
        }

        System.out.print("[");
        boolean isFirst = true;
        for (Integer number : sortedSet) {
            if (isFirst) {
                System.out.print(number);
                isFirst = false;
            } else {
                System.out.print(", " + number);
            }
        }
        System.out.print("]");
    }
}