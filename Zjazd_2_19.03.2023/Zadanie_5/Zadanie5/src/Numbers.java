public class Numbers {
    private final int num1;
    private final int num2;
    private final int num3;

    public Numbers(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public int sum() {
        return num1 + num2 + num3;
    }

    public double average() {
        return (double) (num1 + num2 + num3) / 3;
    }

    public int min() {
        int min = num1;
        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }
        return min;
    }

    public int max() {
        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        return max;
    }

    public double geometric() {
        return Math.pow(num1 * num2 * num3, 1.0 / 3);
    }
}
