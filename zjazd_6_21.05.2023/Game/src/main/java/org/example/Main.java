package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.example.entity.General;
import org.example.service.GeneralService;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        final String SAVE_FILE_PATH = "src/main/resources/general1_save.json";
        final String SAVE_FILE_PATH2 = "src/main/resources/general2_save.json";
        General general1 = new General();
        General general2 = new General();
        try (Reader reader = new FileReader(SAVE_FILE_PATH)) {
            Gson gson = new GsonBuilder()
                    .create();

            general1 = gson.fromJson(reader, General.class);
            if (general1 != null) {
                System.out.println("Game loaded successfully!");
            } else {
                general1 = new General();
                System.out.println("Failed to load game.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (Reader reader = new FileReader(SAVE_FILE_PATH)) {
            Gson gson = new GsonBuilder()
                    .create();

            general1 = gson.fromJson(reader, General.class);
            if (general2 != null) {
                System.out.println("Game loaded successfully!");
            } else {
                general2 = new General();
                System.out.println("Failed to load game.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        GeneralService generalService = new GeneralService();

        System.out.println("General 1");
        generalService.buySoldier(general1);
        generalService.maneuvers(general1);

        System.out.println("General 2");
        generalService.buySoldier(general2);
        generalService.maneuvers(general2);

        generalService.fight(general1, general2);

        try (OutputStream os = new FileOutputStream(SAVE_FILE_PATH);
             Writer writer = new OutputStreamWriter(os)) {
            Gson gson = new GsonBuilder().create();
            gson.toJson(general1, writer);
            System.out.println("Game saved successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (OutputStream os = new FileOutputStream(SAVE_FILE_PATH2);
             Writer writer = new OutputStreamWriter(os)) {
            Gson gson = new GsonBuilder().create();
            gson.toJson(general2, writer);
            System.out.println("Game saved successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}