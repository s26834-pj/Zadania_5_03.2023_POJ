public class Main {
    public static void main(String[] args) {
        int[] scores = {30, 77, 94, 100};
        TestScores testScores = new TestScores(scores);

        try {
            double averageScore = testScores.getAverageScore();
            System.out.println("Średni wynik testu: " + averageScore);
        } catch (IllegalArgumentException e) {
            System.out.println("Błąd: " + e.getMessage());
        }
    }
}
