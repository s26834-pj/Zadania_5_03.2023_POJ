package org.example.service;

import org.example.entity.MilitaryRank;
import org.example.entity.Soldier;

public class SoldierService {

    public int soldierPower(Soldier soldier) {
        return soldier.getMilitaryRank().getValue() * soldier.getExperience();
    }
    public void soldierLife(Soldier soldier) {
        if (soldier.getExperience() <= 0) {
            soldier.setAlive(false);
        }
    }
    public void soldierRankUp(Soldier soldier) {
        MilitaryRank corporalRank = new MilitaryRank(2, "Corporal");
        MilitaryRank capitanRank = new MilitaryRank(3, "Capitan");
        MilitaryRank majorRank = new MilitaryRank(4, "Major");
        if (soldier.getExperience() >= (soldier.getMilitaryRank().getValue() * 5) && soldier.getMilitaryRank().getValue() == 1) {
            soldier.setExperience(1);
            soldier.setMilitaryRank(corporalRank);
        } else if (soldier.getExperience() >= (soldier.getMilitaryRank().getValue() * 5) && soldier.getMilitaryRank().getValue() == 2) {
            soldier.setExperience(1);
            soldier.setMilitaryRank(capitanRank);
        } else if (soldier.getExperience() >= (soldier.getMilitaryRank().getValue() * 5) && soldier.getMilitaryRank().getValue() == 3) {
            soldier.setExperience(1);
            soldier.setMilitaryRank(majorRank);
        }
    }
}
