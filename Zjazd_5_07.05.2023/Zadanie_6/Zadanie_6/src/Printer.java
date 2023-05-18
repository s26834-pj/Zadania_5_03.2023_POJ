import java.util.List;

class Printer {
    static void printAll(List<Hamster> hamsterList) {
        for (Hamster hamster : hamsterList) {
            System.out.println(hamster.hamsterNumber());
        }
    }
}
