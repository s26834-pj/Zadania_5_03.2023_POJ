import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczby pierwszego zbioru oddzielone spacją:");
        String input1 = scanner.nextLine();

        System.out.println("Podaj liczby drugiego zbioru oddzielone spacją:");
        String input2 = scanner.nextLine();

        String[] inputNumbers1 = input1.split(" ");
        String[] inputNumbers2 = input2.split(" ");

        Set<Integer> set1 = new TreeSet<>();
        Set<Integer> set2 = new TreeSet<>();

        for (String inputNumber : inputNumbers1) {
            set1.add(Integer.parseInt(inputNumber));
        }

        for (String inputNumber : inputNumbers2) {
            set2.add(Integer.parseInt(inputNumber));
        }

        Set<Integer> result = new TreeSet<>(set1);
        result.removeAll(set2);

        Set<Integer> temp = new TreeSet<>(set2);
        temp.removeAll(set1);

        result.addAll(temp);

        System.out.print("[");
        boolean isFirst = true;
        for (Integer number : result) {
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
