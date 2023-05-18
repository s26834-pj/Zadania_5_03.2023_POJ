public class TestScores {
    private final int[] scores;

    public TestScores(int[] scores) {
        this.scores = scores;
    }

    public double getAverageScore() throws IllegalArgumentException {
        int sum = 0;
        for (int score : scores) {
            if (score < 0 || score > 100) {
                throw new IllegalArgumentException("Wynik testu musi być w przedziale od 0 do 100.");
            }
            sum += score;
        }
        return (double) sum / scores.length;
    }
}
