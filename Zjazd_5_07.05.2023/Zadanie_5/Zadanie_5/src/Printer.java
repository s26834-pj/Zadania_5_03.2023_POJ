import java.util.Map;

class Printer {
    static void printAll(Map<String, Hamster> hm) {
        for(String key: hm.keySet()) {
            Hamster hamster = hm.get(key);
            System.out.println(key + ": " + hamster.hamsterNumber());
        }
    }
}
