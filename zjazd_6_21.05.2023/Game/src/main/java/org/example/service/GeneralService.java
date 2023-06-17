package org.example.service;

import org.example.entity.General;
import org.example.entity.MilitaryRank;
import org.example.entity.Soldier;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GeneralService {
    SoldierService soldierService = new SoldierService();
    public void maneuvers(General general) {
        Scanner scanner = new Scanner(System.in);
        int cost = 0;
        System.out.println("You want to use maneuvers on all army or part?");
        System.out.println("1. All");
        System.out.println("2. Part");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> {
                List<Soldier> army = general.getArmy();
                for (Soldier soldier : army) {
                    cost += soldier.getMilitaryRank().getValue();
                    soldier.setExperience(soldier.getExperience() + 1);
                    soldierService.soldierRankUp(soldier);
                }
                general.setCash(general.getCash() - cost);
                System.out.println("All army experience increase by 1");
            }
            case 2 -> {
                System.out.println("Which rank soldiers will be on maneuvers?");
                scanner = new Scanner(System.in);
                int rank = scanner.nextInt();
                if (rank == 1) {
                    List<Soldier> army = general.getArmy().stream()
                            .filter(soldier -> soldier.getMilitaryRank().getValue() == 1)
                            .toList();
                    for (Soldier soldier : army) {
                        cost += soldier.getMilitaryRank().getValue();
                        soldier.setExperience(soldier.getExperience() + 1);
                        soldierService.soldierRankUp(soldier);
                    }
                    general.setCash(general.getCash() - cost);
                    System.out.println("All soldiers with rank Private experience increase by 1");
                } else if (rank == 2) {
                    List<Soldier> army = general.getArmy().stream()
                            .filter(soldier -> soldier.getMilitaryRank().getValue() == 2)
                            .toList();
                    for (Soldier soldier : army) {
                        cost += soldier.getMilitaryRank().getValue();
                        soldier.setExperience(soldier.getExperience() + 1);
                        soldierService.soldierRankUp(soldier);
                    }
                    general.setCash(general.getCash() - cost);
                    System.out.println("All soldiers with rank Corporal experience increase by 1");
                }  else if (rank == 3) {
                    List<Soldier> army = general.getArmy().stream()
                            .filter(soldier -> soldier.getMilitaryRank().getValue() == 3)
                            .toList();
                    for (Soldier soldier : army) {
                        cost += soldier.getMilitaryRank().getValue();
                        soldier.setExperience(soldier.getExperience() + 1);
                        soldierService.soldierRankUp(soldier);
                    }
                    general.setCash(general.getCash() - cost);
                    System.out.println("All soldiers with rank Capitan experience increase by 1");
                }  else if (rank == 4) {
                    List<Soldier> army = general.getArmy().stream()
                            .filter(soldier -> soldier.getMilitaryRank().getValue() == 4)
                            .toList();
                    for (Soldier soldier : army) {
                        cost += soldier.getMilitaryRank().getValue();
                        soldier.setExperience(soldier.getExperience() + 1);
                    }
                    general.setCash(general.getCash() - cost);
                    System.out.println("All soldiers with rank Major experience increase by 1");
                }
            }
        }
    }

    public void fight(General general1, General general2) {
        int general1Power = 0;
        List<Soldier> armyGeneral1 = general1.getArmy();
        for (Soldier soldier : armyGeneral1) {
            general1Power += soldierService.soldierPower(soldier);
        }

        int general2Power = 0;
        List<Soldier> armyGeneral2 = general2.getArmy();
        for (Soldier soldier : armyGeneral2) {
            general2Power += soldierService.soldierPower(soldier);
        }

        if (general1Power > general2Power) {
            general1.setCash(general1.getCash() + (general2.getCash() * 0.9));
            for (Soldier soldier : armyGeneral1) {
                soldier.setExperience(soldier.getExperience() + 1);
                soldierService.soldierRankUp(soldier);
            }
            general2.setCash(general2.getCash() * 0.9);
            for (Soldier soldier : armyGeneral2) {
                soldier.setExperience(soldier.getExperience() - 1);
                soldierService.soldierLife(soldier);
            }
            System.out.println("General 1 won");
        } else if (general1Power < general2Power) {
            general2.setCash(general2.getCash() + (general1.getCash() * 0.9));
            for (Soldier soldier : armyGeneral2) {
                soldier.setExperience(soldier.getExperience() + 1);
                soldierService.soldierRankUp(soldier);
            }
            general1.setCash(general1.getCash() * 0.9);
            for (Soldier soldier : armyGeneral1) {
                soldier.setExperience(soldier.getExperience() - 1);
                soldierService.soldierLife(soldier);
            }
            System.out.println("General 2 won");
        } else {
            Random random = new Random();
            armyGeneral1.remove(random.nextInt(armyGeneral1.size()));
            general1.setArmy(armyGeneral1);
            random = new Random();
            armyGeneral2.remove(random.nextInt(armyGeneral2.size()));
            general2.setArmy(armyGeneral2);
            System.out.println("It is a tie");
        }
    }
    public void buySoldier(General general) {
        MilitaryRank privateRank = new MilitaryRank(1, "Private");
        MilitaryRank corporalRank = new MilitaryRank(2, "Corporal");
        MilitaryRank capitanRank = new MilitaryRank(3, "Capitan");
        MilitaryRank majorRank = new MilitaryRank(4, "Major");
        List<Soldier> army = general.getArmy();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which soldier you want to buy?");
        System.out.println("1. Private");
        System.out.println("2. Corporal");
        System.out.println("3. Capitan");
        System.out.println("4. Major");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> {
                Soldier soldier = new Soldier(privateRank);
                soldier.setPower(soldierService.soldierPower(soldier));
                army.add(soldier);
                int cost = soldier.getMilitaryRank().getValue() * 10;
                general.setCash(general.getCash() - cost);
                System.out.println("Private soldier bought, it cost: " + cost);
            }
            case 2 -> {
                Soldier soldier = new Soldier(corporalRank);
                soldier.setPower(soldierService.soldierPower(soldier));
                army.add(soldier);
                int cost = soldier.getMilitaryRank().getValue() * 10;
                general.setCash(general.getCash() - cost);
                System.out.println("Corporal soldier bought, it cost: " + cost);
            }
            case 3 -> {
                Soldier soldier = new Soldier(capitanRank);
                soldier.setPower(soldierService.soldierPower(soldier));
                army.add(soldier);
                int cost = soldier.getMilitaryRank().getValue() * 10;
                general.setCash(general.getCash() - cost);
                System.out.println("Capitan soldier bought, it cost: " + cost);
            }
            case 4 -> {
                Soldier soldier = new Soldier(majorRank);
                soldier.setPower(soldierService.soldierPower(soldier));
                army.add(soldier);
                int cost = soldier.getMilitaryRank().getValue() * 10;
                general.setCash(general.getCash() - cost);
                System.out.println("Major soldier bought, it cost: " + cost);
            }
        }
    }
}
