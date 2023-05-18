class Hamster implements Comparable<Hamster> {
    private final int hamsterNumber;
    private String name;

    Hamster(int i) {
        hamsterNumber = i;
    }

    public String hamsterNumber() {
        return "This is Hamster #" + hamsterNumber + ", name: " + name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Hamster other) {
        return Integer.compare(this.hamsterNumber, other.hamsterNumber);
    }
}
