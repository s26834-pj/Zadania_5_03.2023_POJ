package org.example.service;

import org.example.entity.MilitaryRank;
import org.example.entity.Soldier;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class SoldierServiceTest {
    SoldierService soldierService;
    Soldier soldier;

    @BeforeEach
    void setup() {
        MilitaryRank militaryRank = new MilitaryRank(1, "Private");
        soldier = new Soldier(militaryRank);
        soldierService = new SoldierService();
    }

    @Test
    void soldierRankUp_withoutParameters_returnsTrue() {
        //given
        soldier.setExperience(5);
        //when
        soldierService.soldierRankUp(soldier);
        //then
        assertEquals(2, soldier.getMilitaryRank().getValue());
    }

    @Test
    void soldierRankUp_withoutParameters_returnsFalse() {
        //given
        soldier.setExperience(2);
        //when
        soldierService.soldierRankUp(soldier);
        //then
        assertNotEquals(2, soldier.getMilitaryRank().getValue());
    }
}