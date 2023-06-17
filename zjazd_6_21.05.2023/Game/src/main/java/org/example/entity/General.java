package org.example.entity;

import java.util.ArrayList;
import java.util.List;

public class General {
    List<Soldier> army;
    double cash;

    public General() {
        this.army = new ArrayList<>();
        this.cash = 100;
    }

    public List<Soldier> getArmy() {
        return army;
    }

    public void setArmy(List<Soldier> army) {
        this.army = army;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }
}
