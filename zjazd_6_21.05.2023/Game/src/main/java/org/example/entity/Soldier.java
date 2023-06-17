package org.example.entity;

import org.example.entity.MilitaryRank;
import org.example.service.SoldierService;

public class Soldier {
    MilitaryRank militaryRank;
    int experience;
    int power;
    boolean isAlive;

    public Soldier(MilitaryRank militaryRank) {
        this.militaryRank = militaryRank;
        this.experience = 1;
        this.isAlive = true;
    }

    public MilitaryRank getMilitaryRank() {
        return militaryRank;
    }

    public void setMilitaryRank(MilitaryRank militaryRank) {
        this.militaryRank = militaryRank;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }
}
