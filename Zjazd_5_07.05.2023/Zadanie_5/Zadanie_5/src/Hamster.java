class Hamster {
    private final int hamsterNumber;
    private String name;

    Hamster(int i) { hamsterNumber = i; }

    public String hamsterNumber() {
        return "This is Hamster #" + hamsterNumber + ", name: " + name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

