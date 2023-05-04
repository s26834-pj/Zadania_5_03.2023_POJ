package entities.loggers;

import entities.enums.EventSource;
import entities.enums.Severity;
import interfaces.Logger;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class FileLogger implements Logger {

    @Override
    public void LogMessage(Severity logLevel, EventSource eventSource, String message) {

        try {
            PrintWriter zapis = new PrintWriter(new FileWriter("LogFile.txt", true));
            zapis.println("Komunikat o zdarzeniu: " + message + ", Zrodlo informacji: " + eventSource + " Poziom zagrozenia: " + logLevel);
            zapis.close();
        } catch (IOException e) {
            System.out.println("Wystąpił błąd podczas zapisywania do pliku.");
            e.printStackTrace();
        }

    }
}
