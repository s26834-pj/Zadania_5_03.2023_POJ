import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HamsterMaze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Hamster> hamsterMap = new HashMap<String, Hamster>();

        while (true) {
            try {
                System.out.println("Enter hamster number:");
                int hamsterNumber = Integer.parseInt(scanner.nextLine());
                if (hamsterNumber < 0) {
                    throw new IllegalArgumentException("Hamster number cannot be negative.");
                }

                System.out.println("Enter hamster name:");
                String hamsterName = scanner.nextLine();

                Hamster hamster = new Hamster(hamsterNumber);
                hamster.setName(hamsterName);
                hamsterMap.put(hamsterName, hamster);

                System.out.println("Hamster added: " + hamster.hamsterNumber());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Hamster number must be an integer.");
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid input. " + e.getMessage());
            }

            System.out.println("Do you want to add another hamster? (y/n)");
            String answer = scanner.nextLine();
            if (!answer.toLowerCase().equals("y")) {
                break;
            }
        }

        Printer.printAll(hamsterMap);
    }
}
