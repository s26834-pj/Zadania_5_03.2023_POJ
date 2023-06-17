package org.example.entity;

public class MilitaryRank {
    int value;
    String rank;

    public MilitaryRank() {
        this.value = 1;
        this.rank = "Private";
    }

    public MilitaryRank(int value, String rank) {
        this.value = value;
        this.rank = rank;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}
